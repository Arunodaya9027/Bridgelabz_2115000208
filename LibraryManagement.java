class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void displayInfo() {
        System.out.printf("Title: %s\n", getTitle());
        System.out.printf("Publication Year: %d\n", getPublicationYear());
        author.displayInfo();
    }
}

class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

    public void displayInfo() {
        System.out.printf("Author Name: %s\n", getName());
        System.out.printf("Author Bio: %s\n", getBio());
        System.out.println();
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "J.K. Rowling is a British author, philanthropist, film producer, television producer, and screenwriter.");
        Author author2 = new Author("Jill Santopolo", "Jill Santopolo is an American author known for her novel 'The Light We Lost'.");
        
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 1997, author1);
        Book book2 = new Book("The Light We Lost", 2017, author2); 

        book1.displayInfo();
        book2.displayInfo();
    }    
}
