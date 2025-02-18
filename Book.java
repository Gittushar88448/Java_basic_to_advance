public class Book {
    static  int totalBook;
    int isbn;
    String title;
    String author;

    boolean isBorrowed;

    static {
        totalBook = 0;
    }
    {
        totalBook++;
    }

    static int getTotalBook(){
        return totalBook;
    }

    Book(int isbn , String author , String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(int isbn){
        this(isbn , "unknown" , "unknown");
    }

     void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already been borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy your learning!");
        }
    }
    void returnBook(){
        if(isBorrowed){
            System.out.println("returning book");
            this.isBorrowed = false;
        }else {
            System.out.println("Book is already in the self");
        }
    }

    public static void main(String[] args) {
        Book richDadPoorDad = new Book(4343 , "RobertKwsaki" , "cashflow");
        Book onTheWay = new Book(4344 , "JackRoot" , "motivational");

        richDadPoorDad.borrowBook();
        onTheWay.borrowBook();
        System.out.println(getTotalBook());
        richDadPoorDad.borrowBook();
        richDadPoorDad.returnBook();
        richDadPoorDad.returnBook();

    }
}
