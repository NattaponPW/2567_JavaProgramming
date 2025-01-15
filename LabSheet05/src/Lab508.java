
import javax.swing.*;

public class Lab508 {
	
	public static boolean checkIndex(int[] nums, int index) {
		boolean valid = false;
		return valid = (index >= 0 && index < nums.length) ? true : false ;
	}
	
	public static int currentData(int[] nums ,int index) {
		return nums[index];
	}

	public static int prevData(int[] nums ,int index) {
		return nums[index - 1];
	}

	public static int nextData(int[] nums ,int index) {
		return nums[index + 1];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array : "));
		
		boolean valid = checkIndex(nums, index);
		
		// while (!checkIndex(nums, index))
		while(!valid) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again : "));
			valid = checkIndex(nums, index); // อัปเดตค่า valid หลังจากป้อนค่าใหม่
		}
	
		int current = currentData(nums, index);
		
		String massage = "Current data, number"+ "[" + index + "]" + " is " + current + "\n";
		
		// index ต้องมากกว่า 0 จะเท่ากับ 0 ไม่ได้
		if (index > 0) {
			int prev = prevData(nums, index);
			massage  += "Previous data, nums[" + (index - 1) + "] is " + prev + "\n";
		} else {
			massage += "No previous data" + "\n";
		}
		
		// index ต้องน้อยกว่า 6 จะเท่ากับ 6 ไม่ได้
		if (index < nums.length - 1) {
			int next = nextData(nums, index);
			massage  += "Next data, nums[" + (index + 1) + "] is " + next + "\n";
		} else {
			massage += "No next data";
		}
		
		JOptionPane.showMessageDialog(null, massage );
		


	}

}
