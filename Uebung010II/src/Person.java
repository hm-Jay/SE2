public class Person {
    private String namen;
    private String email;
    private String telefonnummer;


    public Person (String namen, String email, String telefonnummer){
        validateemail(email);
        this.namen = namen;
        this.email = email;
        this.telefonnummer = telefonnummer;
    }

    public void validateemail(String email){
        if(email.contains("@")){
            System.out.println("Email ist okay");
        }
        else {
            throw new IllegalArgumentException("Ungültige E-Mail-Adresse: " + email);
        }
    }

    public String getNamen(){
        return namen;
    }

    public String getEmail(){
        return email;
    }

    public String getTelefonnummer(){
        return telefonnummer;
    }
}
