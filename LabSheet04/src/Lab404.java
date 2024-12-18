import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeVaild;

		while (true) {
			// Input student ID
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();

			System.out.print("Enter student code (7 digits): ");
			subjectCode = scanner.nextLine();

			isStudentIDValid = isLength(studentID, 10);
			isSubjectCodeVaild = isLength(subjectCode, 7);

			if (isStudentIDValid && isSubjectCodeVaild) {

				boolean isITStudent = isITStudent(studentID);
				boolean isITSuject = isITSuject(subjectCode);

				displayData(isITStudent, isITSuject);
			}
		}
	}

	public static boolean isLength(String input, int leg) {

		return input.length() == leg;
	}

	public static boolean isITStudent(String ID) {
		
		if (ID.length() == 10 ) {
			return true;
		} 
		
		else {
			return false;
		}
	}

	public static boolean isITSuject(String Code) {
		return false;
	}
	
	public static void displayData() {
		
	}
}
