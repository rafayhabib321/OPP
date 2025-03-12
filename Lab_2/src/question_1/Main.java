package question_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Books b1 = new Books ();
//		b1.issuebook(book, name)
		
		String book;
		String name;
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter The Book title");
			book=input.nextLine();
			System.out.println("Enter TRhe Book Author");
			name=input.nextLine();
	b1.issuebook(book, name);
}
}