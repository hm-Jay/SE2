import java.util.Set;

public class Bestellung {
    private Set<String> produktnamen;
    private String bestellnummer;

    public Bestellung(Set<String> produktnamen, String bestellnummer) {
        this.produktnamen = produktnamen;
        this.bestellnummer = bestellnummer;
    }
    public Set<String> getProduktnamen() {
        return produktnamen;
    }
    public String getBestellnummer() {
        return bestellnummer;
    }

    public boolean removeproduct(String productname) {
        if(!produktnamen.contains(productname)) {
            return false;
        }
        return produktnamen.remove(productname);
    }

}
