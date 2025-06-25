import java.time.Duration;
import java.time.OffsetDateTime;

public class Zeitblock {
    OffsetDateTime startingTime;
    OffsetDateTime endingTime;

    public Zeitblock(OffsetDateTime startingTime, OffsetDateTime endingTime){

        this.startingTime = startingTime;
        this.endingTime = endingTime;
    }

    private void validateTime(OffsetDateTime startingTime, OffsetDateTime endingTime){
        if(startingTime.isAfter(endingTime)) throw new IllegalArgumentException("Endzeit ist vor Startzeit");
    }

    public OffsetDateTime getStartingTime() {
        return startingTime;
    }

    public OffsetDateTime getEndingTime() {
        return endingTime;
    }
}
