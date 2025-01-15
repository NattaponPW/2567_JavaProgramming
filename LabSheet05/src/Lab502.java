import java.util.*;

public class Lab502 {
	
	public static int sumOfPose(int[] nums) {
		int sum = 0;
		
		for (int num : nums) {
			if (num > 0) {
				sum += num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int[5];
		
		Scanner sr = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			num[i] = sr.nextInt();	
		}
		
		int sum = sumOfPose(num);
		
		System.out.println();
		
		System.out.print("Summation of positive number is " + sum );
		

	}

}
