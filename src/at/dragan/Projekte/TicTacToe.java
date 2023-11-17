package at.dragan.Projekte;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    static ArrayList<Integer> SpielerPosition = new ArrayList<Integer>(); //Eine veränderbare Liste wo die Spielerfelder gespeichert werden
    static ArrayList<Integer> BotPosition = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] SpielFeld = {
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '}};
        Spielfeld(SpielFeld);


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wählen sie ein Feld aus (1-9): ");
            int SpielerFeld = scanner.nextInt();
            while(SpielerPosition.contains(SpielerFeld) || BotPosition.contains(SpielerFeld)) {
                System.out.println("Feld besetzt bitte wählen sie ein anderes aus: ");
                SpielerFeld = scanner.nextInt();
            }
            String Gewinner = Gewinner();
            System.out.println(Gewinner);
            if (Gewinner.length() > 0) {
                System.out.println(Gewinner);
                break;
            }

            Position(SpielFeld, SpielerFeld, "Spieler");

            Random random = new Random();
            int BotFeld = random.nextInt(1, 10);
            System.out.println(BotFeld);
            while(SpielerPosition.contains(BotFeld) || BotPosition.contains(BotFeld)) {
                BotFeld = random.nextInt(1, 10);
            }
            Position (SpielFeld, BotFeld, "Bot");
            Spielfeld(SpielFeld);

            Gewinner = Gewinner();
            if (Gewinner.length() > 0) {
                System.out.println(Gewinner);
                break;
            }


        }
    }

    public static void Spielfeld(char[][] SpielFeld) {
        for (char[] reihe : SpielFeld) {
            for (char c : reihe) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void Position(char[][] SpielFeld, int Feld, String user) {
        char symbol = ' ';
        if (user.equals("Spieler")) {
            symbol = 'X';
            SpielerPosition.add(Feld); //Nachdem der Spieler ein Zug gemacht hat, wird mit diesen Code das Feld in der oberen Spielerposition List gespeichert
        } else if (user.equals("Bot")) {
            symbol = '0';
            BotPosition.add(Feld);

        }
        switch (Feld) {
            case 1:
                SpielFeld[0][0] = symbol;
                break;
            case 2:
                SpielFeld[0][2] = symbol;
                break;
            case 3:
                SpielFeld[0][4] = symbol;
                break;
            case 4:
                SpielFeld[2][0] = symbol;
                break;
            case 5:
                SpielFeld[2][2] = symbol;
                break;
            case 6:
                SpielFeld[2][4] = symbol;
                break;
            case 7:
                SpielFeld[4][0] = symbol;
                break;
            case 8:
                SpielFeld[4][2] = symbol;
                break;
            case 9:
                SpielFeld[4][4] = symbol;
                break;
        }
    }

    public static String Gewinner() {
        List obereReihe = Arrays.asList(1, 2, 3); //Hier werden paar Lists gemacht wo Arrays gespeichert werden
        List mittlereReihe = Arrays.asList(4, 5, 6);
        List untereReihe = Arrays.asList(7, 8, 9);
        List linkeSpalte = Arrays.asList(1, 4, 7);
        List mittlereSpalte = Arrays.asList(2, 5, 8);
        List rechteSpalte = Arrays.asList(3, 6, 9);
        List DIagonale1 = Arrays.asList(1, 5, 9);
        List DIagonale2 = Arrays.asList(3, 5, 7);

        List<List> Gewinnbedingung = new ArrayList<List>(); // Hier wird eine Liste von Listen erstellt wo die vorherigen Array Listen getan werden
        Gewinnbedingung.add(obereReihe);
        Gewinnbedingung.add(mittlereReihe);
        Gewinnbedingung.add(untereReihe);
        Gewinnbedingung.add(linkeSpalte);
        Gewinnbedingung.add(mittlereSpalte);
        Gewinnbedingung.add(rechteSpalte);
        Gewinnbedingung.add(DIagonale1);
        Gewinnbedingung.add(DIagonale2);

        for (List<Integer> l : Gewinnbedingung) {
            if (SpielerPosition.containsAll(l)) {  //Hier wird dann geprüft ob der Spieler dann All Elemente von einer Liste eingegeben hat z.B 1 2 3 oder 3 5 7 falls das true ist wird dann Sie haben gewonnen ausgegeben

                return "Sie haben gewonnen!";
            } else if (BotPosition.containsAll(l)) {
                return "Der Bot hat gewonnen!";
            }
        }

        if (SpielerPosition.size() + BotPosition.size() >= 9) {  //Falls alle 9 felder voll sind und keine der vorherigen Elementen true waren kommt Unentschieden aus
            return "Unentschieden";
        }


        return ""; //Wird zurück gegeben falls es keinen Gewinner gibt


    }
}
