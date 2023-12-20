package at.dragan.Projekte;

import java.util.Random;
import java.util.Scanner;

public class tt {
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
            System.out.println("Wählen Sie ein Feld aus (1-9): ");
            int SpielerFeld = scanner.nextInt();

            Position(SpielFeld, SpielerFeld, "Spieler");
            Spielfeld(SpielFeld);

            if (Gewinner(SpielFeld, "Spieler")) {
                System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
                break;
            }

            Random random = new Random();
            int BotFeld;
            do {
                BotFeld = random.nextInt(9) + 1;
            } while (SpielFeld[(BotFeld - 1) / 3 * 2][(BotFeld - 1) % 3 * 2] != ' ');
            Position(SpielFeld, BotFeld, "Bot");
            Spielfeld(SpielFeld);

            if (Gewinner(SpielFeld, "Bot")) {
                System.out.println("Der Bot hat gewonnen! Versuchen Sie es erneut.");
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
        } else if (user.equals("Bot")) {
            symbol = 'O';
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

    public static boolean Gewinner(char[][] SpielFeld, String player) {
        char symbol = (player.equals("Spieler")) ? 'X' : 'O';

        // Überprüfen der Zeilen und Spalten
        for (int i = 0; i < 3; i++) {
            if ((SpielFeld[i * 2][0] == symbol && SpielFeld[i * 2][2] == symbol && SpielFeld[i * 2][4] == symbol) ||
                    (SpielFeld[0][i * 2] == symbol && SpielFeld[2][i * 2] == symbol && SpielFeld[4][i * 2] == symbol)) {
                return true;
            }
        }

        // Überprüfen der Diagonalen
        if ((SpielFeld[0][0] == symbol && SpielFeld[2][2] == symbol && SpielFeld[4][4] == symbol) ||
                (SpielFeld[0][4] == symbol && SpielFeld[2][2] == symbol && SpielFeld[4][0] == symbol)) {
            return true;
        }

        return false;
    }
}
