package at.dragan.units;

import java.util.Random;

public class Ifbedingung1 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        System.out.print(randomNumber);
        if (randomNumber < 20) {
            System.out.print(" Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.print(" Medium");
        } else {
            System.out.print(" Large");
        }
    }
}