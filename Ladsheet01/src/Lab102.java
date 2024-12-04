import java.util.Scanner;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of minutes :");
		int number = sc.nextInt();
		int year = (number / 525960);
		int days = (number % 525960) / 1440;
		System.out.print(number + " minutes is approximately " + year + " year and " + days +  " days");
	        
	    sc.close();
	}

}
