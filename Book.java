import java.util.*;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    
    public static void main(String[] args) {
        String title, author;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Title of Book: ");
        title = input.nextLine();
        System.out.print("\nEnter Author of Book: ");
        author = input.nextLine();
        System.out.print("\nEnter Price of Book: ");
        price = input.nextDouble();
        
        Book book = new Book(title, author, price);
        System.out.println("=== Book Details ===");
        book.display();
        input.close();
    }
}