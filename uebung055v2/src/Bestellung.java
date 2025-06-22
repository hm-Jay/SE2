import java.util.Set;

public class Bestellung {

    private Set<String> produktnamen;
    private String bestellNummer;

    public Bestellung(String bestellNummer, Set<String> produktnamen){

        this.produktnamen =produktnamen;
        this.bestellNummer = bestellNummer;
    }

    public Set<String> getProduktnamen(){
        return produktnamen;
    }

    public String getBestellNummer(){
        return bestellNummer;
    }

    public void addProdukt(String produkt){
        produktnamen.add(produkt);
    }

    @Override
    public String toString(){

        return bestellNummer + ": " + produktnamen;
    }
}
