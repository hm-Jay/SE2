import java.time.OffsetDateTime;

public class Giraffe extends Tier {

    private double schwanzlange;
    private final String aussprache = " Aiaiaiiaia";
    private final String ernaehrungstyp = "Pflanzenfresser";

    public Giraffe(String id, OffsetDateTime geburtstag, double schwanzlange){
        super(id,geburtstag);
        this.schwanzlange = schwanzlange;
    }

    @Override
    public String aussprache() {
        return aussprache;
    }

    @Override
    public String ernaehrungstyp() {
        return ernaehrungstyp;
    }

    public double getSchwanzlange(){
        return schwanzlange;
    }

    @Override
    public String toString() {
        return super.toString() + " Länge: " + schwanzlange;
    }
}
