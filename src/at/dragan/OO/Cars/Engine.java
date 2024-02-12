package at.dragan.OO.Cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    int horsepower;
    private TYPE type;

    public Engine(TYPE type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
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

}
