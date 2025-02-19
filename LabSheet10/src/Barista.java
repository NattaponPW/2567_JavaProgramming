
public class Barista {
	private String name;
	private char gender;
	
	Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	Barista() {
		this(null, ' ');
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenderName() {
		if(Character.toUpperCase(gender) == 'M') return "Male";
		if(Character.toUpperCase(gender) == 'F') return "Female";
				return "spacebar";
			
	}
}
