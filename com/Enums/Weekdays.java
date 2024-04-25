package com.Enums;

public enum Weekdays {
    MONDAY , TUESDAY, WEDNESDAY , THURSDAY , FRIDAY, SATURDAY , SUNDAY;

    public static void main(String[] args) {
        for(Weekdays days : Weekdays.values()){
            System.out.println(days);
        }
    }

}
