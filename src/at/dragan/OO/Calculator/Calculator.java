package at.dragan.OO.Calculator;




import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Calculator {
    private List<Numbers> numbers = new ArrayList<>();
    public void addNumber(Numbers number) {
        this.numbers.add(number);
    }
    public double add(){
        double sum = 0;
        for (Numbers num : numbers){
            sum += num.getNum();
        }
        return sum;
    }
    public double subtract() {
        double sum = 0;
        for (Numbers num : numbers) {
            sum -= num.getNum();
        }
        return sum;
    }

        public double multiply(){
            double sum = 1;
            for (Numbers num : numbers){
                sum = sum *  num.getNum();
            }
            return sum;
    }
    public double divide(){
        double sum = 1;
        for (Numbers num : numbers){
            sum = sum / num.getNum();
        }
        return sum;
    }
    public double cos(Numbers number){
        double cosValue = Math.cos(number.getNum());
        return cosValue;
    }
    public double sin(Numbers number){
        double sinValue = Math.sin(number.getNum());
        return sinValue;
    }
    public double sqrt(Numbers number){
        double sqrtValue = Math.sqrt(number.getNum());
        return sqrtValue;
    }




}
