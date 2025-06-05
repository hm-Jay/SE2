import java.util.ArrayList;
import java.util.List;

public class SmartKuehlschrank implements SmartDevice{
    private final String name;
    private boolean an;
    private int temperatur;
    private final List<String> lebensmittel;

    public SmartKuehlschrank(String name){
        this.name = name;
        this.an = false;
        this.temperatur = 4;
        this.lebensmittel = new ArrayList<>();
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
        temperatur = 4;
    }

    public void addlebensmittel(String objekt){
        lebensmittel.add(objekt);
    }

    public void removelebensmittel(String objekt){
        lebensmittel.remove(objekt);
    }

    @Override
    public String getStatus() {

        return "Heizung:" + name + "Eingeschaltet" + an + "Temp:" + temperatur + "grad" + lebensmittel.toString();
    }
}
