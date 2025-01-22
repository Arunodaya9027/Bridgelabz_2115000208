import java.util.*;

public class ComputeTotalIncome {
    public static void main(String[] args) {
        double salary, bonus;
        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f", salary, bonus, totalIncome);
        input.close();
    }    
}
