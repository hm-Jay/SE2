import java.util.ArrayList;
import java.util.List;

public class ResourceManagement {
    private List<HMResource> hmResources;

    public ResourceManagement() {
        hmResources = new ArrayList<HMResource>();
    }

    public void addHMResource(HMResource hmResource) {
        for(HMResource hmResource1 : hmResources) {
            if(hmResource1.equals(hmResource)) {
                System.out.println(hmResource + "is already in the list");
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
}
