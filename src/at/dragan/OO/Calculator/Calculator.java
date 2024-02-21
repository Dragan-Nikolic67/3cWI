package at.dragan.OO.Calculator;


import at.dragan.OO.Lamp.LightElement;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Numbers> numbers = new ArrayList<>();
    public void addNumber(Numbers number) {
        this.numbers.add(number);
    }
    public double add(){
        int sum = 0;
        for (Numbers num : numbers){
            sum += num.getNum();
        }
        return sum;
    }
    public double subtract(){
        int sum = 0;
        for (Numbers num : numbers){
            sum -= num.getNum();
        }
        return sum;
    }




}
