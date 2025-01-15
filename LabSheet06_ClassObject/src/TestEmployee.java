
public class TestEmployee {

	public static void main(String[] args) {
		// create 2 Employee object

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		// set employee details
		emp1.setEmployeeDeteils("Eugeo", 40, 20.0);
		emp2.setEmployeeDeteils("Kirito", 38, 25.0);
	
		
		//Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println();
		
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
	}

}
