import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a sentence : ");
		String massage = input.nextLine();
		
		
		while (!massage.endsWith(".")) {
			System.out.print("Input a setence, again : ");
			massage = input.nextLine();
		}
		
		int spaceCount = 0;
		
		for (int c = 0; c < massage.length(); c++ ) {
			if (massage.charAt(c) == ' ') {
				spaceCount++;
			}
			 //System.out.println(massage.charAt(c)); // Test Code
		}
		
		int word = spaceCount + 1;
        
        System.out.println("This sentence has " + spaceCount + " spacebar.");
        System.out.println("This sentence has " + word + " word.");
     
        input.close();
		
	}

}
