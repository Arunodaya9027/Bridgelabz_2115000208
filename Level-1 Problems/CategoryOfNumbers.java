import java.util.*;

public class CategoryOfNumber {
	public int nature(int num) {
		if(num > 0)
			return 1;
		else if(num < 0)
			return -1;
		else
			return 0;
	}
	
	public static void main (String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		CategoryOfNumber obj = new CategoryOfNumber();
		System.out.printf(obj.nature(number));
		obj.close();
		input.close();
	}
}