public class Person {
    private String email;
    private String tNumber;

    public Person (String email, String tNumber){
        validateEmail(email);
        this.email = email;
        this.tNumber = tNumber;
    }


    private void validateEmail(String email){
        if(!email.contains("@")) throw new IllegalArgumentException("Eine Email muss ein @ enthalten");
    }

    public String getEmail(){
        return email;
    }

    public String getNumber() {
        return tNumber;
    }

    @Override
    public int hashCode(){
        return email.hashCode() + tNumber.hashCode() *31;
    }

    @Override
    public boolean equals(Object object){
        if (object == this) return true;
        if (object instanceof Person){
            return this.hashCode() == ((Person) object).hashCode();
        }
        else return false;
    }
}
