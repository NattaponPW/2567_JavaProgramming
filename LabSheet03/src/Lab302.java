import javax.swing.JOptionPane;

public class Lab302 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog(null, "Input your e-mail : ").toLowerCase();
		
		//boolean validateEmail = false;
		
		//validateEmail = inputEmail.startsWith("@") || inputEmail.contains(" ");
		
		
		while (inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog(null, "Input your e-mail again? : ");
		}
		
		if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
		} 
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com " + inputEmail);
		}
		
		
	}

}