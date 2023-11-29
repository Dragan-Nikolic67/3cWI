package at.dragan.OO;
import at.dragan.OO.Car;


public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.tankVolume = 110;
        c1.honkAmmount = 4;


        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;
        c2.tankVolume = 3;
        c2.honkAmmount = 4;

        System.out.println(c1.serialNumber);
        System.out.println(c2.brand);

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.breaking();
        System.out.println(c2.fuelAmount);
        c2.turboBoost();
        c2.honk(c2.honkAmmount);
        c2.getRemainingRange();
        c1.drive();
        c1.turboBoost();

    }
}
