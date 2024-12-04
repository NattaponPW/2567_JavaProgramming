import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Declare constants
		final double BASE_SALAARY = 1000.0;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		 
		// Declare variables
		int sales; // Input gross sales
		double salary; // Salary to be computed
		
		while(true) {
			System.out.print("Enter gross sales for the salesperson(of -1 to end): ");
			sales = input.nextInt();
			
			if (sales == SENTINEL) {
				break;
			}
			
			salary = BASE_SALAARY + (sales * COMMISSION_RATE);
			
			System.out.printf("The saleperson's is : $%,.2f %n%n", salary);
		}
		
		System.out.println("bye");
		
		input.close();
	}

}
