public class Computer extends HMResource {

    private final String operatingSystem;
    private final String[] installedSoftware;

    public Computer(String id, String titel, String operatingSystem, String[] installedSoftware) {
        super(id, titel);
        this.operatingSystem = operatingSystem;
        // Defensive Kopie, falls null übergeben wird, initialisieren wir mit leerem Array
        this.installedSoftware = installedSoftware != null ? installedSoftware.clone() : new String[0];
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String[] getInstalledSoftware() {
        // Rückgabe einer Kopie, damit das interne Array nicht von außen verändert wird
        return installedSoftware.clone();
    }

    @Override
    public String toString() {
        return super.toString() + "\nOperating System: " + operatingSystem +
                "\nInstalled Software: " + String.join(", ", installedSoftware);
    }
}
