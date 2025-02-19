import java.util.*;
public class FictionDemol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Book Title: ");
		String bookTitle = scan.nextLine();
		System.out.print("Book public year: ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		System.out.print("Author name: ");
		String authorName = scan.nextLine();
		System.out.print("Author email: ");
		String authorEmail = scan.nextLine();
		
		FictioBook book1 = new FictioBook(bookTitle, publicYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		
		while(!book1.checkEmail() ) {
			System.out.print("Author email, again: ");
			authorEmail = scan.nextLine();
			book1.setEmail(authorEmail);
		}
		
		Line("=");
		System.out.print(book1);
	}
	
	public static void Line(String l) {
		for(int i = 0; i <= 50; i++ ) {
			System.out.print(l);
		}
		System.out.println();
	}

}
