package com.Inheritance;

public class DVD extends LibraryItem{


      protected double duration;

        public DVD(int titleID, String title, String author, double duration) {
            super(titleID, title, author);
            this.duration = duration;
        }

}
