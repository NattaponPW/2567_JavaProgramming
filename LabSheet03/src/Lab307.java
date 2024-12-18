import java.util.*;

public class Lab307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String input = scanner.nextLine();
		String processedText = input.replaceAll("\\s+", "").toLowerCase();

		String reversedText = new StringBuilder(processedText).reverse().toString();

		if (processedText.equals(reversedText)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

		scanner.close();
	}

}
