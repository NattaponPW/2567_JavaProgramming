import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String fullName;
		String firstName;
		
		System.out.println("Plase enter your name, sparated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); // หาช่องว่าง
		firstName = fullName.substring(0 , space);
		
		//System.out.println(firstName);
		
		//to get the middle name
		
		System.out.println(abbreviatName(fullName) + firstName);
		
		
		input.close();

	}
	
	public static String abbreviatName(String fName) {
		String initailLetter = "";
		
		for (int i = 0; i < fName.length(); i++) {
			
			if (fName.charAt(i) == ' ') {
				initailLetter = (initailLetter + fName.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter + ".";
			}
		}
		
		return initailLetter;
	}

}
