import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayItemInfo();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand);
    }
}

class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String name, String expirationDate) {
        super(name);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Groceries: " + getName() + " | Expiration Date: " + expirationDate);
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Furniture: " + getName() + " | Material: " + material);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> storedItems = new ArrayList<>();

    public void addItem(T item) {
        storedItems.add(item);
    }

    public List<T> getList() {
        return storedItems;
    }
}

class WarehouseUtility {
    public static void displayWarehouseItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayItemInfo();
        }
    }
}

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Electronics kettle = new Electronics("Electric Kettle", "Milton");
        Groceries bread = new Groceries("Brown Bread", "2025-02-22");
        Furniture chair = new Furniture("Chair", "Wood");

        Storage<WarehouseItem> storage = new Storage<>();
        storage.addItem(kettle);
        storage.addItem(bread);
        storage.addItem(chair);

        List<WarehouseItem> itemList = storage.getList();
        System.out.println("----- Items in Storage -----");
        WarehouseUtility.displayWarehouseItems(itemList);
    }
}
