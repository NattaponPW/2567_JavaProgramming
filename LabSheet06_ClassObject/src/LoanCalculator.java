
class LoanCalculator {

	private String productName;
	private double price;
	private double interestRate;
	private int years;

	public void setLoanDetails(String productName, double price, double interestRate, int years) {
		this.productName = productName;
		this.price = price;
		this.interestRate = interestRate; 
		this.years = years;

	}

	public double calculateMonthlyPayment() {
		double Rate = interestRate / 100;  
		double monthlyRate = Rate / 12; 
	    int totalMonths = years * 12; 
	    return (price * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
	    		 (Math.pow(1 + monthlyRate, totalMonths) - 1);
	}

	public void displayLoanDetails() {
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Interest: " + interestRate + "%");
		System.out.println("Loan Period: " + years + " years");
		System.out.printf("Monthly Payment: %.2f\n", calculateMonthlyPayment());
	}

}
