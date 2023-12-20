package at.dragan.units;
import java.util.Random;
import java.util.Scanner;
public class zesty {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int pointsPlayer = 0;
        int pointsComputer = 0;
        boolean gameIsRunning = true;

        System.out.println("Sie haben 6 Würfe. Wenn die Augensumme Ihrer Würfe höher, als die des Computers ist, haben Sie gewonnen!");
        System.out.println("Drücke Sie die Taste: 1, um zu würfeln");

        while (gameIsRunning) {

            for (int i = 1; i <= 6; i++) {

                int number = scanner.nextInt();

                if (number == 1) {
                    int dicePlayer = random.nextInt(1, 7);
                    int diceComputer = random.nextInt(1, 7);
                    pointsPlayer = pointsPlayer + dicePlayer;
                    System.out.println("Sie haben: " + dicePlayer + " gewürfelt!");
                    System.out.println("Die Augensumme von dir ist " + pointsPlayer);

                    pointsComputer = pointsComputer + diceComputer;
                    System.out.println("Der Computer hat: " + diceComputer + " gewürfelt!");
                    System.out.println("Die Augensumme von Computer ist " + pointsComputer);
                }
            }
            gameIsRunning = false;
        }

        while (!gameIsRunning) {
            if (pointsPlayer > pointsComputer) {
                System.out.println("Sie haben " + pointsPlayer + " zu " + pointsComputer + " gewonnen!");
            } else if (pointsComputer > pointsPlayer) {
                System.out.println("Sie haben" + pointsPlayer + " zu " + pointsComputer + " verloren!");
            }
            gameIsRunning = true;
        }
    }
}