package at.dragan.OO;

import at.dragan.OO.Engine;

import at.dragan.OO.Car;
import at.dragan.OO.FuelTank;


public class Main {
    public static void main(String[] args) {
        FuelTank t1= new FuelTank(120, 100, 10);
        Engine e1 = new Engine(120, Engine.TYPE.GAS, t1);
        Car c1 = new Car( e1, "Audi", "1234");


      c1.drive(10);
      c1.breaking();
      c1.turboBoost();
     }
}
