import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Full Name: ");
		String fullName = input.nextLine();

		if (!fullName.contains(" ")) {
			System.out.println("Incorrect Name");
		}

		else {
			int spaceIndex = fullName.indexOf(" ");

			String firstName = fullName.substring(0, spaceIndex);
			String lastName = fullName.substring(spaceIndex + 1);

			firstName = firstName.toUpperCase();
			lastName = lastName.toLowerCase();

			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);

			input.close();
		}
	}

}
