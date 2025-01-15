import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr = new Scanner(System.in);
		
		
		double [] student = new double [5];
		
		double score = 0.0;
		double averahe = 0.0;
		for (int i = 0; i < student.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			student[i] = sr.nextDouble();
			
			score += student[i];
			
			averahe = score / student.length;
			
		}

		System.out.println();
		System.out.printf("Average of " + student.length + " is %,.2f%n" , averahe );
		
		for (int l = 0; l < student.length; l++) {
			if (student[l] > averahe) {
				
				//System.out.printf("> Student %d (%.2f)%n", (l + 1), student[l]);
				System.out.printf("> Student " + (l + 1) + " (%.2f)%n" , student[l]);
			}
		}

	}

}
