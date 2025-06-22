import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceManagement {

    private List<HMResource> hmResourceList;

    public ResourceManagement(){
        hmResourceList = new ArrayList<>();
    }

    public void addhmResouce(HMResource hmResource){
        hmResourceList.add(hmResource);
    }

    public void deleteHmResource(HMResource hmResource){
        hmResourceList.remove(hmResource);
    }

    public void displayResourceByType(){

        StringBuilder staffmember = new StringBuilder("Staffmember:\n");
        StringBuilder book = new StringBuilder("book:\n");
        StringBuilder computer = new StringBuilder("Computer:\n");

        for(HMResource hmResource:hmResourceList){
            if(hmResource instanceof StaffMember){
                staffmember.append(hmResource.getId()).append("\n");
            } else if(hmResource instanceof Book){
                book.append(hmResource.getId()).append("\n");
            } else {
                computer.append(hmResource.getId()).append("\n");
            }
        }
        System.out.println(staffmember.toString());
        System.out.println(book.toString());
        System.out.println(computer.toString());
    }

    public List<HMResource> searchInResource(String searchFor){
        List<HMResource> result = new ArrayList<>();
        for (HMResource hmResource : hmResourceList){
            if(hmResource.searchInthisResource(searchFor)){
                result.add(hmResource);
            }
        }
        return result;
    }

    public HMResource[] getAllResources(){
        HMResource[] allResources = new HMResource[hmResourceList.size()];
        int x =0;
        for (HMResource hmResource:hmResourceList){
            allResources[x++] = hmResource;
        }

        return allResources;
    }

}
