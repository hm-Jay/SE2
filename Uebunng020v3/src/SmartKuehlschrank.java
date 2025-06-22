import java.util.ArrayList;
import java.util.List;

public class SmartKuehlschrank implements SmartDevice{

    String name;
    int temperatur;
    boolean an;
    List<String> lebensmittelListe;

    public SmartKuehlschrank(String name){
        this.name = name;
        this.temperatur = 0;
        this.an = true;
        lebensmittelListe = new ArrayList<>();
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

    public void setTemperatur(int grad){
        if (grad>50 || grad<0){
            System.out.println("Temp nicht korrekt");
        }else temperatur = grad;
    }

    @Override
    public void reset(){
        temperatur = 0;
        an = false;
    }

    @Override
    public String getStatus(){
        String string = " Gerät:" + name + " Eingeschaltet" + an + " Temp" + temperatur;
        return string;
    }

    public void addLebensmitte(String lebensmittel){
        lebensmittelListe.add(lebensmittel);
    }

    public void removeLebensmittel(String lebensmittel){
        lebensmittelListe.remove(lebensmittel);
    }

}
