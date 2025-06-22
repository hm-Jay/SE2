import java.util.HashSet;
import java.util.Set;

public class Zoo {

    private Set<Tier> tierListe;

    public Zoo(){
        tierListe = new HashSet<>();
    }

    public void addTier(Tier tier){
        tierListe.add(tier);
    }

    public void removeTier(Tier tier){
        tierListe.remove(tier);
    }

    public void bestandAusgeben(){
        for(Tier tier:tierListe){
            System.out.println(tier.toString());
        }
    }

    public void aufschrei(){
        for(Tier tier:tierListe){
            System.out.println(tier.aussprache());
        }
    }
}
