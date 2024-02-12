package at.dragan.OO.Cars;

public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(Engine.TYPE.GAS, 20);
        Manufacturer m1 = new Manufacturer("Mercedes", "Monaco", 0.2);

        Car c1 = new Car(99, "Blue", 20, 20, e1, m1, 60000);
        System.out.println(c1.getFuelUsage());

    }
}
