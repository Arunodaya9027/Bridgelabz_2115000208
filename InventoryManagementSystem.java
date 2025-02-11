class Inventory {
    String itemId;
    String itemName;
    double quantity;
    double price;
    Inventory next;

    public Inventory(String itemId, String itemName, double quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}


class InventoryLinkedList {
    Inventory head;

    public int sizeOf() {
        if(head == null)
            return 0;
        
        int count = 0;
        Inventory temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void addRecordAtBeginning(Inventory node) {
        if (head == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }
        System.out.println("Inventory Log is added at the Beginning");
    }

    public void addRecordAtEnd(Inventory node) {
        if (head == null)
            head = node;
        else {
            Inventory temp = head;
            while (temp.next != null) 
                temp = temp.next;
            temp.next = node;
        }
        System.out.println("Inventory Log is added at the very end");
    }

    public void addRecordAtMid(Inventory node, int position) {
        if(head == null && position > 1) {
            System.out.printf("List is empty, can't insert at %d position\n", position);
            return;
        }
        else if(position == 1) 
            addRecordAtBeginning(node);
        else if(head != null && position == sizeOf()+1)
            addRecordAtEnd(node);
        else if(position > sizeOf()+1 || position < 1)
            System.out.printf("Out of Bounds, can't insert at %d position\n", position);
        else {
            Inventory temp = head;
            int pointer = position - 1;
            while (--pointer > 0) 
                temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            System.out.printf("Inventory Log is added at your Position %d\n", position);
        }
    }

    public void delete(String itemId) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.itemId.equals(itemId)) {
            head = head.next;
            System.out.println("Inventory Log is deleted");
        }
        else {
            Inventory temp = head;
            while (temp.next != null) {
                if (temp.next.itemId.equals(itemId)) {
                    temp.next = temp.next.next;
                    System.out.println("Inventory Log is deleted");
                    return;
                }
                temp = temp.next;
            }

            System.out.printf("Inventory Log with Item Id %s doesn't exists, can't be deleted\n", itemId);
        }
    }

    public void update(String itemId, double quantity) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            Inventory temp = head;
            while (temp != null) {
                if(temp.itemId.equals(itemId)) {
                    temp.quantity = quantity;
                    System.out.printf("Inventory Log with Item Id %s is updated\n", itemId);
                    return;
                }
                temp = temp.next;
            }
            System.out.printf("Inventory Log with Item Id %s is doesn't exists!\n", itemId);
        }
    }

    public void search(String itemId) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            Inventory temp = head;
            while(temp != null) {
                if(temp.itemId.equals(itemId)) {
                    System.out.printf("Inventory Log with Item Id %s is found at Position %d\n", itemId, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Inventory Log with Item Id %s is doesn't exists!\n", itemId);
        }
    }

    public void display() {
        Inventory temp = head;
        System.out.println();
        while (temp != null) {
            System.out.println("Item Id: " + temp.itemId);
            System.out.println("Item Name: " + temp.itemName);
            System.out.println("Price per Unit: " + temp.price);
            System.out.println("Quantity: " + temp.quantity);
            System.out.println("Total Value of Inventory: " + temp.price * temp.quantity);
            System.out.println();
            temp = temp.next;
        }
    }

    public void sortOnPrice() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            Inventory temp = head;
            while(temp != null) {
                Inventory nextTemp = temp.next;
                while(nextTemp != null) {
                    if(temp.price > nextTemp.price) {
                        String itemId = temp.itemId;
                        String itemName = temp.itemName;
                        double quantity = temp.quantity;
                        double price = temp.price;

                        temp.itemId = nextTemp.itemId;
                        temp.itemName = nextTemp.itemName;
                        temp.quantity = nextTemp.quantity;
                        temp.price = nextTemp.price;

                        nextTemp.itemId = itemId;
                        nextTemp.itemName = itemName;
                        nextTemp.quantity = quantity;
                        nextTemp.price = price;
                    }
                    nextTemp = nextTemp.next;
                }
                temp = temp.next;
            }
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        inventory.addRecordAtBeginning(new Inventory("I001", "Laptop", 10, 50000));
        inventory.addRecordAtEnd(new Inventory("I002", "Mobile", 20, 20000));
        inventory.addRecordAtMid(new Inventory("I003", "Tablet", 30, 10000), 2);
        inventory.addRecordAtMid(new Inventory("I004", "Desktop", 40, 40000), 4);
        inventory.addRecordAtMid(new Inventory("I005", "Smart Watch", 50, 5000), 5);
        inventory.display();
        inventory.delete("I003");
        inventory.update("I004", 45);
        inventory.search("I002");
        inventory.sortOnPrice();
        inventory.display();
    }
}
