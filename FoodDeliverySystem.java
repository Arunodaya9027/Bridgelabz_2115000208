interface Discountable {
    void applyDiscount();
    double getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {return itemName;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    public abstract double calculateTotalPrice();

    public void getItemDetails () {
        System.out.println();
        System.out.println("Item Name: " + getItemName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount;
    private double totalDiscount;

    public VegItem(String itemName, double price, int quantity, double discount) {
        super(itemName, price, quantity);
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - getDiscountDetails();
    }

    @Override
    public void applyDiscount() {
        this.totalDiscount = getPrice() * getQuantity() * discount;
    }

    @Override
    public double getDiscountDetails() {
        return this.totalDiscount;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Discount: " + getDiscountDetails());
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double totalDiscount;

    public NonVegItem(String itemName, double price, int quantity, double discount) {
        super(itemName, price, quantity);
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - getDiscountDetails();
    }

    @Override
    public void applyDiscount() {
        this.totalDiscount = getPrice() * getQuantity() * discount;
    }

    @Override
    public double getDiscountDetails() {
        return this.totalDiscount;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Discount: " + getDiscountDetails());
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[2];
        items[0] = new VegItem("Paneer Tikka", 200, 2, 0.1);
        items[1] = new NonVegItem("Chicken Tikka", 300, 2, 0.15);

        for (FoodItem item : items) {
            if (item instanceof Discountable)
                ((Discountable) item).applyDiscount();
            item.getItemDetails();
        }
    }
}
