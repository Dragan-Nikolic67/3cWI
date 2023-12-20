package at.dragan.Projekte;

import java.util.Scanner;

public class Stringhelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Text ein:");
        String text = scanner.nextLine();
        System.out.println("Die Anzahl der Buchstaben lautet: " + countLetters(text));
        System.out.println("Hier ist die Anzahl von jeden Buchstaben: ");
        countLetters2(text);
        System.out.println("Hier ist der Text rückwarts: " + reverseText(text));
        System.out.println("Ist der Text Palindrom: " + isPalindrome(text));
        scanner.close();

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

    public static void countLetters2(String text) {
        int[] letterCounts = new int[26];
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                letterCounts[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            if (letterCounts[i] > 0) {
                System.out.println(letter + ": " + letterCounts[i]);
            }
        }
    }
}