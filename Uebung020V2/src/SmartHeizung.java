public class SmartHeizung implements SmartDevice {
    private String name;
    private boolean an;
    public int temperatur;

    public SmartHeizung(String name){
        this.name = name;
        this.an = false;
        this.temperatur = 10;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void einschalten(){
        an = true;
    }

    @Override
    public void ausschalten(){
        an = false;
    }

    @Override
    public void reset() {
        an = false;
        temperatur = 10;
    }

    @Override
    public String getStatus() {
        return "Heizung:" + name + "Eingeschaltet" + an + "Temp:" + temperatur + "grad";
    }
}
