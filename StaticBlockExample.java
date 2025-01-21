public class StaticBlockExample {
    static int number;

    static {
        number = 42; // Static block to initialize the variable
        System.out.println("Static block executed. Number initialized to " + number);
        // We can also initialize the config or auth details here so to run it when class load to class loader
    }

    public static void main(String[] args) {
        System.out.println("The value of the static variable is: " + number);
    }
}
