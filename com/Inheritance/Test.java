package com.Inheritance;

public class Test {
    public static void main(String[] args) {
        LibraryItem lib = new LibraryItem(1,"gold","John Mark");
        Book stockAnalysis = new Book(2 , "stock prediction","Charlie Hardy" ,4453 );
        Magzine latest = new Magzine(12 , "business ideas" , "Khetan Pareek" , 882);
        DVD listenBook = new DVD(12 , "gate" , "Ram das chaturwedi", 23.57);

        lib.checkout();
        lib.returnItem();
        stockAnalysis.checkout();
        System.out.println(stockAnalysis.ISBN);
    }
}
