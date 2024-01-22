package at.dragan.OO.Remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(false, 100);
        Battery b2 = new Battery(false, 100);

        Remote r1 = new Remote(false);
        r1.addBattery(b1);
        r1.addBattery(b2);
        b1.Charge();
        r1.getStatus();
    }
}
