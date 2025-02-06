import java.util.*;

class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }
}

class Order {
    private String orderId;
    private ArrayList<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        if(!products.contains(product)) 
            products.add(product);
        else 
            System.out.println("Product Already There");
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getProductName());
        }
    }
}

class Customer {
    private String customerId;
    private String name;
    private ArrayList<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        if(!orders.contains(order)) 
            orders.add(order);
        else 
            System.out.println("Order Already There");
    }

    public void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.display();
            System.out.println();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Product("1", "Product 1", 100.0);
        Product product2 = new Product("2", "Product 2", 200.0);
        Product product3 = new Product("3", "Product 3", 300.0);

        Order order1 = new Order("1");
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("2");
        order2.addProduct(product2);
        order2.addProduct(product3);

        Customer customer = new Customer("1", "Customer 1");
        customer.addOrder(order1);
        customer.addOrder(order2);

        customer.display();
    }   
}
