import java.util.*;

public class AmarAkbarAnthony {
	public static void main(String[] args) {
		int amarAge, akbarAge, anthonyAge, amarHeight, akbarHeight, anthonyHeight;
		Scanner input = new Scanner(System.in);
		amarAge = input.nextInt();	//Amar's age
		akbarAge = input.nextInt();	//Akbar's age
		anthonyAge = input.nextInt();	//Anthony's age
		amarHeight = input.nextInt();	//Amar's height
		akbarHeight = input.nextInt();	//Akbar's height
		anthonyHeight = input.nextInt();	//Anthony's height
		
		if(amarAge < akbarAge && amarAge < anthonyAge)
			System.out.printf("Amar is the youngest friend of all");
		else if(akbarAge < amarAge && akbarAge < anthonyAge)
			System.out.printf("Akbar is the youngest friend of all");
		else
			System.out.printf("Anthony is the youngest friend of all");

		if(amarHeight < akbarHeight && amarHeight < anthonyHeight)
			System.out.printf("Amar is the tallest friend of all");
		else if(akbarHeight < amarHeight && akbarHeight < anthonyHeight)
			System.out.printf("Akbar is the tallest friend of all");
		else
			System.out.printf("Anthony is the tallest friend of all");

		input.close();
	}
} 