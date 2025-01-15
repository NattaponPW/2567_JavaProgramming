import java.util.*;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product Pd= new Product();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter product Name: ");
		String ProductName = scan.nextLine();
		System.out.print("Enter product price: ");
		double BeforeVat = scan.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double AfterVat = scan.nextDouble();
		
		Pd.setProductDetails(ProductName, BeforeVat, AfterVat);
		
		System.out.println();
		System.out.println("Product Details : ");
		Pd.displayProductDetails();
		
		scan.close();
	}

}
