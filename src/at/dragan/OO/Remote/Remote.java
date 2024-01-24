package at.dragan.OO.Remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private List<Battery> batteries;

    public Remote(boolean isOn) {
        this.isOn = isOn;
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        if (this.batteries.size() < 2) {
            this.batteries.add(battery);
        } else {
            System.out.println("Too many batteries, only the first 2 batteries count");
        }
    }


    public void getON() {
        if (this.getBatteries().get(0).getChargingStatus() || this.getBatteries().get(1).getChargingStatus()) {
            System.out.println("One or both Batteries are Charging");
        } else if (this.getBatteries().get(0).getPower() == 0 || this.getBatteries().get(1).getPower() == 0) {
            System.out.println("No Power");
        } else if (isOn) {
            System.out.println("Remote already on");
        } else {
            int Power;
            int Power1;
            Power = getBatteries().get(0).getPower() - 5;
            Power1 = getBatteries().get(1).getPower() - 5;
            if (Power < 0) {
                Power = 0;
            }
            if (Power1 < 0) {
                Power1 = 0;
            }
            this.getBatteries().get(0).setPower(Power);
            this.getBatteries().get(1).setPower(Power1);
            isOn = true;
            System.out.println("Battery1 : Verbraucher angeschlossen");
            System.out.println("Battery2 : Verbraucher angeschlossen");

        }

    }


    public void getOFF() {
        if (isOn) {
            System.out.println("Battery1 : Kein Verbraucher angeschlossen");
            System.out.println("Battery2 : Kein Verbraucher angeschlossen");

        } else {
            System.out.println("Remote schon ausgeschaltet");
        }
    }

    public void getStatus() {
        System.out.println(getBatteries().get(0).getPower());
        System.out.println(getBatteries().get(1).getPower());
        int average;
        average = (getBatteries().get(0).getPower() + getBatteries().get(1).getPower()) / 2;
        System.out.println("Hier ist der Mittelwert: " + average);
        System.out.println(this.getBatteries().get(0).getChargingStatus());
        System.out.println(this.getBatteries().get(1).getChargingStatus());
    }


    public void setOn(boolean on) {
        isOn = on;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

}

