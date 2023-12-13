package at.dragan.OO;

public class Car { //Instanzvariabeln, bleiben bis das Objekt stirbt
    private Engine engine;
    private double fuelConsumption;
    private double fuelAmount;
    private String brand;
    private String serialNumber;
    private double tankVolume;
    private int honkAmmount;
    private double remainingDistance;
    private String color;

    public Car(Engine engine, int fc, String b, String s) {
        this.engine = engine;
        this.fuelConsumption = fc;
        this.brand = b;
        this.serialNumber = s;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void breaking() {
        System.out.println("ich bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount > this.tankVolume * 0.1) {
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
        this.remainingDistance = this.fuelAmount / this.fuelConsumption;
        System.out.println("Du kannst noch " + remainingDistance + " Kilometer fahren");
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setHonkAmmount(int honkAmmount) {
        this.honkAmmount = honkAmmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuelAmount(double fuelAmount) {
        if (fuelAmount > 110) {
            this.fuelAmount = 110;
        } else {
            this.fuelAmount = fuelAmount;
        }

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

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public int getHonkAmmount() {
        return honkAmmount;
    }

    public String getColor() {
        return color;
    }
}
