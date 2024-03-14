package com.Inheritance;

public class Magzine extends LibraryItem{
    protected int issueNumber;

    public Magzine(int titleID, String title, String author, int issueNumber) {
        super(titleID, title, author);
        this.issueNumber = issueNumber;
    }


}
