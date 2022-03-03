package ch.juventus.javadoc;

import java.util.List;

public class MathUtils {

    /**
     *
     * @param numbers a list of number to add to one another
     * @return the sum of all the numbers in the list
     */
    public double addition(List<Double> numbers){
        double sum = 0;
        for (Double number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    /**
     *
     * @param a number which is subtracted from
     * @param b number to subtract from a
     * @return result of the subtraction
     */
    public double subtraction(double a, double b){
        return a - b;
    }

    /**
     *
     * @param a the number to devide from
     * @param b the devider
     * @return the result of the division
     */
    public double division(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("Argument 'b' is 0");
        }
        return a / b;
    }

    /**
     *
     * @param a multiplier
     * @param b multiplier
     * @return the result of the multiplication
     */
    public double multiplication(double a, double b){
        return a * b;
    }
}
