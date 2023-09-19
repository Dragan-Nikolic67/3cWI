package at.dragan.units;

import java.util.Random;

public class Ifbedingung2 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        System.out.print(randomNumber);

        System.out.print(" ");

        int randomNumber2 = random.nextInt(100);
        System.out.println(randomNumber2);
    if (randomNumber<randomNumber2 && randomNumber<50){
        System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
    }
    if (randomNumber<30 || randomNumber2<30){
        System.out.println("Eine der beiden ist kleiner als 30");
    }
    if (randomNumber<50 && randomNumber2!=50){
        System.out.println("Erste Zahl klein, zweite kein 50igerr");
    }
    }
}