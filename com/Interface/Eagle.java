package com.Interface;

public class Eagle extends Birds{
    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying!");
    }
}
