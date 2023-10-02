package at.dragan.Projekte;

import java.util.Random;
import java.util.Scanner;

public class Würfel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isfinished = false;
        boolean isrunning = true;

        while (isrunning) {
            int SummeSpieler = 0;
            int SummeComputer = 0;
            while (!isfinished) {
                System.out.println("Willkommen zum Würfelspiel, drücke 1 um zu Starten!");
                int number = scanner.nextInt();
                if (number == 1) {
                    isfinished = true;
                    System.out.println("Hier sind die Regeln");
                    System.out.println("Du spielst gegen einem Computer, ihr dürft beide 6 mal Würfeln.");
                    System.out.println("Wer am Ende die größere Augensumme hat, hat gewonnen");
                } else {
                    System.out.println("ungültiger wert");
                }
            }

            for (int wurf = 1; wurf <= 6; wurf++) {
                System.out.println("Drücke 1 um zu Würfeln");
                int number = scanner.nextInt();
                if (number == 1) {
                    int Wurfwert = random.nextInt(1, 7);
                    System.out.println(Wurfwert);
                    SummeSpieler += Wurfwert;
                    System.out.println("Du hast " + Wurfwert + " gewürfelt!");
                } else {
                    System.out.println("Ungültig, du verlierst diesen wurf!");
                }
            }
            System.out.println("Deine Augensumme ist " + SummeSpieler);

            for (int wurf = 1; wurf <= 6; wurf++) {
                int Wurfwert = random.nextInt(1, 7);
                System.out.println(Wurfwert);
                SummeComputer += Wurfwert;
                System.out.println("Der Computer hat " + Wurfwert + " gewürfelt!");
            }
            System.out.println("Die Augensumme vom Computer ist " + SummeComputer);

            if (SummeSpieler > SummeComputer) {
                System.out.println("Du hast gewonnen!");
            } else if (SummeComputer > SummeSpieler) {
                System.out.println("Der Computer hat gewonnen");
            } else {
                System.out.println("Unentschieden");
            }


            System.out.println("Try Again?");
            int number = scanner.nextInt();
            System.out.println("Drücke 1 um neu zu starten");
            System.out.println("Drücke etwas anderes um zu stoppen");
            if (number == 1) {
                System.out.println("going back");
            } else {
                System.out.println("Aufwiedersehen");
                isrunning = false;
            }


        }
        scanner.close();
    }
}
