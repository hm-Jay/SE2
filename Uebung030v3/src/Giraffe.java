import java.time.OffsetDateTime;

public class Giraffe extends Tier{


    int sL;

    public Giraffe(String name, OffsetDateTime gb, int sL) {
        super(name,gb);
        this.sL = sL;
    }

    @Override
    public String aussprache() {
        return "mumumumu";
    }

    @Override
    public String ernaehrungTyp() {
        return "Pflanzenfresser";
    }

    @Override
    public String toString(){
        return super.toString() + "\n Schwanzlänge:" + sL;
    }
}
