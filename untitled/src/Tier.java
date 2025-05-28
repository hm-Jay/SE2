import java.time.Duration;
import java.time.OffsetDateTime;

public abstract class Tier {
    private final String id;
    private final OffsetDateTime geburtsdatum;

    public Tier(String id, OffsetDateTime geburtsdatum) {
        this.id = id;
        this.geburtsdatum = geburtsdatum;
    }

    public abstract String aussprache();
    public abstract String ernaehrungtyp();

    public long getAlter() {
        return Math.abs(Duration.between(OffsetDateTime.now(), getGeburtsdatum()).toDays());
    }
    public String toString() {
        return id + " " + getAlter()/30 + " " + aussprache() + " " + ernaehrungtyp();
    }
    public String getId() {
        return id;
    }
    public OffsetDateTime getGeburtsdatum() {
        return geburtsdatum;
    }

}
