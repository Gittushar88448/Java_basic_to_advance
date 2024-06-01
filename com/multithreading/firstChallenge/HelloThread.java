package com.multithreading.firstChallenge;

public class HelloThread extends Thread{
    private final int num;

    public HelloThread(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }



}
