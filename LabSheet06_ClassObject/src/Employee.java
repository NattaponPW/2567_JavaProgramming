
public class Employee {
	
	private String name;
	private int hourworked;
	private double hourlyRate;
	
	public void setEmployeeDeteils(String empName, int hours, double rate) {
		name = empName;
		hourworked = hours;
		hourlyRate = rate;
		
	}
	
	public double calculateSalary() {
		double salary = hourworked * hourlyRate;
		if(hourworked < 40) {
			double bonus = salary * 0.10;
			salary  += bonus;
		}
		return salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Hours Worked: " + hourworked);
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Total Salary: " + calculateSalary());
		
	}
}
