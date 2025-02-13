import java.util.*;

class Queue {
    Stack<Integer> enqueue = new Stack<>();
    Stack<Integer> dequeue = new Stack<>();
    
    public void enqueue(int num) {
        enqueue.push(num);
    }
    
    public int dequeue() {
        if (dequeue.isEmpty()) {
            if (enqueue.isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }
            while (!enqueue.isEmpty()) {
                dequeue.push(enqueue.pop());
            }
        }
        return dequeue.pop();
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner input = new Scanner(System.in);
        boolean choice = true;
        while (choice) {
            System.out.println("Enqueue(1) or Dequeue(2) or Exit(3)?");
            int operation = input.nextInt();

            switch(operation) {
                case 1:
                    q.enqueue(input.nextInt());
                    break;
                case 2:
                    int element = q.dequeue();
                    if(element != -1)
                        System.exit(-1);
                    System.out.println("Dequeue operation: " + element);
                    break;
                case 3:
                    System.out.println("Exiting");
                    choice = false;
                    break;
                default:
                    System.out.println("Invalid operation! Please enter Enqueue, Dequeue, or Exit.");
            }
        }
        input.close();
    }
}
