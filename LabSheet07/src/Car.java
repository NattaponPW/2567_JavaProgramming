
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	
	//Default Constructor
	Car() {
		companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;
		
		//this("Unknown","Unknown",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName, String modelName, int year, double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		
		//Default ปีที่ผลิต 2000 หากค่าที่ใส่ไม่ถูกต้อง
		this.year = year >= 1886? year : 2000;
		this.mileage = mileage;
	}
	
	//getters and setters method
	public void setCompanyName(String companyName) {
		if(companyName != null & !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invaild company name");
		}
	}
	
	public void setModelName(String modelName) {
		if(modelName != null & !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	 }
	
	public void  setYear(int year) {
		if(year >= 1886) {
			this.year = year;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public int getYear() {
		return this.year;
	}
	
	
	public String toString() {
		return "Company Name: " + this.companyName
				+ "\nModel Name: " + this.modelName
				+ "\nYear: " + this.year
				+ "\nMileage: " + this.mileage;
	}
 	
}
