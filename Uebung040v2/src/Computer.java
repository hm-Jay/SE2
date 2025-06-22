import java.util.ArrayList;

public class Computer extends HMResource {

    String operatingSystem;
    String[] installedSoftware;

    public Computer(String id, String titel, String operatingSystem, String[] installedSoftware){
        super(id,titel);
        this.installedSoftware = installedSoftware;
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public String[] getInstalledSoftware(){
        return installedSoftware;
    }

    @Override
    public boolean searchInthisResource(String searchFor){
        if (super.searchInthisResource(searchFor) || operatingSystem.equals(searchFor)){
            return true;
        }

        for (String x:installedSoftware){
            if(x.equals(searchFor)) return true;
        }

        return false;
    }
}
