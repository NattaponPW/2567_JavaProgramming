import javax.swing.*;
import java.util.*;

public class Lab507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] number = new int[5];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) + " :"));
		}

		showEven(number);
		showOdd(number);
	}
	
	public static void showEven(int[] nums) {
		String even = "List of even number : \n ";  
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, even );
	}
	
	public static void showOdd(int[] nums) {
		String even = "List of Odd number : \n "; 
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				even += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, even);
	}

}
