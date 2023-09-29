package at.dragan.units;

import java.util.Random;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Kontostand = 0;
        boolean isfinished = false;
        while (!isfinished) {
            System.out.println("Selektieren sie die gewünschte funktion");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Ende");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                number = scanner.nextInt();
                Kontostand += number;
                System.out.println("Sie haben " + number + " Euro eingezahlt");
            } else if (number == 2) {
                System.out.println("Wie viel würden sie abheben?");
                number = scanner.nextInt();
                Kontostand -= number;
                System.out.println("Sie haben " + number + " Euro abgehoben");

            } else if (number == 3) {
                System.out.println("Der Kontostand beträgt: " + Kontostand + " Euro");
            } else if (number == 4) {
                isfinished = true;
                System.out.println("Machine is stopping");

            } else {
                System.out.println("ungültiger Wert");
            }
        }
        scanner.close();

    }
}
