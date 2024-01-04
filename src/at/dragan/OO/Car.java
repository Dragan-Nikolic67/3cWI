package at.dragan.OO;
import at.dragan.OO.FuelTank;
public class Car { //Instanzvariabeln, bleiben bis das Objekt stirbt
    private Engine engine;
    private double fuelConsumption;
    private String brand;
    private String serialNumber;
    private int honkAmmount;
    private double remainingDistance;
    private String color;


    public Car(Engine engine, int fc, String b, String s) {
        this.engine = engine;
        this.fuelConsumption = fc;
        this.brand = b;
        this.serialNumber = s;

    }

    public void drive(int speed) {
        this.engine.drive(speed);

        System.out.println("I am driving");
        System.out.println(speed + "Km/h");
        System.out.println(this.engine.getTank().getFuelAmount());
    }

    public void breaking() {
        System.out.println("ich bremse");
        System.out.println(this.engine.getTank().getFuelAmount());
    }

    public void turboBoost() {
        if (this.getEngine().getTank().getFuelAmount() > this.engine.getTank().getFuelAmount() * 0.1) {
            System.out.println("SuperBoostMode");
        } else
            System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < honkAmmount; i++) {
            System.out.println("Tuut");
        }

    }

    public void getRemainingRange() {
        this.remainingDistance = this.getEngine().getTank().getFuelAmount() / this.fuelConsumption;
        System.out.println("Du kannst noch " + remainingDistance + " Kilometer fahren");
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



    public double getFuelConsumption() {
        return fuelConsumption;
    }



    public int getHonkAmmount() {
        return honkAmmount;
    }

    public String getColor() {
        return color;
    }
}
