class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Anonymous";
        this.roomType = "Normal";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = 1;
    }

    public HotelBooking(String guestName, int nights) {
        this.guestName = guestName;
        this.roomType = "Normal";
        this.nights = nights;
    }

    public HotelBooking(HotelBooking previousReservation) {
        this.guestName = previousReservation.guestName;
        this.roomType = previousReservation.roomType;
        this.nights = previousReservation.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking reservation1 = new HotelBooking("Amit Kumar", "Suite", 3);
        reservation1.display();
        System.out.println();
        HotelBooking reservation2 = new HotelBooking("Karan Seangar", "King Room");
        reservation2.display();
        System.out.println();
        HotelBooking reservation3 = new HotelBooking("Arnav Rajput", 2);
        reservation3.display();
        System.out.println();
        HotelBooking reservation4 = new HotelBooking(reservation2);
        reservation4.display();
    }
}