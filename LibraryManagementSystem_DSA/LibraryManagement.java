class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author);
    }
}

class SearchOperations {

    // Linear Search
    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        // Books sorted by title
        Book[] books = {
                new Book(101, "C++", "Bjarne Stroustrup"),
                new Book(102, "DBMS", "Korth"),
                new Book(103, "Java", "James Gosling"),
                new Book(104, "Python", "Guido van Rossum")
        };

        String searchTitle = "Java";

        System.out.println("Linear Search:");
        Book result1 = SearchOperations.linearSearch(books, searchTitle);

        if (result1 != null)
            result1.display();
        else
            System.out.println("Book not found");

        System.out.println("\nBinary Search:");
        Book result2 = SearchOperations.binarySearch(books, searchTitle);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Book not found");
    }
}