class Product {
    private static int discount;
    private String productName;
    private double price;
    private int quantity;
    private final String productId;

    Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
        this.productId = "Z000";
    }

    Product(String productName, double price, int quantity, String productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    public void display() {
        if(this instanceof Product) {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Price After Discount: " + price*(100-discount)/100);
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product.updateDiscount(15);
        Product product1 = new Product();
        product1.display();
        Product product2 = new Product("Laptop", 45000.0, 5, "L001");
        product2.display();
        Product.updateDiscount(10);
        Product product3 = new Product("Mobile", 15000.0, 10, "M001");
        product3.display();
    }
}
