import java.util.*;

class Node {
    int key;
    int value;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    private static final int SIZE = 1000;
    private Node[] map;

    MyHashMap() {
        map = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node current = map[index];
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = map[index];
        map[index] = newNode;
    }

    public int get(int key) {
        int index = hash(key);
        Node current = map[index];
        while (current != null) {
            if (current.key == key)
                return current.value;
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node current = map[index];
        if (current == null)
            return;
        if (current.key == key) {
            map[index] = current.next;
            return;
        }
        while (current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of operations:");
        int operations = input.nextInt();
        for (int i = 0; i < operations; i++) {
            System.out.println("Enter operation (put/get/remove):");
            String operation = input.next();
            if (operation.equals("put")) {
                System.out.println("Enter the key:");
                int key = input.nextInt();
                System.out.println("Enter value:");
                int value = input.nextInt();
                map.put(key, value);
            } 
            else if (operation.equals("get")) {
                System.out.println("Enter the key:");
                int key = input.nextInt();
                System.out.println(map.get(key));
            } 
            else if (operation.equals("remove")) {
                System.out.println("Enter the key:");
                int key = input.nextInt();
                map.remove(key);
            }
        }
        input.close();
    }
}
