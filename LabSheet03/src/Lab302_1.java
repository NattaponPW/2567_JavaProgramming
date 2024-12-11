import javax.swing.*;

public class Lab302_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog(null, "Input your e-mail : ").toLowerCase();

		boolean chkEmail = false;

		while(true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail : ".toLowerCase());
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog(null, "Input your e-mail again? : ");
			}
			
			chkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com");
			if(chkEmail) {
				JOptionPane.showMessageDialog(null, "Input your e-mail is " + inputEmail);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com " + inputEmail);
				continue;
			}
		}

	}

}
