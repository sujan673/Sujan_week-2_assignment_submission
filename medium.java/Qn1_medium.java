class book {
     String title;
     String author;
     int ISBN;

    // Constructor
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
    }
}           
     public class Qn1_medium {
    public static void main(String[] args) {
        // Correct object creation
        book Book1 = new book("Rich Dad Poor Dad","Suraj Khanal", 1123);
        book Book2 = new book("C programming", "ABC", 1121);
        book Book3 = new book("Business Communication", "DEF",1231 );
        book Book4 = new book("Data Structure", "GHI", 112233);
        book Book5 = new book("Mathematics", "JKL", 12344);
        // Display details
        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();

    }
}
