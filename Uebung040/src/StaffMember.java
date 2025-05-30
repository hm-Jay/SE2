
public class StaffMember extends HMResource{
    private final String role;

    public StaffMember(String id, String titel, String role){
        super(id, titel);
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    @Override
    public String toString() {
        return "StaffMember: " + getTitel() + " (" + getId() + "), Rolle: " + role;
    }

}
