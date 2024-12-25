import javax.swing.*;

public class ShoppingCart {

	public static void main(String[] args) {
	
		displayCardAndTotal("Apple", 10.5, "Banana" , 5.75, "Orange", 7.3);
		displayCardAndTotal("Milk", 20.0, "Bread" , 15.0);
		displayCardAndTotal();
	}
	public static void displayCardAndTotal(Object... items ) {
		if (items.length == 0) {
			System.out.println("No item in the cart.");
			return;
		}
		System.out.println("Items in the cart.");
		
		for(int i = 0; i < items.length; i+=2) {
			
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			/*
			JOptionPane.showMessageDialog(null, 
					"- " + itemName + 
					":  $" + itemPrice);
					*/
			
			System.out.printf("- %s:  $%.2f%n",itemName, itemPrice);
		}
		System.out.println();
	}

}
