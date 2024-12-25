import javax.swing.*;

public class Lab402 {

	public static boolean isLeapYear(int year) {

		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}

	public static boolean checkYear(int year) {

		return year >= 1000 && year <= 3000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));

		while (!checkYear(year)) {
			year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year, again:"));
		}
		

		if (isLeapYear(year)) {
			JOptionPane.showMessageDialog(null, year + " is Leap year.");

		} else {
			JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");

		}

	}

}