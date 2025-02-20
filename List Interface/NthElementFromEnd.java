import java.util.LinkedList;

public class NthElementFromEnd {
    private static int fromEnd(LinkedList<Integer> list, int n) {
        if (list == null || list.size() == 0 || n <= 0)
            return -1;

        int slow = 0;
        int fast = 0;
        while (fast < n) {
            if (fast >= list.size())
                return -1;
            fast++;
        }

        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        System.out.println("Original List: " + linkedList);
        System.out.println("3rd element from the end: " + fromEnd(linkedList, 3));
    }
}
