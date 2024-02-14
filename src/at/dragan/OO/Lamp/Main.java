package at.dragan.OO.Lamp;

public class Main {
    public static void main(String[] args) {
        LightElement e1 = new LightElement("Green", "Ahmed", 30, true);
        LightElement e2 = new LightElement("Yellow", "Damien", 10, true);
        LightElement e3 = new LightElement("Yellow", "Damien", 10, false);

        Lamp l1 = new Lamp();

        l1.addLightElement(e1);
        l1.addLightElement(e2);

        System.out.println(l1.getLights().get(0).getColor());
        System.out.println(l1.getLights().get(1).getColor());

        l1.turnOn(e1);
        l1.turnOn(e3);
        System.out.println(l1.getLights().get(0).isStatus());
        System.out.println(l1.getLights().get(1).isStatus());
        System.out.println(e3.isStatus());
    }

}
