import java.util.*;

public class ReverseString {
	private static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		String reverseStr = reverse(str);
		System.out.printf("Reverse String is %s", reverseStr);
		input.close();
	}
}