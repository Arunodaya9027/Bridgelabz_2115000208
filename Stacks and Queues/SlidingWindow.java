import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = input.nextInt();
        
        int k = input.nextInt();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        
        for (int i = k; i < len; i++) {
            System.out.print(arr[deque.peek()] + " ");
            while (!deque.isEmpty() && deque.peek() <= i - k)
                deque.removeFirst();
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()]);
        input.close();
    }   
}
