import java.util.*;

public class Lab503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int[7];
		
		Scanner sr = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			num[i] = sr.nextInt();
		}
		
		System.out.println();
		int count = 0;
		
		//StringBuilder oddNumbers = new StringBuilder(); // ใช้ StringBuilder เพื่อเก็บรายการเลขคี่
		
		String odd = "";  
		
		for (int num_ : num) {
			if (num_ % 2 != 0) {
				count++;
				odd += num_ + " ";
				
				//oddNumbers.append(num_).append(" "); // เพิ่มเลขคี่ลงใน StringBuilder
			}
		}
		
		System.out.println("There are " + count + " of odd number.");
		System.out.print("List of odd number : " + odd); 
		
		//System.out.print("List of odd number : " + oddNumbers.toString().trim()); 
		// ใช้ .toString() เพื่อแปลง StringBuilder เป็นสตริง และใช้ .trim() เพื่อลบช่องว่างส่วนเกินด้านท้าย

	}

}
