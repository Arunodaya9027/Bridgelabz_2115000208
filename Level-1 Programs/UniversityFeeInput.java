import java.util.*;

public class UniversityFeeInput {
    public static void main(String[] args) {
        int fee, discountPercent;
        Scanner input = new Scanner(System.in);
        fee = input.nextInt();      // fee taken as input
        discountPercent = input.nextInt();      // discount percent is taken in input
        int discount = fee * discountPercent / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}
