package org.example;

import java.math.BigInteger;

/**
 * Class providing a method to compute the factorial of an integer number
 *
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

    public BigInteger computeBigValue(int value){
        if(value<0){
            throw new NegativeValueException("The number " + value + " is negative");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i<=value; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
