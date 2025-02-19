
import javax.swing.JOptionPane;

public class Shop100Baht {
    public static void main(String[] args) {
        Product sold = new Product();

        //String input = JOptionPane.showInputDialog("Input the number of product: ");
        //int number = Integer.parseInt(input); // Convert String to int

        int response = JOptionPane.showConfirmDialog(null, "Is this program run on Pattanakarn Branch?", "Branch Selection", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            sold = new PattanakarnBranch(); // ใช้คลาส PattanakarnBranch ถ้ากด Yes
        } else {
            sold = new Product(); // ใช้คลาส Product ถ้ากด No
        }

        int number = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: "));
        sold.setUnit(number);

        //String massage = sold.toString();
        //JOptionPane.showMessageDialog(null, massage);
        JOptionPane.showMessageDialog(null, sold);

    }
}