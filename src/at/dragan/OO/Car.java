package at.dragan.OO;

public class Car {
    public double fuelConsumption;
    public double fuelAmount;
    public String brand;
    public String serialNumber;
    public double tankVolume;
    public int honkAmmount;
    private double remainingDistance;
    public String color;

    public Car(int fc, String b, String s){
        this.fuelAmount =fc;
        this.brand =b;
        this.serialNumber=s;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }
    public void breaking(){
        System.out.println("ich bremse");
    }
    public void turboBoost(){
        if (this.fuelAmount > this.tankVolume * 0.1){
            System.out.println("SuperBoostMode");
        }
        else
            System.out.println("Not enough fuel to go to Superboost");
    }
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < honkAmmount; i++) {
            System.out.println("Tuut");
        }

    }

    public void getRemainingRange(){
        this.remainingDistance = this.fuelAmount / this.fuelConsumption;
        System.out.println("Du kannst noch " + remainingDistance + " Kilometer fahren");
    }

}
