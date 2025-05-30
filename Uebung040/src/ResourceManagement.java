import java.util.ArrayList;
import java.util.List;

public class ResourceManagement {
    private List<HMResource> hmResources;

    public ResourceManagement() {
        hmResources = new ArrayList<HMResource>();
    }

    public void addHMResource(HMResource hmResource) {
        if (hmResource ==null) {
            return;
        }
        for(HMResource hmResource1 : hmResources) {
            if(hmResource1.equals(hmResource)) {
                System.out.println(hmResource + "is already in the list");
                return;
            }
        }
        hmResources.add(hmResource);
    }
    public void removeHMResource(HMResource hmResource) {
        hmResources.remove(hmResource);
    }

    public void printHMResources() {
        for(HMResource hmResource : hmResources) {
            System.out.println(hmResource);
        }
    }
    public void displayResourceByType() {
        System.out.println("StaffMember:");
        for (HMResource res : hmResources) {
            if (res instanceof StaffMember) {
                System.out.println("  " + res);
            }
        }

        System.out.println("Book:");
        for (HMResource res : hmResources) {
            if (res instanceof Book) {
                System.out.println("  " + res);
            }
        }

        System.out.println("Computer:");
        for (HMResource res : hmResources) {
            if (res instanceof Computer) {
                System.out.println("  " + res);
            }
        }
    }
    public void searchInResource(String searchFor) {
        for (HMResource res : hmResources) {
            if (res.matchesSearch(searchFor)) {
                System.out.println(res);
            }
        }
    }
    public HMResource[] getAllResources() {
        return hmResources.toArray(new HMResource[0]);
    }
}
