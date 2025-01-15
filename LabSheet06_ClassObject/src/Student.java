
public class Student {

	private String name;
	private double[] scores;
	
	
	public void setStudentDatails(String stdName, double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	public double calculateAverageScore() {
		double total = 0;
		for(double score_ : scores) {
			total += score_;
		}
		/*for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}*/
		return total/scores.length; // return average of score
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		}
		else if (average >= 70) {
			return "C";
		}
		else if (average >= 60) {
			return "D";
		}
		else if (average >= 50) {
			return "D";
		}
		else  {
			return "F";
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name: " + name);
		System.out.print("Scores: ");
		for(double score_ : scores) {
			System.out.print(score_ + " ");
		}
		
		/*for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}*/
		System.out.println("\nAverage Score: " + calculateAverageScore());
		System.out.println("Grade: " + getGrade());
	}
	
}
