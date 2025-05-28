import java.time.OffsetDateTime;

public class Loewe extends Tier {
    private int rudelgroeße;

    public Loewe(String id, OffsetDateTime geburtsdatum, int rudelgroeße) {
        super(id, geburtsdatum);
        this.rudelgroeße = rudelgroeße;

    }

    @Override
    public String aussprache() {
        return "Woar";
    }

    @Override
    public String ernaehrungtyp() {
        return "Fleischfresser";
    }

    @Override
    public String toString() {
        return super.toString() + "Rudelgröße" + rudelgroeße;
    }

    public int getRudelgroeße() {
        return rudelgroeße;
    }
}
