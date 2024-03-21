package com.PolymorphismOverriding;

public class Car extends Vehicle {
    @Override
    public void service(){
        System.out.println("Car is getting serviced..");
    }

    Car(){
        super.service();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car swift = new Car();

        v1.service();
        swift.service();

    }
}
