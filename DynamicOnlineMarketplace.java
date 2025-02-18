class Category {
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategory() {return categoryName;}
}

class BookCategory extends Category {
    public BookCategory(String categoryName) {
        super("Book");
    }
}

class ClothingCategory extends Category {
    public ClothingCategory(String categoryName) {
        super("Clothing");
    }
}

class ElectronicsCategory extends Category {
    public ElectronicsCategory(String categoryName) {
        super("Electronics");
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    private double discountedPrice;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.discountedPrice = price;
        this.category = category;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + " \t| Category: " + category.getCategory() + " \t| Price: $" + price + " \t| Price After Discount: $" + discountedPrice);
    }

    public double getPrice() {return price;}
    public void setDiscountedPrice(double price) {this.discountedPrice = price;}
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setDiscountedPrice(discountedPrice);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        BookCategory book = new BookCategory("Books");
        ClothingCategory clothing = new ClothingCategory("Clothing");
        ElectronicsCategory electronics = new ElectronicsCategory("Electronics");

        Product<BookCategory> product1 = new Product<>("Java Programming", 49.99, book);
        Product<ClothingCategory> product2 = new Product<>("T-Shirt", 19.99, clothing);
        Product<ElectronicsCategory> product3 = new Product<>("Smartphone", 399.99, electronics);

        Marketplace.applyDiscount(product1, 10);
        Marketplace.applyDiscount(product3, 5);

        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();
    }
}
