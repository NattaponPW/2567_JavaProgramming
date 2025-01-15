
public class Product {
	
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String name, double price, double vatRate) {
		this.name = name;
		this.price = price;
		this.vatRate = vatRate;
	}
	
	public double calculateTotalPrice() {
		double Vat = 0;
		Vat = (this.price * this.vatRate) / 100;
		return Vat += this.price;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name: " + this.name);
		System.out.println("Product (Before VAT): " + this.price);
		System.out.println("Product (After VAT): " + calculateTotalPrice());
	}

}
