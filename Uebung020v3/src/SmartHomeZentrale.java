import java.util.ArrayList;
import java.util.List;

public class SmartHomeZentrale {
    List<SmartDevice> smartDevicesList;

    public SmartHomeZentrale(){
        smartDevicesList = new ArrayList<>();
    }

    public void addSmartDevice(SmartDevice smartDevice){
        if (!smartDevicesList.contains(smartDevice)) {
            smartDevicesList.add(smartDevice);
        }
    }

    public void gerateAusschalten(){
        for (SmartDevice smartDevice:smartDevicesList){
            smartDevice.ausschalten();
        }
    }

    public void gerateAnschalten(){
        for (SmartDevice smartDevice:smartDevicesList){
            smartDevice.einschalten();
        }
    }

    public void zustandAllerGeraeteAusgeben(){
        for (SmartDevice smartDevice:smartDevicesList){
            System.out.println(smartDevice.getStatus() +"\n");
        }
    }

    public void geraetSuchenUndXSetzen(String name, int x) {
        for (SmartDevice smartDevice : smartDevicesList) {
            if (smartDevice.getName().equals(name)) {
                if (smartDevice instanceof SmartLampe) {
                    ((SmartLampe) smartDevice).setDimmLevel(x);
                } else if (smartDevice instanceof SmartHeizung) {
                    ((SmartHeizung) smartDevice).setTemp(x);
                } else if (smartDevice instanceof SmartKuehlschrank) {
                    ((SmartKuehlschrank) smartDevice).setTemp(x);
                }
                return; // Sobald gefunden, abbrechen
            }
        }
        System.out.println("Kein Gerät mit dem Namen '" + name + "' gefunden.");
    }


    public SmartDevice suchenSD(String sName){
        for (SmartDevice smartDevice:smartDevicesList){
            if (smartDevice.getName().equals(sName)){
                return smartDevice;
            }
        }
        return null;
    }
}

