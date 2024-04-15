package at.dragan.OO.Test;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private List<Passenger> passengers;
    private Position position;

    public Plane (String name, Position position){
        this.name = name;
        this.position = position;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
    public void informAllPassengers(String message){
        for (Passenger passenger: passengers) {
            passenger.inform(message);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
