
import javax.swing.*;

public class Lab303_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String massage = JOptionPane.showInputDialog("Input a sentence : ");

		while (!massage.endsWith(".")) {
			massage = JOptionPane.showInputDialog("Input a sentence, again : ");
		}

		int space = 0;

		for (int c = 0; c < massage.length(); c++) {
			if (massage.charAt(c) == ' ') {
				space++;
			}
		}
		
		int word = space + 1;

		String massgae = "This sentence has " + space + " spaceber." + "\n" + "This sentence has " + word + " word.";

		JOptionPane.showMessageDialog(null, massgae);

	}

}

