import javax.swing.*;
import java.text.*;

public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight :"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height :"));
		double Meterheight = (height / 100);
		double BMI = weight / (Meterheight * Meterheight);

		if (BMI < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI =" + frm.format(BMI) + "\nYou're Underweight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (BMI > 18.5 && BMI < 24.9) {
			JOptionPane.showMessageDialog(null, "BMI =" + frm.format(BMI) + "\nYou're Normal-weight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (BMI > 25.0 && BMI < 29.9) {
			JOptionPane.showMessageDialog(null, "BMI =" + frm.format(BMI) + "\nYou're Overweight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (BMI > 30.0) {
			JOptionPane.showMessageDialog(null, "BMI =" + frm.format(BMI) + "\nYou're Obesity", "BMI",
					JOptionPane.WARNING_MESSAGE);

		}
	}
}
