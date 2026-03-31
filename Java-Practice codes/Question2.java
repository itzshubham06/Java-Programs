//Book And Library System
import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println("Title: " + title + 
                           ", Author: " + author + 
                           ", ISBN: " + isbn);
    }
}


class Library {
    ArrayList<Book> books = new ArrayList<>();


    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    void removeBook(String isbn) {
        boolean found = false;

        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            b.display();
        }
    }
}
public class Question2 {
    public static void main(String[] args) {

        Library lib = new Library();

        // Adding books
        lib.addBook(new Book("Java Basics", "James Gosling", "101"));
        lib.addBook(new Book("Python Guide", "Guido van Rossum", "102"));

        // Display books
        lib.displayBooks();

        // Remove a book
        lib.removeBook("101");

        // Display again
        lib.displayBooks();
    }
}