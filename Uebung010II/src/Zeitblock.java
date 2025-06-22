import java.time.Duration;
import java.time.OffsetDateTime;

public class Zeitblock {
    OffsetDateTime startzeit;
    OffsetDateTime endzeit;

    public Zeitblock(OffsetDateTime startzeit, OffsetDateTime endzeit){
        validateZeitblock(startzeit, endzeit);
        this.startzeit = startzeit;
        this.endzeit = endzeit;
    }

    public void validateZeitblock(OffsetDateTime startzeit, OffsetDateTime endzeit){
        Duration between = Duration.between(startzeit, endzeit);
        long days = between.toDays();
        if (endzeit.isBefore(startzeit)){
            throw new RuntimeException("Startzeit ist nach der Endzeit");
        } else if (days > 7){
            throw new RuntimeException("Zeitblock ist länger als 7 Tage");
        } else {
            System.out.println("Zeitblock ist kleiner als 7 Tage");
        }
    }
}
