package at.dragan.OO.Cars;

public class Car {
    private int speed;
    private String color;
    private double price;
    private double fuelUsage;
    private Engine engine;
    private Manufacturer manufacturer;
    private int driven_KM;

    public Car(int speed, String color, double price, double fuelUsage, Engine engine, Manufacturer manufacturer, int driven_KM) {
        if (speed > 100 || speed < 0) {
            System.out.println("invalid speed");
        } else {
            this.speed = speed;
        }
        this.color = color;
        if (driven_KM > 50000) {
            this.fuelUsage = fuelUsage * 1.098;
        } else {
            this.fuelUsage = fuelUsage;
        }
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.driven_KM = driven_KM;
        this.price = price * (1 - this.manufacturer.getDiscount());
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public double getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDriven_KM(int driven_KM) {
        this.driven_KM = driven_KM;
    }

    public int getDriven_KM() {
        return driven_KM;
    }
}
