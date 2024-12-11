import java.util.*;

public class SecurePasswordChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit) : ");
			String password = scan.nextLine();
			
			if ( password.equalsIgnoreCase("exit") ) { //password.equalsIgnoreCase("exit")
				System.out.print("Program terminted.");
				break;
			}
			
			String errors = "";
			
			if (password.length() < 8) {
				errors += "- Password much be at least 8 characters long.\n";
			} 
			
			boolean hasUpperCase = false;
			boolean hasLowerCare = false;
			boolean hasDigit = false;
			
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				
				if (ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				} else if (ch >= 'a' && ch <= 'z') {
					hasLowerCare = true;
				} else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}
			
			if (!hasUpperCase) {
				errors += "- Password must contain at lease one uppercase letter(A-Z).\n";
			} else if (!hasLowerCare) {
				errors += "- Password must contain at lease one lowercase letter(a-z).\n";
			} else if (!hasDigit) {
				errors += "- Password must contain at lease one digit letter(0-9).\n";
			}
			
			if (errors.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			} else {
				System.out.println("Password validation errors.");
				System.out.println(errors);
			}
		}
		
		scan.close();
	}

}
