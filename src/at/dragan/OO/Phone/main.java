package at.dragan.OO.Phone;

public class main {
    public static void main(String[] args) {
        PhoneFile f1 = new PhoneFile("java", 50, "DemmlSemmk");
        PhoneFile f2 = new PhoneFile("java", 50, "test");
        PhoneFile f3 = new PhoneFile("java", 50, "test");
        SDCard SD = new SDCard(3000);
        Camera c1 = new Camera(3000, SD);
        SIM s1 = new SIM(2330, "+43 681 200456");
        Phone Samsung = new Phone("Black", SD, s1, c1);
        Samsung.makeCall("+381 000 45678");
        Samsung.takePicture();
        Samsung.saveFile(f1);
        Samsung.saveFile(f2);
        Samsung.saveFile(f3);
        System.out.println(Samsung.getFreeSpace());
        Samsung.pritnAllFiles();

    }


}
