package org.example;

/**
 * Class providing a method to compute the factorial of an integer number
 *
 * @author Alvaro Bermudez Gamez
 */
public class Factorial {
    void h(){
        //asasasa
    }
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
    void f(){
        //aasasa
    }
}
