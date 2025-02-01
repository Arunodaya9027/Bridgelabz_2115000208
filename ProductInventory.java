class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product() {
        this.productName = "Anonymous Product";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product product1 = new Product("Apple MacBook Air 15", 3999.99);
        product1.displayProductDetails();
        System.out.println();
        Product product2 = new Product("IQOO Z9S Pro", 299.99);
        product2.displayProductDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}