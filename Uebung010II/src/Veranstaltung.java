import java.util.ArrayList;
import java.util.List;

public class Veranstaltung {
    private Zeitblock zeitblock;
    private String titel;
    private String beschreibung;
    private Raum veranstaltungsraum;
    private List<Person> teilnehmerliste;

    public Veranstaltung(Zeitblock zeitblock, String titel, String beschreibung, Raum veranstaltungsraum){
        this.zeitblock = zeitblock;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.veranstaltungsraum = veranstaltungsraum;
        teilnehmerliste = new ArrayList<>();
    }

    public boolean addTeilnehmer(Person teilnehmer){
        if(veranstaltungsraum.getKapa() > teilnehmerliste.size() ){
            teilnehmerliste.add(teilnehmer);
            return true;
        } else {
            System.out.println("Veranstaltung ist voll");
            return false;
        }
    }

    @Override
    public String toString(){
        String toString = titel + "Zeit: " + zeitblock.toString() + " Beschreibung:" + beschreibung + " Raum:" + veranstaltungsraum.toString() + " \n";
        toString = toString + "Teilnehmer \n";
        for(Person person:teilnehmerliste){
            toString = toString + person.getNamen() + "\n";
        }
        return toString;
    }
}
