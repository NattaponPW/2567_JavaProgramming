import javax.swing.*;
import java.text.*;

public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("Input many customer per bill"));
		
		double totalPrice = BUFFET * numberOfCustomer;
		
		//System.out.printf("Total price is %,.2f bath.", totalPrice );
		
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " bath." + 
					"\n" + "Dp you have a member card?");
		}while(isMember == JOptionPane.CANCEL_OPTION); // (isMember == 2)
		
		
		if (isMember == JOptionPane.YES_OPTION) { // if (isMember == 0)
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be aid is " + frm.format(priceAfterDiscount) + 
					" bath.");
		} 
		
		else if (isMember == JOptionPane.NO_OPTION) { // if (isMember == 1)
			JOptionPane.showMessageDialog(null, "Amount to be aid is " + frm.format(totalPrice) + 
					" bath.");
		}		
	}
}
