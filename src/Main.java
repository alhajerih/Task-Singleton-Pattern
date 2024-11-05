public class Main {
    public static void main(String[] args) {

        IPhoneSettings settings=IPhoneSettings.getInstance();
        {/*Testing brightness and WIFI*/}
        settings.getBrightness();//print defult
        settings.WIFIStatus();//print status which by defult false
        settings.setBrightness(70);// brightness 70
        settings.enableWIFI();//
        settings.disableWIFI();
        settings.WIFIStatus();

        {/*Testing contact*/}
        settings.addContact("hamad");
        settings.addContact("Mohammed");
        settings.getAllContact();
        settings.removeContact("hamad");
        settings.getAllContact();
        {/*Testing volume*/}
        settings.getVolumeLevel();
        settings.setVolumeLevel(10);
    }
}