package at.dragan.OO;

public class FuelTank {
    private double tankVolume;
    private double fuelAmount;

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}
