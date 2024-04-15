package at.dragan.OO.Test;

public class main {
    public static void main(String[] args) {
        Position p1 = new Position(20, 30);
        Position p2 = new Position(50, 30);
        Passenger Person1 = new Passenger("Raphael", "Maringer");
        Passenger Person2 = new Passenger("Simon", "Metzler");
        Passenger Person3 = new Passenger("Damien", "Wallis");
        Plane Pl1 = new Plane("Titanic", p1);
        Plane Pl2 = new Plane("David", p2);
        TrafficCenter c1 = new TrafficCenter();

        //Passenger inform ausgabe
        Person1.inform("Wir fliegen los in 10min");

        //Plane informPassengers ausgabe
        Pl1.addPassenger(Person2);
        Pl1.addPassenger(Person3);
        Pl1.informAllPassengers("Wir fliegen los in 5min");


        //Traffic Controller ausgaben
        Pl2.addPassenger(Person1);
        c1.addPlane(Pl1);
        c1.addPlane(Pl2);
        c1.printAllPlanes();
        c1.informPeopleOnAllPlanes("Wir fliegen los");

    }
}
