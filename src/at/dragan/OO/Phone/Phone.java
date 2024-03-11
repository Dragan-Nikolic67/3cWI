package at.dragan.OO.Phone;

public class Phone {
    private String color;
    private SDCard SD;

    private SIM SIM;
    private Camera Camera;

    public enum pictureSize {
        Large,
        Medium,
        Small;
    }

    public Phone(String color, SDCard SD, at.dragan.OO.Phone.SIM SIM, at.dragan.OO.Phone.Camera camera) {
        this.color = color;
        this.SD = SD;
        this.SIM = SIM;
        Camera = camera;
    }

    public void takePicture(pictureSize size) {
        if (size.equals(pictureSize.Small)) {
            Camera.makePicture(at.dragan.OO.Phone.Camera.pictureSize.Small);
        } else if (size.equals(pictureSize.Medium)) {
            Camera.makePicture(at.dragan.OO.Phone.Camera.pictureSize.Medium);
        } else {
            Camera.makePicture(at.dragan.OO.Phone.Camera.pictureSize.Large);
        }


    }

    public void makeCall(String number) {
        SIM.doCall(number);
    }

    public int getFreeSpace() {
        return SD.getFreeSpace();
    }

    public void pritnAllFiles() {
        SD.getAllFiles();
    }

    public void deleteFile(PhoneFile file) {
        SD.deleteFile(file);
    }

    public String getColor() {
        return color;
    }

    public SDCard getSD() {
        return SD;
    }

    public at.dragan.OO.Phone.SIM getSIM() {
        return SIM;
    }

    public at.dragan.OO.Phone.Camera getCamera() {
        return Camera;
    }

    public void saveFile(PhoneFile file) {
        SD.saveFile(file);

    }
}

