package com.Enums;

public enum Weekdays {
    MONDAY(true) ,
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    Weekdays(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String isWeekday(){
      return   isWeekday ? "Weekday" : "Weekend";

    }

    public static void main(String[] args) {
        System.out.println("Printing day with its weekday or not");
        for (Weekdays days : Weekdays.values()) {
            System.out.printf("%s : %s \n", days ,days.isWeekday());
        }
    }

}
