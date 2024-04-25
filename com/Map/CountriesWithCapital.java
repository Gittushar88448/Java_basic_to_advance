package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountriesWithCapital {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("China ", "Beijing");
        map.put("Bangladesh", "Dhaka");
        map.put("SriLanka", "Colombo");
        map.put("Pakistan", "Islamabad");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country name to check capital");
        String name = input.next();

        if(map.containsKey(name)){
            System.out.printf("%s capital is : %s", name,map.get(name));
        }else {
            System.out.println("Country is not present in map");
        }
    }
}
