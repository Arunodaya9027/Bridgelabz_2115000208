class BorrowBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public BorrowBook() {
        this.title = "Library Rule Book";
        this.author = "Anonymous";
        this.price = 0.0;
        this.availability = true;
    }

    public BorrowBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public BorrowBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    private boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean newAvailability) {
        this.availability = newAvailability;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + getAvailability());
    }

    public void borrow() {
        if (getAvailability()) {
            setAvailability(false);
            System.out.println("Book borrowed successfully!");
        } 
        else 
            System.out.println("Book is not available!");
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        BorrowBook book1 = new BorrowBook("The Light We Lost", "Jill Santopolo", 10.99);
        BorrowBook book2 = new BorrowBook("1984", "George Orwell", 12.99);

        book1.display();
        book1.borrow();

        book2.display();
        book2.borrow();
        book2.borrow();
    }
}