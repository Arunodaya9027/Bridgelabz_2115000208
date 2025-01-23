import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        double salary, bonus = 0.0;
        int years;
        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        years = input.nextInt();
        if(years > 5){
            bonus = salary * 0.05;
            System.out.printf("The bonus amount is %.2f", bonus);
        }else{
            System.out.printf("The employee is not eligible for the bonus");
        }
        input.close();
    }
}
