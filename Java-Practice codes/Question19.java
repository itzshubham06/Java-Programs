class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

public class Question19 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java", "A", 500),
            new Book("Python", "B", 400),
            new Book("C++", "C", 300)
        };

        for (Book b : books) {
            b.display();
        }
    }
}