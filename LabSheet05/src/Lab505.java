import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr = new Scanner(System.in);
		
		int [] nums = {78, 36, 58, 41, 25, 92, 75};
		
		boolean valid = false; // ตัวแปรสำหรับตรวจสอบความถูกต้องของอินเด็กซ์
		
		System.out.print("Input index of array : ");
		int index = sr.nextInt();
		
		while (!valid) {
			System.out.print("Input index of array, again : ");
			index = sr.nextInt();
			
			if (index >= 0 && index < nums.length) {
				valid = true; // ถ้าอินเด็กซ์ถูกต้อง ออกจากลูป
			} 

		}
		
		System.out.println();
		
		System.out.println("Value in current index is " + nums[index]);
		
		if (index == nums.length - 1) {
			System.out.println("Sorry, " + index + " is the last index in array.");
		} else {
			System.out.println("Value in next    index is " + nums[index + 1]);
		}
		
		
		
	}

}
