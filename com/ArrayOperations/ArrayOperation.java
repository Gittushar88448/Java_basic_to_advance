package com.ArrayOperations;

public class ArrayOperation {
    private int[] number;

    public ArrayOperation(int[] number) {
        this.number = number;
    }

    public class Statistics{
        public double mean(){
        double sum = 0;
            for (int num : number) {
                sum +=  num;
            }
            return (sum / number.length);
        }
    }

}
