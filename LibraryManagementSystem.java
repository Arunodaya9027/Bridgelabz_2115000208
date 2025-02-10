import java.util.*;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {return itemId;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println();
        System.out.println("Item Number: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }
}

class Book extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isAvailable;
    private int loanDuration;

    public Book(String itemId, String title, String author, int loanDuration, String borrowerName) {
        super(itemId, title, author);
        this.borrowerName = borrowerName;
        this.loanDuration = loanDuration;
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return this.loanDuration;
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            isAvailable = false;
            System.out.println("Book reserved successfully for " + borrowerName);
        } 
        else 
            System.out.println("Book is not available for reservation for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

class Magzine extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isAvailable;
    private int loanDuration;

    public Magzine(String itemId, String title, String author, int loanDuration, String borrowerName) {
        super(itemId, title, author);
        this.borrowerName = borrowerName;
        this.loanDuration = loanDuration;
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return this.loanDuration;
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            isAvailable = false;
            System.out.println("Magzine reserved successfully for " + borrowerName);
        } 
        else 
            System.out.println("Magzine is not available for reservation for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isAvailable;
    private int loanDuration;

    public DVD(String itemId, String title, String author, int loanDuration, String borrowerName) {
        super(itemId, title, author);
        this.borrowerName = borrowerName;
        this.loanDuration = loanDuration;
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return this.loanDuration;
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            isAvailable = false;
            System.out.println("DVD reserved successfully for " + borrowerName);
        } 
        else 
            System.out.println("DVD is not available for reservation for " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Java Programming", "Jeshaan", 14, "Pawan"));
        items.add(new Magzine("M001", "The Vogue", "Jane Doe", 7, "Alicia"));
        items.add(new DVD("D001", "Avengers", "Stan Lee", 3, "Vinod"));

        for(LibraryItem item: items) {
            item.getItemDetails();
            ((Reservable) item).reserveItem();
        }
        System.out.println();
        ((Reservable) items.get(1)).reserveItem();
    }
}