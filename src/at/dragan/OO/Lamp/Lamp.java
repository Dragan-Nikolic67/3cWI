package at.dragan.OO.Lamp;


import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lights;

    public Lamp() {
        this.lights = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        this.lights.add(lightElement);
    }

    public void turnOn(LightElement lightElement) {
        if (lights.contains(lightElement)) {
            lightElement.turnOn();
        } else {
            System.out.println("Das Lichtelement gehört nicht zur Lampe.");
        }
    }

    public void turnOff(LightElement lightElement) {
        if (lights.contains(lightElement)) {
            lightElement.turnOff();
        } else {
            System.out.println("Das Lichtelement gehört nicht zur Lampe.");
        }
    }

    public void turnAllOff() {
        for (LightElement light : lights) {
            light.turnOff();
        }
    }

    public void turnAllOn() {
        for (LightElement light : lights) {
            light.turnOn();
        }
    }

    public void printNamesOfLightElements() {
        for (LightElement light : lights) {
            System.out.println(light.getName());
        }
    }

    public double getOverallPowerUsage() {
        int overalPowerUsage = 0;
        for (LightElement light : lights) {
            overalPowerUsage += light.getPowerConsumption();
        }
        return overalPowerUsage;
    }


    public List<LightElement> getLights() {
        return lights;
    }

    public void setLights(List<LightElement> lights) {
        this.lights = lights;
    }
}
