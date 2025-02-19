
public class Drink {
	private int type;
	private char size;
	
	Drink() {
		this(0, ' ');
	}
	
	Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	public String getTypeName() {
		if(type == 1) {
			return "Hot";
		} else if (type == 2) {
			return "Cold";
		}
		return null;
		
	}
	
	public int getTypePeice() {
		if(type == 1) {
			return 10;
		} else if (type == 2) {
			return 20;
		}
		return 0;
	}
	
	public String getSizeName() {
		if(size == 'S' || size == 's') {
			return "Small";
		} else if (size == 'M' || size == 'm') {
			return "Medium";
		} else if (size == 'L' || size == 'l') {
			return "Large";
		}
		return null;
	}
	
	public int getSizePrice() {
		if(size == 'S' || size == 's') {
			return 15;
		} else if (size == 'M' || size == 'm') {
			return 20;
		} else if (size == 'L' || size == 'l') {
			return 25;
		}
		return 0;
	}
	
	public int getTotalPrice() {
		return 0;
	}
	
}
