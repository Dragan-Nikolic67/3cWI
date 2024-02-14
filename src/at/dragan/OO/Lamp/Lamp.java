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
    public void turnOn(LightElement lightElement){
        if (lights.contains(lightElement)) {
            lightElement.turnOn();
        } else {
            System.out.println("Das Lichtelement gehört nicht zur Lampe.");
        }
        }


    public List<LightElement> getLights() {
        return lights;
    }

    public void setLights(List<LightElement> lights) {
        this.lights = lights;
    }
}
