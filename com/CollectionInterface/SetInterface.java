package com.CollectionInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Papaya");
        System.out.println(set);

        boolean isAdded = set.add("Apple");
        System.out.println(isAdded);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
