import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Veranstaltung {
    Zeitblock zeitblock;
    String titel;
    String beschreibung;
    Raum veranstaltungRaum;
    List<Person> teilnehmerListe;

    public Veranstaltung(Zeitblock zeitblock,String titel, String beschreibung, Raum veranstaltungRaum){
        this.zeitblock = zeitblock;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.veranstaltungRaum = veranstaltungRaum;
        this.teilnehmerListe = new ArrayList<>();
    }

    public Veranstaltung(Zeitblock zeitblock,String titel, String beschreibung, Raum veranstaltungRaum, List<Person> teilnehmerListe){
        this.zeitblock = zeitblock;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.veranstaltungRaum = veranstaltungRaum;
        this.teilnehmerListe = teilnehmerListe;
    }

    public boolean addTeilnehmer(Person person){
        if(veranstaltungRaum.getCapacity()<= teilnehmerListe.size()) return false;
        teilnehmerListe.add(person);
        return true;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("Veranstaltung: " + titel+ "\n");
        stringBuilder.append(" Beschreibung:" + beschreibung+ "\n");
        stringBuilder.append(" Raum: " + veranstaltungRaum.getRoomNumber()+ "\n");
        stringBuilder.append(" Startzeit: "+ zeitblock.startingTime.toString() + " Endzeit:" + zeitblock.getEndingTime().toString()+ "\n");
        stringBuilder.append("Teilnehmer: \n" );

        for (Person person:teilnehmerListe){
            stringBuilder.append(person.getEmail() +":"+ person.getNumber()+ "\n");
        }
        return stringBuilder.toString();
    }
}
