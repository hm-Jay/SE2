import java.time.Duration;
import java.time.OffsetDateTime;

public abstract class Tier {
    private String id;
    private OffsetDateTime geburtsDatum;

    public abstract String aussprache();

    public abstract String ernaehrungstyp();

    public Tier(String id, OffsetDateTime geburtsdatum){
        this.id = id;
        this.geburtsDatum = geburtsdatum;
    }

    protected long alter(){
        Duration between = Duration.between(geburtsDatum,OffsetDateTime.now());
        long alter = between.toDays();
        if (alter < 0) alter = 0;
        return alter;
    }

    public String getId(){
        return id;
    }

    public OffsetDateTime getGeburtsDatum(){
        return geburtsDatum;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder("TierID ");
        toString.append(id);
        long alter = alter();
        alter = alter/30;
        toString.append(" Alter: ");
        toString.append(alter);
        toString.append(" Laut: ");
        toString.append(aussprache());
        toString.append(" Lieblingsessen: ");
        toString.append(ernaehrungstyp());
        return toString.toString();
    }
}
