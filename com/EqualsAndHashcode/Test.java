package com.EqualsAndHashcode;

public class Test {

    public static void main(String[] args) {

        Person Rahul = new Person(23 , "Rahul");
        Person Mehul = new Person(23, "Rahul");

       if (Rahul.equals(Mehul)){
           System.out.println("Equals");
       }else {
           System.out.println("Not equals");
       }

        System.out.println(Rahul.hashCode());
        System.out.println(Mehul.hashCode());


    }

}
