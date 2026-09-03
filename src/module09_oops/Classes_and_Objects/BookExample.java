package module09_oops.classes_and_objects;

class Book {
    // Properties (fields)
    String title;
    String author;
    int pages;

    // Method
    void displayDetails() {
        System.out.println("Book: " + title + " by " + author + ", Pages: " + pages);
    }
}

public class BookExample {
    public static void main(String[] args) {
        // Create object
        Book myBook = new Book();

        // Assign values directly (no constructor)
        myBook.title = "Learn Java Easily";
        myBook.author = "Shailesh";
        myBook.pages = 150;

        // Call method
        myBook.displayDetails();
    }
}
