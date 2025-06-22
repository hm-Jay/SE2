import java.util.*;

public class BestellManager {

    Set<Kunde> kundeListe;
    Set<Bestellung> bestellungListe;
    Map<Kunde, List<Bestellung>> bestellungenProKunde;

    public BestellManager(){

        kundeListe = new HashSet<>();
        bestellungListe = new HashSet<>();
        bestellungenProKunde = new HashMap<>();

    }

    public Kunde sucheKunde(String email){

        for (Kunde kunde:kundeListe){
            if(kunde.getEmail().equals(email)){
                return kunde;
            }
        }

        return null;
    }

    public void printKunden(){
        for(Kunde kunde:kundeListe){
            System.out.println(kunde.toString());
        }
    }

    public void bestellungZuordnen(Kunde kunde, Bestellung bestellung){
        bestellungListe.add(bestellung);

        if(!bestellungenProKunde.containsKey(kunde)){
            List<Bestellung> temp = new ArrayList<>();
            temp.add(bestellung);
            bestellungenProKunde.put(kunde,temp);
        }else {

            bestellungenProKunde.get(kunde).add(bestellung);

        }
    }

    public void produktHinzufuegen(Kunde kunde, String produktname){

        if (bestellungenProKunde.containsKey(kunde)){
            bestellungenProKunde.get(kunde).getLast().addProdukt(produktname);
        }else {
            kundeListe.add(kunde);
            List<Bestellung> temp = new ArrayList<>();
            Set<String> temp3 = new HashSet<>();
            temp3.add(produktname);
            Bestellung temp2 = new Bestellung(kunde.getEmail() + produktname, temp3);
            bestellungListe.add(temp2);
            temp.add(temp2);
            bestellungenProKunde.put(kunde,temp);
        }

    }

    public boolean deleteKunde(Kunde kunde){
        if (kunde == null) return false;
        kundeListe.remove(kunde);
        bestellungenProKunde.remove(kunde);
        return !bestellungenProKunde.containsKey(kunde);
    }

    public Map<String,Integer> berechneProduktbeliebtheit(){
        Map<String, Integer> produktbeliebtheit = new HashMap<>();
        for (Kunde kunde:bestellungenProKunde.keySet()){
            for(Bestellung bestellung:bestellungenProKunde.get(kunde)){
                for (String produkt: bestellung.getProduktnamen()){
                    produktbeliebtheit.put(produkt,produktbeliebtheit.getOrDefault(produkt,0)+1);

                }
            }
        }
        return produktbeliebtheit;
    }

    public Set<Kunde> mehrfachkaeufer(){
        Set<Kunde> mfk = new HashSet<>();

        for (Kunde kunde: bestellungenProKunde.keySet()){
            if (bestellungenProKunde.get(kunde).size()>1){
                mfk.add(kunde);
            }
        }
        return mfk;
    }

    public void printBestellungenProKunde(){
        for (Kunde kunde:bestellungenProKunde.keySet()){
            System.out.println(kunde + ":");
            for (Bestellung bestellung:bestellungenProKunde.get(kunde)){
                System.out.println(bestellung.toString());
            }
        }
    }
}
