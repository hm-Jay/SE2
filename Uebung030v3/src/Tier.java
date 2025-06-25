import java.time.Duration;
import java.time.OffsetDateTime;

public abstract class Tier {
    private String id;
    private OffsetDateTime birtday;

    public abstract String aussprache();
    public abstract String ernaehrungTyp();

    protected Tier(String name, OffsetDateTime gb){
        this.id = name;
        this.birtday = gb;
    }
    public long getAlter(){
        Duration duration = Duration.between(birtday,OffsetDateTime.now());
        return Math.abs(duration.toDays());
    }

    @Override
    public String toString(){
        return id + " Geburtstag" + birtday + "\nAlter: " + getAlter() + "\n Assuprache: " + aussprache() + "\nTyp:"+ernaehrungTyp();
    }

}
