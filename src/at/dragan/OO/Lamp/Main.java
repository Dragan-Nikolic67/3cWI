package at.dragan.OO.Lamp;

public class Main {
    public static void main(String[] args) {
        LightElement e1 = new LightElement("Green", "Ahmed", 0, false);
        LightElement e2 = new LightElement("Yellow", "Damien", 0, false);
        LightElement e3 = new LightElement("Yellow", "Damien", 0, false);

        Lamp l1 = new Lamp();
e1.turnOn();
        l1.addLightElement(e1);
        l1.addLightElement(e2);
        System.out.println(e1.isStatus());

        l1.turnAllOn();

        System.out.println(e3.isStatus());
        System.out.println(e2.isStatus());
        System.out.println(e1.isStatus());

        System.out.println(l1.getOverallPowerUsage());
        l1.printNamesOfLightElements();

    }

}
