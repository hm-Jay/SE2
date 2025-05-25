public class TestSmartHome {
    public static void main(String[] args) {
        // Steuerzentrale anlegen
        SmartHomeZentrale zentrale = new SmartHomeZentrale();

        // Geräte erstellen
        SmartLampe lampe = new SmartLampe("Lampe Schlafzimmer");
        SmartHeizung heizung = new SmartHeizung("Heizung Wohnzimmer");
        SmartKuehlschrank kuehlschrank = new SmartKuehlschrank("Kühlschrank Küche", 4);

        // Geräte hinzufügen
        zentrale.geraetHinzufuegen(lampe);
        zentrale.geraetHinzufuegen(heizung);
        zentrale.geraetHinzufuegen(kuehlschrank);

        // Alle Geräte einschalten
        zentrale.alleEinschalten();
        System.out.println("Nach Einschalten aller Geräte:");
        zentrale.geraeteStatusAusgeben();

        // Lampe dimmen
        SmartDevice g1 = zentrale.geraetSuchen("Lampe Schlafzimmer");
        if (g1 instanceof SmartLampe) {
            ((SmartLampe) g1).setDimmLevel(40);
        }

        // Heizung Temperatur setzen
        SmartDevice g2 = zentrale.geraetSuchen("Heizung Wohnzimmer");
        if (g2 instanceof SmartHeizung) {
            ((SmartHeizung) g2).temperaturSetzen(22);
        }

        // Kühlschrank ausschalten und Temperatur ändern
        SmartDevice g3 = zentrale.geraetSuchen("Kühlschrank Küche");
        if (g3 instanceof SmartKuehlschrank) {
            g3.ausschalten(); // über die Schnittstelle
            ((SmartKuehlschrank) g3).temperaturSetzen(2);
            ((SmartKuehlschrank) g3).lebensmittelHinzufuegen("Milch");
            ((SmartKuehlschrank) g3).lebensmittelHinzufuegen("Butter");
        }

        System.out.println("\nNach gezielter Steuerung einzelner Geräte:");
        zentrale.geraeteStatusAusgeben();

        // Geräte zurücksetzen
        g1.reset();
        g2.reset();
        g3.reset();

        System.out.println("\nNach Reset aller Geräte:");
        zentrale.geraeteStatusAusgeben();
    }
}
