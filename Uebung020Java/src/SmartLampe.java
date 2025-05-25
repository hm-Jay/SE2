public class SmartLampe implements SmartDevice{
    private String name;
    private boolean eingeschaltet;
    private int dimmLevel;

    public SmartLampe(String name) {
        this.name = name;
        this.eingeschaltet = false;
        this.dimmLevel = 100;
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

    public void setDimmLevel(int dimmLevel) {
        this.dimmLevel = dimmLevel;
    }

    @Override
    public void reset() {
        eingeschaltet = false;
        dimmLevel = 100;
    }

    @Override
    public String getStatus() {
        return "SmartLampe '" + name + "' ist " + (eingeschaltet ? "eingeschaltet" : "ausgeschaltet") +
                ", Dimm-Level: " + dimmLevel + "%";
    }
}