import java.time.OffsetDateTime;

public class Giraffe extends Tier {
    private double schwanzlaenge;

    public Giraffe(String id, OffsetDateTime geburtsdatum, double schwanzlaenge) {
        super(id, geburtsdatum);
        this.schwanzlaenge = schwanzlaenge;
    }

    public double getSchwanzlaenge() {
        return schwanzlaenge;
    }

    @Override
    public String aussprache() {
        return "Aiaiaiaiaia";
    }

    @Override
    public String ernaehrungtyp() {
        return "Pflanzenfresser";
    }

    public String toString() {
        return super.toString() + "\nSchwanzlaenge: " + schwanzlaenge;
    }
}
