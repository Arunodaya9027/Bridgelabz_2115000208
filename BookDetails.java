class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Help Book";
        this.author = "Anonymous";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();
        System.out.println();
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 20.0);
        book2.display();
    }
}
