package com.Interface;

public abstract class Birds implements Flyable{
 private final String breed;

    public Birds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
