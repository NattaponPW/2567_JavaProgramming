import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.nextLine());
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			scan.nextLine();
			
			System.out.println();
			Line();
			
			double totalPrice = 0;
			
	        for (Product product : productList) {
	            System.out.println("Product ID : " + product.getId() + ", Total price = " + 
	            String.format("%,.2f", product.calculate()) + " baht.");
	            totalPrice += product.calculate();
	        }
	        Line();
	        System.out.println("Total price of all products = " + String.format("%,.2f", totalPrice));
		}
	}
	
	public static void Line() {
		for(int i = 1; i <= 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
