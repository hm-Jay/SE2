import java.util.ArrayList;
import java.util.List;

public class SmartHomeZentrale {
    private List<SmartDevice> geraete;

    public SmartHomeZentrale(){
        this.geraete = new ArrayList<>();
    }

    public void addgerat(SmartDevice smartDevice){
        geraete.add(smartDevice);
    }

    public void alleeinschalte() {
        for(SmartDevice g : geraete){
            g.einschalten();
        }
    }

    public void alleausschalten() {
        for(SmartDevice g : geraete){
            g.ausschalten();
        }
    }


    public void alleStatusausgeben() {
        for(SmartDevice g : geraete){
            g.getStatus();
        }
    }

    public SmartDevice geraetSuchen(String name){
        String name1;
        name1 = name.toLowerCase();
        for (SmartDevice g : geraete){
            String gnl = g.getName().toLowerCase();
            if(gnl.equals(name1)){
                return g;
            }
        }
        return null;
    }


}
