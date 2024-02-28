package at.dragan.OO.Calculator;




import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

    public class Calculator {
        public double add(int a, int b) {
            return a + b;
        }

        public double subtract(int a, int b) {
            return a - b;
        }

        public double multiply(int a, int b) {
            return a * b;
        }

        public double divide(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                return 0.0;
            }
        }
    }








