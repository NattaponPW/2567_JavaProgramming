import javax.swing.*;

public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputEmail();
		
		
	}

	public static void inputEmail() {
		String ans;
		String varEmail;
		
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			
			if (varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
				
			} else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			
			ans = JOptionPane.showInputDialog("Do you wnt to input email ddress[Y/y]");
			
		}while (ans != null && ans.equalsIgnoreCase("y"));
		
	}
	
	// checkEmailError() Method
	
	public static void checkEmailError(String email) {
		
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invail e-mail. Input your e-mail again:");
		}
		
		email = email.toLowerCase();
		
		JOptionPane.showMessageDialog(null, checkEmail(email)
				?"Your e-mail is " + email // return true
				:"Your e-mail is not a hotmail or gnail address." // return false
				);
	}
	
	public static boolean checkEmail(String email) {
		//1
		
		/*if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		} else {
			return false;
		}*/ 
		
		//2
		
		/*
		if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}
		return false;
		*/
		
		return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
	}
}
