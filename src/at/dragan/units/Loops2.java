package at.dragan.units;
import java.util.Random;
public class Loops2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i<1000; i = i+2 ){
            sum = sum + i;
            System.out.println(sum);
        }
    }

}
