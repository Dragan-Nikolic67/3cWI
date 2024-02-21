package at.dragan.OO.Calculator;

public class main {
    public static void main(String[] args) {
        Numbers n1 = new Numbers(20);
        Numbers n2 = new Numbers(20);
        Numbers n3 = new Numbers(20);
        Numbers n4 = new Numbers(20);
        Numbers n5 = new Numbers(20);
        Calculator c1 = new Calculator();
        c1.addNumber(n1);
        c1.addNumber(n2);
        c1.addNumber(n3);
        c1.addNumber(n4);
        c1.addNumber(n5);
        System.out.println(c1.add());
        System.out.println(c1.subtract());


    }
}
