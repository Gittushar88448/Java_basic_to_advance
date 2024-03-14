package com.Inheritance;

public class Book extends LibraryItem{
    protected int ISBN;

    public Book(int titleID, String title, String author, int ISBN) {
        super(titleID, title, author);
        this.ISBN = ISBN;
    }
}