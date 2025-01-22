import java.util.*;

public class DividingChocolates {
    public static void main(String[] args) {
        int numberOfChocolates, numberOfChildren;
        Scanner input = new Scanner(System.in);
        numberOfChocolates = input.nextInt();
        numberOfChildren = input.nextInt();
        int chocolatesPerChild = numberOfChocolates/numberOfChildren;
        int remainingChocolates = numberOfChocolates%numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d", chocolatesPerChild, remainingChocolates);
        input.close();
    }
}
