package at.dragan.units;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        boolean isFinished = false;
        int sum = 0;
        Random random = new Random();

        while (!isFinished) {
            int Randomnumber = random.nextInt(10, 30);
            System.out.println(Randomnumber + "+");
            sum = sum + Randomnumber;
            System.out.println(sum);
            if ((Randomnumber == 15) || (Randomnumber == 25)) {
                isFinished = true;
            }
        }
    }
}
