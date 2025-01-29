import java.util.*;

public class ToogleCaseCharacters {
	private static String toogleCase(String str) {
		char[] strToCharArray = str.toCharArray();
		for(int i=0; i<strToCharArray.length; i++) {
			int charAscii = strToCharArray[i];
			if(charAscii >= 65 && charAscii <= 90) 
				charAscii += 32;
			else if(charAscii >= 97 && charAscii <= 122) 
				charAscii -= 32;
			strToCharArray[i] = (char)charAscii;
		}
		
		return new String(strToCharArray);
	}
	
	public static void main(String[] args) {
		String str, toogleCasedString;
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		toogleCasedString = toogleCase(str);
		System.out.printf("\"%s\" after toogle case on characters becomes \"%s\"", str, toogleCasedString);
		input.close();
	}
}