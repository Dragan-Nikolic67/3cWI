package at.dragan.OO.Calculator;

public class main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        SuperCalculator s1 = new SuperCalculator();
        System.out.println("Addition: " + c1.add(2, 3));
        System.out.println("Subtraktion: " + c1.subtract(4, 60));
        System.out.println("Multiplikation: " + c1.multiply(4, 5));
        System.out.println("Division: " + c1.divide(20, 30));
        System.out.println("Cosinus: " + s1.cos(20));
        System.out.println("Sinus: " + s1.sin(20));
        System.out.println("Quadratwurzel: " + s1.sqrt(25));
    }
}
