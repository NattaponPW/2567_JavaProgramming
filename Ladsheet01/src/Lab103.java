import javax.swing.*;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
		int minute = Integer.parseInt(input);
		
		int hour = minute / 60;
		int hourCash = hour * 50;
		
		int minutesUsed = minute % 60;
        double costPerMinute = 0.25;
        
        double totalCost = (minutesUsed * costPerMinute) + hourCash;
        
        String message = "You parking " + hour + " Hour " + minutesUsed + " Minute.\n"
        		+ "Amount to be paid is " + totalCost + " bath.";
        JOptionPane.showMessageDialog(null, message);
	}

}
