package at.dragan.OO;

import at.dragan.OO.Car;


public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car(2, "Honda", "234");
        c1.setBrand("audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("1234");
        c1.setFuelAmount(200);
        c1.setTankVolume(110);
        c1.setHonkAmmount(4);
        c1.setColor("yellow");
        System.out.println(c1.getSerialNumber());
        System.out.println(c1.getBrand());
        c1.getRemainingRange();
        System.out.println(c1.getFuelAmount());


    }
}
