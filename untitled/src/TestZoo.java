import java.time.OffsetDateTime;

public class TestZoo {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        OffsetDateTime datum1 = OffsetDateTime.parse("2018-12-12T13:30:30+05:00");

        Loewe loewe = new Loewe("L1",datum1,5);

        zoo.tierHinzufuegen(loewe);

        zoo.bestandAusgeben();
        zoo.aufsSchrei();
    }

}
