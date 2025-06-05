import java.util.HashSet;
import java.util.Set;

public class TestBestell {

    public static void main(String[] args) {
        BestellManager manager = new BestellManager();

        // Kunden anlegen
        Kunde kunde1 = new Kunde("alice@mail.com");
        Kunde kunde2 = new Kunde("bob@mail.com");

        manager.addKunde(kunde1);
        manager.addKunde(kunde2);

        // Bestellung 1 für Alice
        Set<String> produkte1 = new HashSet<>();
        produkte1.add("Apfel");
        produkte1.add("Brot");

        Bestellung bestellung1 = new Bestellung(produkte1, "B001");
        manager.bestellungZuordnen(bestellung1, kunde1);

        // Bestellung 2 für Alice
        Set<String> produkte2 = new HashSet<>();
        produkte2.add("Milch");

        Bestellung bestellung2 = new Bestellung(produkte2, "B002");
        manager.bestellungZuordnen(bestellung2, kunde1);

        // Bestellung 1 für Bob
        Set<String> produkte3 = new HashSet<>();
        produkte3.add("Apfel");

        Bestellung bestellung3 = new Bestellung(produkte3, "B003");
        manager.bestellungZuordnen(bestellung3, kunde2);

        // Produkt zu letzter Bestellung hinzufügen
        manager.addProduktZuLetzterBestellung(kunde1, "Käse");
        manager.addProduktZuLetzterBestellung(kunde2, "Milch");

        // === Test: Produktbeliebtheit ===
        System.out.println("\nProduktbeliebtheit:");
        System.out.println(manager.berechneProduktbeliebtheit());

        // === Test: Mehrfachkäufer ===
        System.out.println("\nMehrfachkäufer:");
        for (Kunde k : manager.mehrfachKunde()) {
            System.out.println(k.getEmail());
        }

    }
}
