
import java.util.ArrayList;
import java.util.List;

public class IPhoneSettings {

    private static volatile IPhoneSettings instance;


    private boolean  WIFI;
    private int Brightness;
    private final List<String> contact;
    private int volumeLevel;
    private IPhoneSettings(){
        //default settings
        WIFI=false;
        Brightness=50;
        contact= new ArrayList<>();
        volumeLevel=0;

    }

    public static synchronized IPhoneSettings getInstance(){
        if(instance==null)
            instance= new IPhoneSettings();

        return instance;
    }



    public void setBrightness(int brightness){
        Brightness=brightness;
        System.out.println("The new brightness is : "+Brightness);
    }
    public void getBrightness(){

        System.out.println("The brightness degree is : "+Brightness);
    }

    public void WIFIStatus(){
        System.out.println("WIFI is : "+WIFI);
    }

    public void enableWIFI(){
        WIFI=true;
        System.out.println("WIFI is enabled : "+WIFI);
    }
    public void disableWIFI(){
        WIFI=false;
        System.out.println("WIFI is disabled : "+WIFI);
    }

    public void getAllContact(){
        System.out.println("My contacts names : "+contact);
    }



    public void addContact(String name){
        contact.add(name);
    }
    public void removeContact(String name){
        contact.remove(name);
    }

    public void getVolumeLevel(){
        System.out.println("Volume : "+volumeLevel+"%");
    }
    public void setVolumeLevel(int vol){
        if(vol<=100 && vol>=0)
            volumeLevel=vol;
        else System.out.println("Invalid volume range should be (100 - 0)");
    }


}
