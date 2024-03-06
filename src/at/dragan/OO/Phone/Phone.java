package at.dragan.OO.Phone;

public class Phone {
    private String color;
    private SDCard SD;

    private SIM SIM;
    private Camera Camera;

    public Phone(String color, SDCard SD, at.dragan.OO.Phone.SIM SIM, at.dragan.OO.Phone.Camera camera) {
        this.color = color;
        this.SD = SD;
        this.SIM = SIM;
        Camera = camera;
    }
    public void takePicture(){
        Camera.makePicture();
    }
    public void makeCall(String number){
        SIM.doCall(number);
    }
    public int getFreeSpace(){
        return SD.getFreeSpace();
    }
    public void pritnAllFiles(){
        SD.getAllFiles();
    }
    public void saveFile(PhoneFile file){
        SD.saveFile(file);
    }
}

