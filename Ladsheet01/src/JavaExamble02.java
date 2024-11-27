import javax.swing.*;

public class JavaExamble02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productName = JOptionPane.showInputDialog("Input Product Name");
		String strproductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(strproductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("" + "Input Price per Unit: "));
		
		double totalPriceOfProduct = productUnit * productPrice;
		double totaleithVar = totalPriceOfProduct * 1.07;
		
		String frmtotalPriceOfProduct = String.format("%,.2f",totalPriceOfProduct);
		String frmtotalwihtVat = String.format("%,.2f",totaleithVar);

		JOptionPane.showMessageDialog(null , "Total Price is " + frmtotalPriceOfProduct + " bath."+"\nAdd VAT7% is " 
		+ frmtotalwihtVat + " bath.");
	} 

}
