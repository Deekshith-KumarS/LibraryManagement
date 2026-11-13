package org.example;

class Book {
    int bookId;
    String bookName;
    String authorName;
    boolean available;

    Book(int bookId, String bookName, String authorName, boolean available) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.available = available;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "Herbert Schildt", true);
        Book b2 = new Book(102, "Clean Code", "Robert C. Martin", false);
        Book b3 = new Book(103, "Data Structures", "Mark Allen Weiss", true);

        b1.display();
        b2.display();
        b3.display();
    }
}