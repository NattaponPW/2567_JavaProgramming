
import javax.swing.JOptionPane;

public class CoffeeShopDemo {
    public static void main(String[] args) {

        Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        Barista number = null;

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog(null, "Drink type: "));
        int coffeeType = Integer.parseInt(JOptionPane.showInputDialog(null, "Coffee type: "));
        Character coffeeSize = JOptionPane.showInputDialog(null, "Coffee size: ").toUpperCase().charAt(0);
        int baristaNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Barista number: "));

        if (baristaNumber == 1) {
            number = staff1;
        } else {
            number = staff2;
        }

        Coffee order = new Coffee(drinkType, coffeeSize, coffeeType, number);

        JOptionPane.showMessageDialog(null, order +"\n" + number);

    }
}
