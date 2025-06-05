public class SmartLampe implements SmartDevice {
    private String name;
    private boolean an;
    private int dimmLevel;

    public SmartLampe(String name){
        this.name = name;
        this.an = false;
        this.dimmLevel = 100;
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
        dimmLevel = 100;
    }

    @Override
    public String getStatus() {
        return "Lampe:" + name + "Eingeschaltet" + an + "Dimmung?:" +dimmLevel;
    }

}
