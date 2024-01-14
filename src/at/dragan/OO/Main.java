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
        Car c1 = new Car( e1, "Audi", "1234");


        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());
     }
}
