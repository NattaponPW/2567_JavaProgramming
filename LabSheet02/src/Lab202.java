import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int previousNumber = Integer.MIN_VALUE;
		int currentNumber;

		while (true) {
			System.out.print("Input number : ");
			currentNumber = input.nextInt();

			if (currentNumber < previousNumber) {
				break;
			}

			previousNumber = currentNumber;

		}
		System.out.println();
		System.out.print("BYE BYE");
		input.close();
	}

}
