import java.util.*;

public class ZaraEmployeesBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_EMPLOYEES = 10;
        double[] salary = new double[NUMBER_OF_EMPLOYEES];
        double[] yearsOfService = new double[NUMBER_OF_EMPLOYEES];
        double[] newSalary = new double[NUMBER_OF_EMPLOYEES];
        double[] bonus = new double[NUMBER_OF_EMPLOYEES];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        int index = 0;

        while (index < 10) {
            System.out.print("Enter salary and years of service for employee " + (index + 1) + ": ");
            double sal = input.nextDouble();
            double years = input.nextDouble();
            if (sal <= 0 || years <= 0) {
                System.out.println("Invalid input. Please enter again.");
                continue;
            }
            salary[index] = sal;
            yearsOfService[index] = years;
            index++;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) 
                bonus[i] = salary[i] * 0.05; 
            else 
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.printf("Total bonus payout is %.2f", totalBonus);
        System.out.printf("Total old salary is %.2f", totalOldSalary);
        System.out.printf("Total new salary is %.2f",totalNewSalary);
        input.close();
    }
}
