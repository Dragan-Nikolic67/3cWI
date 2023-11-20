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


    }
}