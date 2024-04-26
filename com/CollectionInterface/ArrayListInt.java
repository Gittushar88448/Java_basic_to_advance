package com.CollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(14);
        list.add(2);
        System.out.println(list);
        list.add(2,34);

        System.out.println(list);
        list.remove(3);

        System.out.println(list);
        if(list.contains(34)){
            System.out.println("number is present in Array list");
        }else {
            System.out.println("number is not present");
        }
    }
}
