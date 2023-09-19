package at.dragan.units;

import java.util.Random;

public class Switchstatement {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(5, 11);

        switch (randomnumber) {
            case 10:
                System.out.print("Ten");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 5:
                System.out.print("Five");
                break;
        }
    }
}
