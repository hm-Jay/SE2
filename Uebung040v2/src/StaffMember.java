public class StaffMember extends HMResource {

    private String role;

    public StaffMember(String id, String title, String role){
        super(id,title);
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    @Override
    public boolean searchInthisResource(String searchFor){
        if (super.searchInthisResource(searchFor) || role.equals(searchFor)){
            return true;
        }
        else return false;
    }
}
