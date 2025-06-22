import java.util.HashSet;
import java.util.Set;

public class SmartHomeZentrale {

    private Set<SmartDevice> geratListe;

    public SmartHomeZentrale() {
        geratListe = new HashSet<>();
    }

    public void addGerat(SmartDevice smartDevice) {
        geratListe.add(smartDevice);
    }

    public void getZustandaller() {
        for (SmartDevice gerat : geratListe) {
            System.out.println(gerat.getStatus());
        }
    }

    public SmartDevice sucheGerat(String geratname) {
        for (SmartDevice smartDevice : geratListe) {
            if (smartDevice.getName().equalsIgnoreCase(geratname)) {
                return smartDevice;
            }
        }
        return null;
    }

    public void alleEinschalten() {
        for (SmartDevice smartDevice : geratListe) {
            smartDevice.einschalten();
        }
    }

    public void alleAusschalten() {
        for (SmartDevice smartDevice : geratListe) {
            smartDevice.ausschalten();
        }
    }
}
