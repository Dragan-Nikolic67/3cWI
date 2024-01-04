package at.dragan.OO;
import at.dragan.OO.Car;
import at.dragan.OO.FuelTank;


public class Engine {
    public enum TYPE {DIESEL, GAS}

    private int horsepower;
    private TYPE type;

    private FuelTank tank;

    public Engine(int horsepower, TYPE type, FuelTank tank) {
        this.horsepower = horsepower;
        this.type = type;
        this.tank = tank;
    }

    public void drive(int speed) {
       this.tank.setFuelAmount();

        System.out.println("I am driving");
        System.out.println(speed + "Km/h");
        System.out.println(this.tank.getFuelAmount());
    }




    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public FuelTank getTank() {
        return tank;
    }

    public void setTank(FuelTank tank) {
        this.tank = tank;
    }
}
