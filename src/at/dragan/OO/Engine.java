package at.dragan.OO;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    private int horsepower;
    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }


    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}
