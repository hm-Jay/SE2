public abstract class HMResource {

    private String id;
    private String titel;

    protected HMResource(String id, String titel){
        if(id.isEmpty() || titel.isEmpty()){
            throw new RuntimeException("Die Angaben dürfen nicht leer sein");
        }
        this.id = id;
        this.titel = titel;
    }

    public String getId(){
        return id;
    }

    public String getTitel(){
        return titel;
    }

    public boolean searchInthisResource(String searchFor){
        if(getId().equals(searchFor) || getTitel().equals(searchFor)){
            return true;
        }
        return false;
    };

}
