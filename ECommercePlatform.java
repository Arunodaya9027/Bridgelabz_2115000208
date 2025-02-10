abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {return productId;}
    public String getName() {return name;}
    public double getPrice() {return price;}

    public abstract double calculateDiscount();
    public abstract double finalPrice();

    public void display() {
        System.out.println();
        System.out.println("Product Id: " + getProductId());
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Discount: " + calculateDiscount());
    }
}

interface Taxable {
    void calculateTax();
    double getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double tax;
    private double discount;

    public Electronics(String productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
        calculateTax();
    }

    @Override
    public double calculateDiscount() {
        return this.discount;
    }

    @Override
    public void calculateTax() {
        this.tax = getPrice() * 0.28;
    }

    @Override
    public double getTaxDetails() {
        return this.tax;
    }

    @Override
    public double finalPrice() {
        return (getPrice() + getTaxDetails() - calculateDiscount());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax: " + getTaxDetails());
        System.out.println("Final Cost: " + finalPrice());
    }
}

class Clothing extends Product implements Taxable {
    private double tax;
    private double discount;

    public Clothing(String productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
        calculateTax();
    }

    @Override
    public double calculateDiscount() {
        return this.discount;
    }

    @Override
    public void calculateTax() {
        this.tax = getPrice() * 0.22;
    }

    @Override
    public double getTaxDetails() {
        return this.tax;
    }
    
    @Override
    public double finalPrice() {
        return (getPrice() + getTaxDetails() - calculateDiscount());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax: " + getTaxDetails());
        System.out.println("Final Cost: " + finalPrice());
    }
}

class Groceries extends Product implements Taxable {
    private double tax;
    private double discount;

    public Groceries(String productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
        calculateTax();
    }

    @Override
    public double calculateDiscount() {
        return this.discount;
    }

    @Override
    public void calculateTax() {
        this.tax = getPrice() * 0.18;
    }

    @Override
    public double getTaxDetails() {
        return this.tax;
    }
    
    @Override
    public double finalPrice() {
        return (getPrice() + getTaxDetails() - calculateDiscount());
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Tax: " + getTaxDetails());
        System.out.println("Final Cost: " + finalPrice());
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics("E101", "Laptop", 45000, 5000);
        products[1] = new Clothing("C201", "Shirt", 1500, 200);
        products[2] = new Groceries("G301", "Rice", 1000, 100);

        for (Product product : products) 
            if(product instanceof Product)
                product.display();
    }
}