public class SmartKuehlschrank implements SmartDevices {
    private String name;
    private boolean eingeschaltet;
    private int temperatur;
    private List<String> lebensmittel;

    public SmartKuehlschrank(String name,int temperatur) {
        this.name = name;
        this.eingeschaltet = false;
        this.temperatur = temperatur;
        this.lebensmittel = new ArrayList<>();
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

    public void lebensmittelHinzufuegen(String item) {
        lebensmittel.add(item);
    }

    public void lebensmittelEntfernen(String item) {
        lebensmittel.remove(item);
    }

    @Override
    public void ausschalten() {
        eingeschaltet = false;
    }

    @Override
    public void reset() {
        eingeschaltet = false;
        temperatur = 5;
        lebensmittel.clear();
    }

    public String getStatus(){
        return "SmartKühlschrank '" + name + "' ist " + (eingeschaltet ? "eingeschaltet" : "ausgeschaltet") +
                ", Temperatur: " + temperatur + "°C, Lebensmittel: " + lebensmittel;
    }
}