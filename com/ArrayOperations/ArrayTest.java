package com.ArrayOperations;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayOperation operation = new ArrayOperation(new int[]{2,3,4,6});
        ArrayOperation.Statistics stats = operation.new Statistics();
        System.out.println(stats.mean());
    }
}
