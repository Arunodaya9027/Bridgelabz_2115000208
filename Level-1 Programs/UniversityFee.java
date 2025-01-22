public class UniversityFee {
    public static void main(String[] args) {
        int fee = 125000;       // Given fee
        int discountPercent = 10;
        int discount = fee * discountPercent / 100;		// Discounted Price
        int finalFee = fee - discount;		// fee after discount
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }   
}
