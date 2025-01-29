
public class Student {

	//private two attribute
	private String studentName;
	private int studentScore;
	
	// set and getter method
	public void setName(String stdName) {
		studentName = stdName;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	//check if the score is within the valid range (0-100)
	
	public boolean checkScore() {
		/*// 01
		if(getScore() >= 0 && getScore() <= 100) {
			return true;
		} else {
			return false;
		}
		*/
		/*// 02
		if(getScore() >= 0 && getScore() <= 100)
			return true;
		return false;
		*/
		return getScore() >= 0 && getScore() <=100;
	}
	
	public boolean isPass() {
		/*
		if(getScore() > 50)
			return true;
		return false;
		*/
		return getScore() >= 50;
	}
	
	
}
