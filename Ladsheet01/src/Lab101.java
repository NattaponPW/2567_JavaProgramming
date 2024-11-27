import java.util.*;
import java.text.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit: ");
		int product = input.nextInt();
		System.out.print("Input Price per unit: ");
		float price = input.nextFloat();
		System.out.println("------------------------------------------------");
		float totalPrice = product * price;
		
		System.out.println("Total Price is " + frm.format(totalPrice) + " bath.");
		
		System.out.println("------------------------------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		System.out.println("------------------------------------------------");
		float totalDiscount = totalPrice *  discount /100;
		System.out.println("Discount from " + discount +"%       "   + frm.format(totalDiscount) +" bath.");
		float totalAmount = totalPrice - totalDiscount;
		System.out.print("Amount to be paid       " + frm.format(totalAmount) + " bath.");
	}

}
