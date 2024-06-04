package com.multithreading.challenge101;

public class PrintThread extends Thread{
    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){
        System.out.printf("%s Thread started\n", Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended\n", Thread.currentThread().getName());
    }
}
