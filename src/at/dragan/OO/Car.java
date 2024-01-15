package at.dragan.OO;
import at.dragan.OO.FuelTank;

import java.util.ArrayList;
import java.util.List;

public class Car { //Instanzvariabeln, bleiben bis das Objekt stirbt
    private Engine engine;

    private String brand;
    private String serialNumber;
    private int honkAmmount;
    private double remainingDistance;
    private String color;

    private List<RearMirror> mirrors;

    private List<Tire> tires;



    public Car(Engine engine, String b, String s) {
        this.engine = engine;
        this.brand = b;
        this.serialNumber = s;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void drive(int speed) {
        this.engine.drive(speed);
    }

    public void breaking() {
        System.out.println("ich bremse");
        System.out.println(this.engine.getTank().getFuelAmount());
    }

    public void turboBoost() {
        this.engine.turboBoost();
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < honkAmmount; i++) {
            System.out.println("Tuut");
        }

    }

    public void getRemainingRange() {
        this.remainingDistance = this.getEngine().getTank().getFuelAmount() / this.getEngine().getTank().getFuelConsumption();
        System.out.println("Du kannst noch " + remainingDistance + " Kilometer fahren");
    }


    public void addMirror (RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void addTire (Tire tire){
        this.tires.add(tire);
    }


    public List<Tire> getTire() {return tires;}
    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHonkAmmount(int honkAmmount) {
        this.honkAmmount = honkAmmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }



    public int getHonkAmmount() {
        return honkAmmount;
    }

    public String getColor() {
        return color;
    }
}
