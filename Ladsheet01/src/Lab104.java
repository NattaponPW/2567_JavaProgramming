import javax.swing.*;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Welcome to the payroll appilication");
		
		String name = JOptionPane.showInputDialog(null , "Enter employee name");
		int hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total hour for this employee."));
		
		double gross = hour * 7.5;
		double tax = gross * 0.15;
		double total = gross - tax;
		
		String massage = "Employee name: " + name +
				"\nHours Worked: " + hour +
				"\nHourly wage: $7.5 " + 
				"\nGross Earnings: $" + gross + 
				"\nTax rate: 0.15" +
				"\nTax: $ " + tax +
				"\nNet earnings: $ " + total;
		JOptionPane.showMessageDialog(null, massage);
	}

}
