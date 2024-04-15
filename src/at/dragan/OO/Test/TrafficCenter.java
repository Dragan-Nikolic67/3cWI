package at.dragan.OO.Test;

import java.util.ArrayList;
import java.util.List;

public class TrafficCenter {
    private List<Plane> planes;

    public TrafficCenter(){
        this.planes = new ArrayList<>();
    }


    public void addPlane(Plane plane){
        this.planes.add(plane);
    }
   public void printAllPlanes(){
        for (Plane plane : planes){
            System.out.println(plane.getName());
            System.out.println("Latitude: " + plane.getPosition().getLatitude());
            System.out.println("Longtitude " + plane.getPosition().getLongtitude());
        }
   }
   public void informPeopleOnAllPlanes(String message){
       for (Plane plane : planes){
           plane.informAllPassengers(message);
       }
   }
    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Plane> getPlanes() {
        return planes;
    }
}
