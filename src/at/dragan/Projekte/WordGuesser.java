package at.dragan.Projekte;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {

    public static void main(String[] args) {

        String[] woerter = {"Abendstern", "Bibliothek", "Chaos", "Diamant", "Eisberg", "Festival", "Geheimnis", "Hypnose", "Ikarus", "Jalousie", "Kapitän", "Labyrinth", "Meteorit", "Nachtigall", "Oase", "Paradies", "Quarantäne", "Regenbogen", "Sonnenblume", "Taschenlampe"};


        Random random = new Random();
        String gesuchtesWort = woerter[random.nextInt(woerter.length)];


        char[] raetsel = new char[gesuchtesWort.length()];
        for (int i = 0; i < gesuchtesWort.length(); i++) {
            raetsel[i] = '*';

        }
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Aktuelles Rätsel: " + new String(raetsel));


            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? ");
            char eingabe = scanner.next().charAt(0);


            boolean buchstabeRichtig = false;
            for (int i = 0; i < gesuchtesWort.length(); i++) {
                if (Character.toLowerCase(gesuchtesWort.charAt(i)) == Character.toLowerCase(eingabe)) {
                    raetsel[i] = gesuchtesWort.charAt(i);
                    buchstabeRichtig = true;
                }
            }


            if (new String(raetsel).equals(gesuchtesWort)) {
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort richtig geraten: " + gesuchtesWort);
                break;
            }


            if (buchstabeRichtig) {
                System.out.println("Richtig");
            } else {
                System.out.println("Leider falsch :( ");
            }
        }


        scanner.close();
    }
}



