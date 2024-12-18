import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String input = scan.nextLine();

		String lowerCaseInput = input.toLowerCase();

		if (lowerCaseInput.contains("nichi")) {
			System.out.println("Nichi is a sentence");
		} else {
			System.out.println(input);
		}

		scan.close();
	}

}
