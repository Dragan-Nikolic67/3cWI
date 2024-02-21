package at.dragan.OO.Lamp;

public class LightElement {
    private String color;
    private String name;
    private int powerConsumption;
    private boolean status;

    public LightElement(String color, String name, int powerConsumption, boolean status) {
        this.color = color;
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }

    public void turnOn() {
        if (status) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
        } else {
            this.status = true;
            this.powerConsumption = this.powerConsumption + 5;
        }
    }

    public void turnOff() {
        if (!status) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits ausgeschaltet");
        } else {
            this.status = false;
            this.powerConsumption = this.powerConsumption - 5;
        }
    }


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

