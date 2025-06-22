public class Kunde {

    private String email;

    public Kunde(String email){

        validateEmail(email);
        this.email = email;
    }


    private void validateEmail(String email){
        if(email == null || !email.contains("@")) {
            throw new RuntimeException("Email muss @ beinhalten und/oder darf nicht leer sein");
        }
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return getEmail();
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object instanceof Kunde) return this.getEmail().equals(((Kunde) object).getEmail());
        return false;
    }

    @Override
    public int hashCode(){
        return email.hashCode()*31;
    }
}
