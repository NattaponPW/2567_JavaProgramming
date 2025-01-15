import javax.swing.*;

public class Lab506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] massage = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		String mass = "";
		
		for (String massage_ : massage) {
			mass += "- " + massage_ + "\n";
		}

		JOptionPane.showMessageDialog(null, "The greeting words in Englinsh : \n"
				+ mass + "\n");
	}

}
