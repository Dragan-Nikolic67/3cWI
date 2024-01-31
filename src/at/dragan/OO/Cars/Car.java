package at.dragan.OO.Cars;

public class Car {
    private int speed;
    private String color;
    private int price;
    private int fuelUsage;
    private Engine engine;
    private Manufacturer manufacturer;
    private int driven_KM;

    public Car(int speed, String color, int price, int fuelUsage, Engine engine, Manufacturer manufacturer, int driven_KM) {
        if (speed > 100 || speed < 0) {
            System.out.println("invalid speed");
        } else {
            this.speed = speed;
        }
        this.color = color;
        this.price = price;
        this.fuelUsage = fuelUsage;
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.driven_KM = driven_KM;
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

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public int getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

}
