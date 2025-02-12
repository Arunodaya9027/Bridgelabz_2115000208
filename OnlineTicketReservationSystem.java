class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    Ticket head;

    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket node = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
        }
        System.out.println("Ticket is added at the very end");
    }

    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("List is empty, can't remove any ticket");
            return;
        }

        Ticket temp = head;
        Ticket prev = null;
        do {
            if (temp.ticketID == ticketID) {
                if (temp == head) {
                    Ticket last = head;
                    while (last.next != head)
                        last = last.next;
                    if (head == head.next)
                        head = null;
                    else {
                        head = head.next;
                        last.next = head;
                    }
                } else
                    prev.next = temp.next;
                System.out.println("Ticket with ID " + ticketID + " is removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.printf("Ticket with ID %d doesn't exists, can't be removed\n", ticketID);
    }

    public void searchTicket(String name) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Ticket temp = head;
        do {
            if (temp.movieName.equals(name)) {
                System.out.println("Ticket with Movie Name " + name + " is found");
                System.out.println("Ticket ID: " + temp.ticketID);
                System.out.println("Customer Name: " + temp.customerName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                return;
            } else if (temp.customerName.equals(name)) {
                System.out.println("Ticket with Customer Name " + name + " is found");
                System.out.println("Ticket ID: " + temp.ticketID);
                System.out.println("Movie Name: " + temp.movieName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.printf("Ticket with Customer/Movie Name %s doesn't exists!\n", name);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketID);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Seat Number: " + temp.seatNumber);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println();
            temp = temp.next;
        } while (temp != head);
    }

    public int totalTickets() {
        if (head == null)
            return 0;

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        trs.addTicket(1, "Alice", "Inception", 1, "10:00 AM");
        trs.addTicket(2, "Bob", "Interstellar", 2, "11:00 AM");
        trs.addTicket(3, "Charlie", "Inception", 3, "12:00 PM");
        trs.addTicket(4, "David", "Interstellar", 4, "01:00 PM");
        trs.addTicket(5, "Alice", "Inception", 5, "02:00 PM");

        trs.displayTickets();
        System.out.println("Total Tickets: " + trs.totalTickets());

        trs.removeTicket(3);
        trs.removeTicket(6);

        trs.searchTicket("Alice");
        trs.searchTicket("Inception");
        trs.searchTicket("Charlie");

        trs.displayTickets();
        System.out.println("Total Tickets: " + trs.totalTickets());
    }
}
