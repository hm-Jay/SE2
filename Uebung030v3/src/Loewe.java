import java.time.OffsetDateTime;

public class Loewe extends Tier{

    int rg;

    public Loewe(String name, OffsetDateTime gb,int rg) {
        super(name,gb);
        this.rg = rg;
    }

    @Override
    public String aussprache() {
        return "Aiaiaiaia";
    }

    @Override
    public String ernaehrungTyp() {
        return "Fleischfresser";
    }

    @Override
    public String toString(){
        return super.toString() + "\n Rudelgröße:" + rg;
    }
}
