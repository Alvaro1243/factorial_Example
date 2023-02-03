package org.example;

public class Factorial {
    public int compute(int number) {
        int result;
        if(number==0 || number==1){
            result = 1;
        }else if(number==2){
            result = 2;
        }else{
            return number * compute(number-1);
        }
        return result;
    }
}
