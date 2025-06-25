import java.util.ArrayList;
import java.util.List;

public class SmartKuehlschrank implements SmartDevice {
    final private String name;
    private int temp;
    private boolean eingeschaltet;
    List<String> lebensmittelListe;

    public SmartKuehlschrank(String name) {
        this.name = name;
        this.temp = 10;
        this.eingeschaltet = false;
        lebensmittelListe = new ArrayList<>();
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
        if (temp>20 || temp < -20) throw new IllegalArgumentException("Temp istt falsch");
        this.temp = temp;
    }

    @Override
    public String getStatus() {
        StringBuilder builder = new StringBuilder("Lebensmittel \n");
        for (String l:lebensmittelListe){
            builder.append(l +"\n");
        }
        return "Gerät: " + getName() + " Eingeschaltet?: " + isEingeschaltet() + " Temp:" + getTemp() + builder.toString();
    }

    public void addLebensmittel(String lebensmittel){
        lebensmittelListe.add(lebensmittel);
    }

    public void removeLebensmittel(String lebensmittel){
        lebensmittelListe.remove(lebensmittel);
    }
}
