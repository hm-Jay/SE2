public class SmartHeizung implements SmartDevice {
    private String name;
    private boolean eingeschaltet;
    private int temperatur;

    public SmartHeizung(String name) {
        this.name = name;
        this.eingeschaltet = false;
        this.temperatur = 20; // Standardtemperatur
    }

    public void temperaturSetzen(int grad) {
        this.temperatur = grad;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void einschalten() {
        eingeschaltet = true;
    }

    @Override
    public void ausschalten() {
        eingeschaltet = false;
    }

    @Override
    public void reset() {
        eingeschaltet = false;
        temperatur = 20;
    }

    @Override
    public String getStatus() {
        return "SmartHeizung '" + name + "' ist " + (eingeschaltet ? "eingeschaltet" : "ausgeschaltet") +
                ", Temperatur: " + temperatur + "°C";
    }
}
