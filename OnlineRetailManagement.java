import java.time.*;

class Order {
    private String orderId;
    private LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public void orderStatus() {
        System.out.println("Order Status: Order Done, Shipping Pending");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println();
    }
}

class ShippedOrder extends Order {
    private final String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    @Override
    public void orderStatus() {
        System.out.println("Order Status: Order out for Shipping");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Tracking Number: " + getTrackingNumber());
        System.out.println();
    }
}

class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void orderStatus() {
        System.out.println("Order Status: Order Shipped, set out for Delivery");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Tracking Number: " + getTrackingNumber());
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println();
    }
}

public class OnlineRetailManagement {
    public static void main(String[] args) {
        Order order1 = new Order("O1", LocalDate.of(2023, 1, 15));
        order1.orderStatus();

        Order order2 = new ShippedOrder("O2", LocalDate.of(2025, 1, 22), "T1");
        order2.orderStatus();

        Order order3 = new DeliveredOrder("O3", LocalDate.of(2025,2, 4), "T2", LocalDate.now());
        order3.orderStatus();
    }
}
