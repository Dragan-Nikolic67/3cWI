package at.dragan.OO;

import at.dragan.OO.Engine;

import at.dragan.OO.Car;
import at.dragan.OO.FuelTank;


public class Main {
    public static void main(String[] args) {
        FuelTank t1= new FuelTank(120, 100, 10);
        Engine e1 = new Engine(120, Engine.TYPE.GAS, t1);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(100, -10);
        Tire Ti1 = new Tire(20,1);
        Tire Ti2 = new Tire(20,2);
        Tire Ti3 = new Tire(20,3);
        Tire Ti4 = new Tire(20,4);
        Car c1 = new Car( e1, "Audi", "1234");

        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTire(Ti1);
        c1.addTire(Ti2);
        c1.addTire(Ti3);
        c1.addTire(Ti4);

        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getMirrors().get(1).getPosition());
     }
}
