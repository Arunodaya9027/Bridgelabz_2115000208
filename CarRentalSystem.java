class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double PER_DAY_COST = 19.9;

    public CarRental() {
        this.customerName = "Anonymous";
        this.carModel = "Lower";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public CarRental(String customerName, String carModel) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = 1;
    }

    public CarRental(String customerName, int rentalDays) {
        this.customerName = customerName;
        this.carModel = "Lower";
        this.rentalDays = rentalDays;
    }

    public CarRental(CarRental previousRental) {
        this.customerName = previousRental.customerName;
        this.carModel = previousRental.carModel;
        this.rentalDays = previousRental.rentalDays;
    }

    private double totalCost() {
        return PER_DAY_COST * rentalDays;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Number of Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Manish Talpade", "SUV", 3);
        rental1.display();
        System.out.println();
        CarRental rental2 = new CarRental("Vijay Rana", "Premium");
        rental2.display();
        System.out.println();
        CarRental rental3 = new CarRental("Arunodaya Pratap Singh", 2);
        rental3.display();
        System.out.println();
        CarRental rental4 = new CarRental(rental2);
        rental4.display();
    }
}