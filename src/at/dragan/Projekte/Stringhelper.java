package at.dragan.Projekte;

import java.util.Scanner;

public class Stringhelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Text ein:");
                String text = scanner.nextLine();
        System.out.println("Die Anzahl der Buchstaben lautet: " + countLetters(text));
    }

    public static int countLetters(String text) {
        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            num++;
        }
        return num;
    }

}