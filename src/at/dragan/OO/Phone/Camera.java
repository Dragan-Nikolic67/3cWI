package at.dragan.OO.Phone;

public class Camera {
    int resolution;

    public enum pictureSize {
        Large,
        Medium,
        Small;
    }

    SDCard sdCard;


    public Camera(int resolution, SDCard sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    public void makePicture(pictureSize size) {
        if (sdCard.getCapacity() > 0) {
            if (size.equals(pictureSize.Small)) {
                PhoneFile smallTestPicture = new PhoneFile("png", 10, "testPictureSmall");
                if (smallTestPicture.getSizeInMB() <= sdCard.getCapacity()) {
                    sdCard.saveFile(smallTestPicture);
                } else {
                    System.out.println(smallTestPicture.getName() + " too big");
                }
            } else if (size.equals(pictureSize.Medium)) {
                PhoneFile mediumTestPicture = new PhoneFile("png", 30, "testPictureMedium");
                if (mediumTestPicture.getSizeInMB() <= sdCard.getCapacity()) {
                    sdCard.saveFile(mediumTestPicture);
                } else {
                    System.out.println(mediumTestPicture.getName() + " too big");
                }
            } else {
                PhoneFile largeTestPicture = new PhoneFile("png", 50, "testPictureLarge");
                if (largeTestPicture.getSizeInMB() <= sdCard.getCapacity()) {
                    sdCard.saveFile(largeTestPicture);
                } else {
                    System.out.println(largeTestPicture.getName() + " too big");
                }

            }
        } else {
            System.out.println("Unable to take a Picture, storage is full!");
        }


    }

    public int getResolution() {
        return resolution;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

}
