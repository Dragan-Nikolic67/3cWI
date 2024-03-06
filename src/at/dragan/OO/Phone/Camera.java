package at.dragan.OO.Phone;

public class Camera {
    int resolution;
    SDCard sdCard;

    public Camera(int resolution, SDCard sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    public void makePicture(){
        PhoneFile testPicture = new PhoneFile("png", 10, "testPicture");
        sdCard.saveFile(testPicture);
    }
}
