
public class FictioBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	FictioBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0 , space);
		lname = author_name.substring(space+1);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getLastName() {
		return this.fname.toUpperCase();
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String getFirstName()  {
		return this.lname.toUpperCase();
	}
	
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com"))
			return true;
		return false;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	public String toString() {
		return  getTitle() +
				" write by " + getLastName().substring(0,1)+
				"." + getFirstName() +
				"(" + getEmail() + ")" + 
				"\nPublished for " + totalPublicYear() + " year(s).";		
	}
 	
}
