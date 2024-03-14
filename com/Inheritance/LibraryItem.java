package com.Inheritance;

//Start with a base class LibraryItem that includes common attributes like itemID, title, and author, and methods like
// checkout() and returnItem(). Create subclasses such as Book,Magazine, and DVD, each inheriting from LibraryItem.
// Add unique attributes to each subclass, like ISBN for Book, issueNumber for Magazine, and duration for DVD.
public class LibraryItem {

   protected int titleID;
   protected String title;
   protected String author;

    protected void checkout(){
        System.out.println("Checkout the book from self");
    }
    protected  void returnItem(){
        System.out.println("Returning the book");

    }

    public LibraryItem(int titleID, String title, String author) {
        this.titleID = titleID;
        this.title = title;
        this.author = author;
    }




}
