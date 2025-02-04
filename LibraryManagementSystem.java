class Book {
    private String title;
    private String author;
    private final String isbn;
    protected static String libraryName;

    Book () {
        this.title = "Library Rules";
        this.author = "Anonymous";
        this.isbn = "0000-0000-0000-0000";
    }

    Book (String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.libraryName = "Deeksha Library";
        Book book1 = new Book("The Light We Lost", "Jill Santopolo", "978-1-250-30631-1");
        if(book1 instanceof Book)
            book1.display();
        Book book2 = new Book();
        if(book2 instanceof Book)
            book2.display();
        Book.displayLibraryName();
        Book book3 = new Book("The Kite Runner", "Khaled Hosseini", "978-1-59448-000-3");
        if(book3 instanceof Book)
            book3.display();
    }
}