class Book {
    final String bookId;
    String bookTitle;
    String author;
    String genre;
    boolean availabilityStatus;
    Book next;
    Book prev;

    public Book(String bookId, String bookTitle, String author, String genre, boolean availabilityStatus) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;        
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
        this.next = this.prev = null;
    }
}

class BookRecord {
    Book head;
    Book tail;

    public int sizeOf() {
        if(head == null)
            return 0;
        
        int count = 0;
        Book temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void addRecordAtBeginning(Book node) {
        if (head == null)
            head = tail = node;
        else 
            node.next = head;
            head.prev = node;
            head = node;
        System.out.println("Book Record is added at the Beginning");
    }

    public void addRecordAtEnd(Book node) {
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Book Record is added at the very end");
    }

    public void addRecordAtMid(Book node, int position) {
        if(head == null && position > 1) {
            System.out.printf("List is empty, can't insert at %d position\n", position);
            return;
        }
        else if(position == 1) 
            addRecordAtBeginning(node);
        else if(position > sizeOf()+1 || position < 1)
            System.out.printf("Out of Bounds, can't insert at %d position\n", position);
        else {
            if(position <= sizeOf()/2) {
                Book temp = head;
                int pointer = position - 1;
                while (--pointer > 0) 
                    temp = temp.next;
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
                node.next.prev = node;
                System.out.printf("Book Record is added at your Position %d\n", position);
            }
            else {
                Book temp = tail;
                int pointer = sizeOf();
                while (pointer-- > position) 
                    temp = temp.prev;
                node.next = temp;
                node.prev = temp.prev;
                temp.prev = node;
                node.prev.next = node;
                System.out.printf("Book Record is added at your Position %d\n", position);
            }
        }
    }

    public void delete(String bookId) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.bookId.equals(bookId)) {
            head = head.next;
            System.out.println("Book Record is deleted");
        }
        else {
            Book temp = head;
            while (temp.next != null) {
                if (temp.next.bookId.equals(bookId)) {
                    temp.next = temp.next.next;
                    System.out.println("Book Record is deleted");
                    return;
                }
                temp = temp.next;
            }

            System.out.printf("Book Record with title %s doesn't exists, can't be deleted\n", bookId);
        }
    }

    public void search(String author) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            Book temp = head;
            while(temp != null) {
                if(temp.author.equals(author)) {
                    System.out.printf("Book of author %s is found at Position %d\n", author, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Book of Author by %s is doesn't exists!\n", author);
        }
    }

    public void forwardDisplay() {
        Book temp = head;
        System.out.println();
        while (temp != null) {
            System.out.println("Book Id: " + temp.bookId);
            System.out.println("Book Name: " + temp.bookTitle);
            System.out.println("Written By: " + temp.author);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Availability Status: " + (temp.availabilityStatus ? "Available" : "Not Available"));
            System.out.println();
            temp = temp.next;
        }
    }

    public void backwardDisplay() {
        Book temp = tail;
        System.out.println();
        while (temp != null) {
            System.out.println("Book Id: " + temp.bookId);
            System.out.println("Book Name: " + temp.bookTitle);
            System.out.println("Written By: " + temp.author);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Availability Status: " + (temp.availabilityStatus ? "Available" : "Not Available"));
            System.out.println();
            temp = temp.prev;
        }
    }

    public void update(String bookId, boolean availabilityStatus) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            Book temp = head;
            while (temp != null) {
                if(temp.bookId.equals(bookId)) {
                    temp.availabilityStatus = (temp.availabilityStatus) ? false : true;
                    System.out.printf("%s Book Record is updated\n", bookId);
                    return;
                }
                temp = temp.next;
            }
            System.out.printf("%s Book Record is doesn't exists!\n", bookId);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord();
        bookRecord.addRecordAtBeginning(new Book("B001", "The Alchemist", "Paulo Coelho", "Adventure", true));
        bookRecord.addRecordAtEnd(new Book("B002", "The Da Vinci Code", "Dan Brown", "Mystery", true));
        bookRecord.addRecordAtMid(new Book("B003", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", true), 2);
        bookRecord.addRecordAtBeginning(new Book("B004", "The Light We Lost", "Jill Santopolo","Romance", true));
        bookRecord.forwardDisplay();
        bookRecord.backwardDisplay();

        bookRecord.delete("B002");
        bookRecord.forwardDisplay();
        bookRecord.backwardDisplay();
        bookRecord.search("Jill Santopolo");
        bookRecord.update("B003", false);
        bookRecord.forwardDisplay();
        bookRecord.backwardDisplay();
        System.out.println("Total Books in Library: " + bookRecord.sizeOf());
    }
}
