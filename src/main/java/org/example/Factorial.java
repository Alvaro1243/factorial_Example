package org.example;

/**
 * @author Alvaro Bermudez Gamez
 */
public class Factorial {
    public int compute(int number) {
        int result;
        if(number<0){
            throw new NegativeValueException("The number " + number + " is negative");
        }else if(number==0){
            result = 1;
        }else{
            return number * compute(number-1);
        }
        return result;
    }
}
