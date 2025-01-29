import java.util.*;

public class TextStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// Input the number of student
		System.out.print("Hoe many students in classroom: ");
		int numberofStudent = scan.nextInt();

		// Consume newline character
		scan.nextLine();

		// 1.Create an array of Student objects
		Student[] students = new Student[numberofStudent];

		// Input information for each student
		for (int i = 0; i < numberofStudent; i++) {
			// 2.Create a new Student object
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i + 1));
			Line();
			// Input student's name
			System.out.print("Input student name: ");
			// String stdName = scan.nextLine();
			// students[i].setName(stdName);
			students[i].setName(scan.nextLine());
			// Input student's score and validate
			System.out.print("Input student score : ");
			int score = scan.nextInt();
			scan.nextLine();
			students[i].setScore(score);
			while (!students[i].checkScore()) {
				System.out.print("Input score, again : ");
				students[i].setScore(scan.nextInt());
			}
		} // end of for

		// Display the list of student who passed
		System.out.println("\nINPUT OF PASS STUDENT (>=50): ");
		Line();
		for (Student student : students) {
			if (student != null && student.isPass()) {
				System.out.println(">> " + student.getName() + " (" + student.getScore() + ")" + " get grade "
						+ findGrade(student.getScore()));
			} // end if
		} // end of for

		scan.close();
	}

	public static void Line() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static String findGrade(int score) {
		/*
		 * String gade = ""; if (score >= 100 && score <= 80) { gade = "A"; } else if
		 * (score <= 79 && score >= 75) { gade = "B+"; } else if (score <= 74 && score
		 * >= 70) { gade = "B"; } else if (score <= 69 && score >= 65) { gade = "C+"; }
		 * else if (score <= 64 && score >= 60) { gade = "C"; } else if (score <= 59 &&
		 * score >= 55) { gade = "D+"; } else if (score <= 54 && score >= 50) { gade =
		 * "D"; } else { gade = "F"; } return gade;
		 */

		if (score >= 80)
			return "A";
		else if (score >= 76)
			return "B+";
		else if (score >= 70)
			return "B";
		else if (score >= 66)
			return "C+";
		else if (score >= 60)
			return "C";
		else if (score >= 56)
			return "D+";
		else if (score >= 50)
			return "D";
		else
			return "F";
	}

}
