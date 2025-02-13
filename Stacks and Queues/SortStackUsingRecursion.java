import java.util.*;

public class SortStackUsingRecursion {
    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) 
            return;
        int temp = stack.pop();
        sort(stack);
        insert(stack, temp);
    }

    public static void insert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element)
            stack.push(element);
        else {
            int temp = stack.pop();
            insert(stack, element);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean choice = true;
        Scanner input = new Scanner(System.in);
        while (choice) {
            System.out.println("Push(1) or Sort(2) or Exit(3)?");
            int operation = input.nextInt();

            switch(operation) {
                case 1:
                    stack.push(input.nextInt());
                    break;
                case 2:
                    sort(stack);
                    System.out.println("Sorted stack: " + stack);
                    break;
                case 3:
                    System.out.println("Exiting");
                    choice = false;
                    break;
                default:
                    System.out.println("Invalid operation! Please enter Push, Sort, or Exit.");
            }
        }
        input.close();
    }
}
