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
        if (speed>100){
            System.out.println("You're going too fast, slow down!");
        }
        else{
            System.out.println("I am driving");
            System.out.println(speed + "Km/h");
            this.tank.setFuelAmount(this.tank.getFuelAmount() - this.tank.getFuelConsumption());
            System.out.println(this.tank.getFuelAmount());

        }

    }
    public void turboBoost() {
        if (this.getTank().getFuelAmount() > this.getTank().getTankVolume() * 0.1) {
            System.out.println("SuperBoostMode");
        } else
            System.out.println("Not enough fuel to go to Superboost");
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
