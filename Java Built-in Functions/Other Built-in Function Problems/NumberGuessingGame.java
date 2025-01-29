import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Try to guess random number between 1 and 100");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            count++;

            if (guess < number) 
                System.out.println("Too low! Try again.");
            else if (guess > number) 
                System.out.println("Too high! Try again."); 
            else 
                System.out.println("Congratulations! You've guessed the number in " + count + " tries!");
        }
        input.close();
    }
}
