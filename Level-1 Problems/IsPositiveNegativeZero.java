import java.util.*;

public class IsPosisiveNegativeZero {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scannner(System.in);
		number = input.nextInt();
		if(number < 0)
			System.out.println("Negative");
		else if(number > 0)
			System.out.println("Positive");
		else
			System.out.println("Zero");
		input.close();
	}
}
