import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class Zoo {
        private Set<Tier> tiere;
        private List<Tier> tiere2;
        public Zoo() {
            tiere = new HashSet<>();
            tiere2 = new ArrayList<>();
        }


        public void tierHinzufuegen(Tier tier) {
            tiere.add(tier);
            ;
            tiere2.add(tier);
        }

        public void tierEntfernen(Tier tier) {
            tiere.remove(tier);
            tiere2.remove(tier);
        }

        public void bestandAusgeben() {
            for (Tier tier : tiere) {
                System.out.println(tier.toString());
            }
            System.out.println("Tier List version");
            for (Tier tier : tiere2) {
                System.out.println(tier.toString());
            }
        }

        public void aufsSchrei() {
            for (Tier tier : tiere) {
                System.out.println(tier.aussprache());
            }
            System.out.println("Tier List version");
            for (Tier tier : tiere2) {
                System.out.println(tier.aussprache());
            }
        }
    }

