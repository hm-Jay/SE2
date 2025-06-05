import java.util.*;

public class BestellManager {

    private Set<Kunde> kunden;
    private Map<String, Bestellung> bestellungen;
    private Map<Kunde, Set<Bestellung>> bestellungproKunde;

    public BestellManager() {
        kunden = new HashSet<>();
        bestellungen = new HashMap<>();
        bestellungproKunde = new HashMap<>();
    }

    public void addKunde(Kunde kunde) {
        kunden.add(kunde);
    }

    public Kunde sucheKunde(String email) {
        for (Kunde kunde : kunden) {
            if (kunde.getEmail().equals(email))
                return kunde;
        }
        return null;
    }

    public void bestellungZuordnen(Bestellung bestellung, Kunde kunde) {
        if (bestellung == null || kunde == null) {
            System.out.println("Kein Bestellung und/oder Kunde");
            return;
        }
        // Bestellung global speichern
        bestellungen.put(bestellung.getBestellnummer(), bestellung);

        // Bestellung dem Kunden zuordnen
        bestellungproKunde.putIfAbsent(kunde, new HashSet<>());
        bestellungproKunde.get(kunde).add(bestellung);

        // Kunde sicherheitshalber auch hinzufügen (falls noch nicht vorhanden)
        kunden.add(kunde);
    }

    // Produkt nachträglich zu letzter Bestellung des Kunden hinzufügen
    public void addProduktZuLetzterBestellung(Kunde kunde, String produktname) {
        Set<Bestellung> bestellungenVomKunden = bestellungproKunde.get(kunde);
        if (bestellungenVomKunden == null || bestellungenVomKunden.isEmpty()) {
            // Keine Bestellung: Neue Bestellung erzeugen und zuordnen
            Bestellung neueBestellung = new Bestellung(new HashSet<>(), UUID.randomUUID().toString());
            neueBestellung.getProduktnamen().add(produktname);
            bestellungZuordnen(neueBestellung, kunde);
        } else {
            // Letzte Bestellung holen (z.B. über Iterator, da Set keine Reihenfolge)
            Bestellung letzteBestellung = null;
            for (Bestellung b : bestellungenVomKunden) {
                letzteBestellung = b; // am Ende steht letzte
            }
            letzteBestellung.getProduktnamen().add(produktname);
        }
    }

    public Map<String, Integer> berechneProduktbeliebtheit() {
        Map<String, Integer> beliebtheit = new HashMap<>();

        for (Bestellung bestellung : bestellungen.values()) {
            for (String produkt : bestellung.getProduktnamen()) {
                beliebtheit.put(produkt, beliebtheit.getOrDefault(produkt, 0) + 1);
            }
        }

        return beliebtheit;
    }

    public Set<Kunde> mehrfachKunde(){
        Set<Kunde> mehrfachKaeufer = new HashSet<>();

        for (Map.Entry<Kunde, Set<Bestellung>> eintrag : bestellungproKunde.entrySet()){
            if (eintrag.getValue().size() > 1){
                mehrfachKaeufer.add(eintrag.getKey());
            }
        }
        return mehrfachKaeufer;
    }

    public Map<String, Set<Kunde>> produktzuKunde() {
        Map<String, Set<Kunde>> produktKundenMap = new HashMap<>();

        for (Map.Entry<Kunde, Set<Bestellung>> eintrag : bestellungproKunde.entrySet()) {
            Kunde kunde = eintrag.getKey();
            Set<Bestellung> bestellungenDesKunden = eintrag.getValue();

            for (Bestellung bestellung : bestellungenDesKunden) {
                for (String produkt : bestellung.getProduktnamen()) {
                    produktKundenMap.putIfAbsent(produkt, new HashSet<>());
                    produktKundenMap.get(produkt).add(kunde);
                }
            }
        }

        return produktKundenMap;
    }

}
