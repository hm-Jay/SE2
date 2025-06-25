import java.util.HashSet;
import java.util.Set;

public class Zoo {

    Set<Tier> tiere;

    public Zoo(){
        tiere = new HashSet<>();
    }

    public void bestandAusgeben(){
        for (Tier tier:tiere){
            System.out.println(tier.toString());
        }
    }

    public void auffschrei(){
        for (Tier tier:tiere){
            System.out.println(tier.aussprache());
        }
    }
    public void tierHinzufuegen(Tier tier) {
        tiere.add(tier);
    }

    public void tierEntfernen(Tier tier) {
        tiere.remove(tier);
    }


    public void typ(){
        for (Tier tier:tiere){
            System.out.println(tier.ernaehrungTyp());
        }
    }

}
