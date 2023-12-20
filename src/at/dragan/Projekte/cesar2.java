package at.dragan.Projekte;

import java.util.Random;
import java.util.Scanner;

public class cesar2 {
    public static void main(String[] args) {
        char [][] SpielFeld = {
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

            Position(SpielFeld, SpielerFeld, "Spieler");

            Random random = new Random();
            int BotFeld = random.nextInt(10);
            System.out.println(BotFeld);
            Position(SpielFeld, BotFeld, "Bot");
            Spielfeld(SpielFeld);
        }
    }
    public static void  Spielfeld (char [][] SpielFeld){
        for(char[] reihe : SpielFeld) {
            for (char c : reihe) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
    public static void Position (char [][] SpielFeld, int Feld, String user){
        char symbol = ' ';
        if(user.equals("Spieler")){
            symbol = 'X';
        } else if (user.equals("Bot")) {
            symbol ='0';

        }
        switch (Feld) {
            case 1:
                SpielFeld [0][0] = symbol;
                break;
            case 2:
                SpielFeld [0][2] = symbol;
                break;
            case 3:
                SpielFeld [0][4] = symbol;
                break;
            case 4:
                SpielFeld [2][0] = symbol;
                break;
            case 5:
                SpielFeld [2][2] = symbol;
                break;
            case 6:
                SpielFeld [2][4] = symbol;
                break;
            case 7:
                SpielFeld [4][0] = symbol;
                break;
            case 8:
                SpielFeld [4][2] = symbol;
                break;
            case 9:
                SpielFeld [4][4] = symbol;
                break;
        }
    }
    public static String Gewinner() {
        return "";



    }
}