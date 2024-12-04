import javax.swing.*;
import java.util.*;

public class Withdrawal {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		//System.out.print(balance);
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance: " + balance + "\n" +
		"Input money to withdraw:")); 
		
		if (moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than ballance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw > 50000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw " + (moneyWithdraw % 100) + " bath.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Yor withdraw " + moneyWithdraw + " bath." + "\n1,000 = " +((moneyWithdraw % 1000)/500) + 
					"\n500 = " + ((moneyWithdraw % 1000)/500) +
					"\n100 = " + ((moneyWithdraw % 500)/100));
		}
	}

}
