import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.err.println("Error! Please enter a natural number");
            System.exit(0);
        }

        String[] fizzBuzz = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) 
                fizzBuzz[i] = "FizzBuzz";
            else if (i % 3 == 0)
                fizzBuzz[i] = "Fizz";
            else if (i % 5 == 0)
                fizzBuzz[i] = "Buzz";
            else
                fizzBuzz[i] = String.valueOf(i);
        }

        for (int i = 0; i <= number; i++) 
            System.out.printf("Position %d = %s\n", i, fizzBuzz[i]);
        input.close();
    }
}
