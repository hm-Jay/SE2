public class SmartLampe implements SmartDevice {

    String name;
    int dimmen;
    boolean an;

    public SmartLampe(String name){
        this.name = name;
        this.dimmen = 100;
        this.an = true;
    }

    @Override
    public String getName(){
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

    public void setDimmen(int dimmLevel){
        if (dimmLevel>100 || dimmLevel<0){
            System.out.println("Dimmlevel nicht korrekt");
        }else dimmen = dimmLevel;
    }

    @Override
    public void reset(){
        dimmen = 100;
        an = false;
    }

    @Override
    public String getStatus(){
        String string = " Gerät:" + name + " Eingeschaltet" + an + " Dimmlevel" + dimmen;
        return string;
    }
}
