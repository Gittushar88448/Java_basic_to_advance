package com.EqualsAndHashcode;

import java.util.Objects;

//Create a class Person with attributes name and age. Override equals() to compare Person objects based on their
//attributes. Override hashCode() consistent with the definition of equals().
public class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }


}
