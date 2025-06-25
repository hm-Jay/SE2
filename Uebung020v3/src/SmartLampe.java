public class SmartLampe implements SmartDevice{
    final private String name;
    private int dimmLevel;
    private boolean eingeschaltet;

    public SmartLampe(String name) {
        this.name = name;
        this.dimmLevel = 100;
        this.eingeschaltet = false;
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
        this.eingeschaltet = false;
        this.dimmLevel = 100;
    }

    public int getDimmLevel() {
        return dimmLevel;
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }

    public void setDimmLevel(int dimmLevel){
        if (dimmLevel<101 && dimmLevel >= 0){
            this.dimmLevel = dimmLevel;
        } else {
            throw new IllegalArgumentException("Dimmlevel ist nicht korrekt");
        }
    }

    @Override
    public String getStatus() {
        return "Gerät: " + getName() + " Eingeschaltet?: " + isEingeschaltet() + " DimmLevel" + getDimmLevel();
    }
}
