import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input some sentence : ");
		String inputMassgae = input.nextLine();

		while (!inputMassgae.endsWith(".")) {
			System.out.print("The sentence mush end with full stop point : ");
			inputMassgae = input.nextLine();
		}

		System.out.println();

		String word = "";
		for (int i = 0; i < inputMassgae.length(); i++) {
			char currentChar = inputMassgae.charAt(i);

			if (currentChar == ' ') {
				if (!word.isEmpty()) {
					System.out.println(word);
					word = "";
				}
			} else {
				word += currentChar;
			}

		}

		if (!word.isEmpty()) {
			System.out.println(word);
		}

		input.close();

	}

}
