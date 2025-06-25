public class SmartHeizung implements SmartDevice {
    final private String name;
    private int temp;
    private boolean eingeschaltet;

    public SmartHeizung(String name) {
        this.name = name;
        this.temp = 10;
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
        this.temp = 10;
    }

    public int getTemp() {
        return temp;
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }

    public void setTemp(int temp){
        if (temp>20 || temp < 5) throw new IllegalArgumentException("Temp ist falsch");
        this.temp = temp;
    }

    @Override
    public String getStatus() {
        return "Gerät: " + getName() + " Eingeschaltet?: " + isEingeschaltet() + " Temp:" + getTemp();
    }
}
