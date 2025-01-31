import java.util.*;

public class BookDetails {
    public static void main(String[] args) {
        String title, author, operation;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Title of Book: ");
        title = input.nextLine();
        System.out.print("Enter Author of Book: ");
        author = input.nextLine();
        System.out.print("Enter Price of Book: ");
        price = input.nextDouble();
        
        Book book = new Book(title, author, price);
		System.out.println("Which Field you want to modify (Title, Author, Price) ?");
		operation = input.next().toLowerCase();
		if(operation.equals("title")) {
			System.out.print("Enter Modified Title of Book: ");
			input.nextLine();
			book.setTitle(input.nextLine());
		}
		else if(operation.equals("author")) {
			System.out.print("Enter Modified Author of Book: ");
			input.nextLine();
			book.setAuthor(input.nextLine());
		} 
		else if(operation.equals("price")) {
			System.out.print("Enter Modified Price of Book: ");
			book.setPrice(input.nextDouble());
		} 
		else
			System.out.println("No Such Field Exists!");
		
        System.out.println("=== Book Details ===");
        book.display();
        input.close();
    }
}