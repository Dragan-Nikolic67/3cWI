package at.dragan.OO.Remote;

public class Battery {
    private boolean chargingStatus;
    private int power;

    public Battery(boolean chargingStatus, int power) {
        this.chargingStatus = chargingStatus;
        if (power > 100 || power < 0) {
            System.out.println("invalid power");
        } else {
            this.power = power;
        }

    }

    public void Charge() {
        if (!chargingStatus) {
            this.power = power + 5;
            chargingStatus = true;
            if (power > 100) {
                this.power = 100;
            }
        } else {
            System.out.println("Battery is already charging");
        }
    }


    public void disconnectCharge() {
        if (chargingStatus) {
            System.out.println("finished charging");
            System.out.println("Current Power: " + power);
            chargingStatus = false;
        } else {
            System.out.println("Battery isn't charging");
        }
    }

    public void setChargingStatus(boolean chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean getChargingStatus() {
        return chargingStatus;
    }


}
