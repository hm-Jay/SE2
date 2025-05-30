import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
    public void schreibeÜbersichtInDatei(String dateiname) {
        // Baue den Inhalt als String auf
        StringBuilder contentBuilder = new StringBuilder();

        for (HMResource resource : hmResources) {
            contentBuilder.append(resource.toString());
            contentBuilder.append(System.lineSeparator()); // neue Zeile
            contentBuilder.append(System.lineSeparator());
        }

        // Schreibe den Inhalt in die Datei
        try {
            Path path = Path.of(dateiname);
            Files.writeString(path, contentBuilder.toString());
            System.out.println("Datei erfolgreich geschrieben: " + dateiname);
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Datei:");
            e.printStackTrace();
        }
    }
}
