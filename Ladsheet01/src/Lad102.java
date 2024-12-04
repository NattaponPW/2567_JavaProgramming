import java.util.*;

public class Lad102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minutes = input.nextInt();
		int year = minutes / 60 / 24 / 30 / 12;
		double day = minutes ;
		System.out.print(minutes + " minutes is approximation " + year +
				" years and " + day );
	}

}
