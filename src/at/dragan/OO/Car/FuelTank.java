package at.dragan.OO.Car;

public class FuelTank {
    private double tankVolume;
    private double fuelAmount;

    private int fuelConsumption;

    public FuelTank(int tankVolume, int fuelAmount, int fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        if (fuelAmount > tankVolume) {
            this.fuelAmount = tankVolume;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

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

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
