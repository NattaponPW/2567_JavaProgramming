import java.util.*;

public class TestEmployeeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter detalis for Employee 1 : ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked1 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHourRate1 = scan.nextDouble();
		
		emp1.setEmployeeDeteils(empName1, empHourWorked1, empHourRate1);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		scan.nextLine();//เก็บค่า empHourRate1 ไว้ก่อน
		
		System.out.println("Enter detalis for Employee 2 : ");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked2 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHourRate2 = scan.nextDouble();
		
		emp2.setEmployeeDeteils(empName2, empHourWorked2, empHourRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		
		scan.close();
	}
	
	//Line method
	
	public static void Line(char symbol) {
		//System.out.println("------------------------------");
		for(int i = 1; i <= 50; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}

}
