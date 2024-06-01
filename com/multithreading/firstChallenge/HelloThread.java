package com.multithreading.firstChallenge;

public class HelloThread extends Thread{
    private final int num;

    public HelloThread(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.printf("(%d) %s Hello from Thread %d\n", i+1,Thread.currentThread().getName(), num);
        }
    }

}
