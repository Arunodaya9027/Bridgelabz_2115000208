import java.util.*;

public class ReverseString {
	private static String reverse(String str) {
		char[] charArray = str.toCharArray();
		String reverseStr = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseStr += charArray[i];
		}
		return reverseStr;
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