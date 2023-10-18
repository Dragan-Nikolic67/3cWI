package at.dragan.Projekte;

import java.util.Scanner;

public class Ceasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zu verschlüsseln den Text eingeben:");
        String text = scanner.nextLine();

        System.out.println("Um wie viele Stellen sollen die Buchstaben verschoben werden?");
        int num = scanner.nextInt();
        String verschluesselterText = encrypt(text, num);
        System.out.println("Verschlüsselter Text: " + verschluesselterText);
        String unverschluesselterText = decrypt(verschluesselterText, num);
        System.out.println("Unverschlüsselter Text ist : " + unverschluesselterText);



    }

    public static String encrypt(String text, int num) {
        StringBuilder verschluesselterText = new StringBuilder(); //wird benutzt um den text leicht zu ändern da der normale String nicht so gut dafür geeignet ist
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); //macht den Character an Platz i.


            if (Character.isLetter(c)) {  //kontrolliert ob c ein Buchstabe ist
                c = (char) ((c - 'a' + num + 26) % 26 + 'a');
            }
            verschluesselterText.append(c); //das baut den Stringbuilder auf, mit einem normalen String könnte man das nicht benutzen
        }
        return verschluesselterText.toString();

    }

    public static String decrypt(String text, int num) {
        StringBuilder unverschluesselterText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);


            if (Character.isLetter(c)) {
                c = (char) ((c - 'a' - num + 26) % 26 + 'a');
            }
            unverschluesselterText.append(c);
        }
        return unverschluesselterText.toString();


    }
}