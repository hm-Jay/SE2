import java.util.ArrayList;
import java.util.List;

public class SmartHomeZentrale {
    private List<SmartDevice> geraete;

    public SmartHomeZentrale() {
        this.geraete = new ArrayList<>();
    }

    // Gerät hinzufügen
    public void geraetHinzufuegen(SmartDevice geraet) {
        geraete.add(geraet);
    }

    // Alle Geräte einschalten
    public void alleEinschalten() {
        for (SmartDevice g : geraete) {
            g.einschalten();
        }
    }

    // Alle Geräte ausschalten
    public void alleAusschalten() {
        for (SmartDevice g : geraete) {
            g.ausschalten();
        }
    }

    // Status aller Geräte ausgeben
    public void geraeteStatusAusgeben() {
        for (SmartDevice g : geraete) {
            System.out.println(g.getStatus());
        }
    }

    // Gerät nach Name suchen
    public SmartDevice geraetSuchen(String name) {
        for (SmartDevice smartDevice : geraete) {
            if (smartDevice.getName().equalsIgnoreCase(name)) {
                return smartDevice;
            }
        }
        return null;
    }
}
