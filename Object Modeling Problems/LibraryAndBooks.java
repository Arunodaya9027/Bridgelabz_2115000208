import java.util.*;

class Library {
    private String libraryName;
    private ArrayList<Book> books;
    private int totalBooksInLibrary = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        if(!books.contains(book)) {
            books.add(book);
            totalBooksInLibrary++;
        }
        else {
            System.out.println("Book Already There");
        }
    }

    public void displayBooks() {
        System.out.println("***********************************************");
        System.out.println("        Library Name: " + libraryName);
        System.out.println("        Total Books In Library: " + totalBooksInLibrary);
        System.out.println("***********************************************");
        for (Book book : books) {
            book.display();
            System.out.println();    
        }
    }
}

class Book {
    private String title;
    private String author;
    private final String isbn;
    private Library library;

    public Book(Library library) {
        this.title = "Library Rules";
        this.author = "Anonymous";
        this.isbn = "0000-0000-000-00";
        this.library = library;
        this.library.addBook(this);
    }

    public Book(String title, String author, String isbn, Library library) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.library = library;
        this.library.addBook(this);
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Library library1 = new Library("City Library");
        Library library2 = new Library("Geetanjali Library");
        Book book1 = new Book("Java Programming", "James Gosling", "978-0-13-468599-1", library1);
        Book book2 = new Book("Python Programming", "Guido van Rossum", "978-0-13-486779-1", library1);
        Book book3 = new Book("C Programming", "Dennis Ritchie", "978-0-13-110362-7", library1);
        Book book4 = new Book("The Light We Lost", "Jill Santopolo", "978-1-250-30631-1", library2);
        Book book5 = new Book("The Alchamist", "J. Kepler", "468-44-48646-7", library2);
        Book book6 = new Book("The Monk Who Sold His Ferrari", "Gary P.", "8465-5-55-545", library1);
        Book book7 = new Book("The Kite Runner", "Khaled Hosseini", "978-1-59448-000-3", library2);
        Book book8 = new Book(library2);

        book1.display();
        book5.display();
        book8.display();
        
        library1.displayBooks();
        library2.displayBooks();
    }
}