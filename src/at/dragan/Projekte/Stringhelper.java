package at.dragan.Projekte;

import java.util.Scanner;

public class Stringhelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Text ein:");
        String text = scanner.nextLine();
        System.out.println("Die Anzahl der Buchstaben lautet: " + countLetters(text));
        System.out.println("Hier ist die Anzahl von jeden Buchstaben: ");
        System.out.println("Hier ist der Text rückwarts: " + reverseText(text));
        System.out.println("Ist der Text Palindrom: " + isPalindrome(text));

    }

    public static int countLetters(String text) {
        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            num++;
        }
        return num;
    }


    public static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String reversed = reverseText(text);
        return text.equalsIgnoreCase(reversed);
    }


    }
