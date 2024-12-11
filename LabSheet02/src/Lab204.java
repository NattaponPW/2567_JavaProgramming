import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = input.nextInt();
		
		System.out.print("Input value of Y : ");
		int y = input.nextInt();
		
		while ( y < x ) {
			System.out.print("Input value of Y, again : ");
			y = input.nextInt();
		}
		
		System.out.println();
		  
		int current = x + 1;
		int sum = x;
	       
		for (int i = 11; i <= y; i++) {
			sum += current;
			System.out.println((sum - current ) + " + " + i + " = " + sum);
			current++;
		}
		
		input.close();
	}

}
