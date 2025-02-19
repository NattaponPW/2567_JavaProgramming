
public class TextCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(5.0);
		System.out.println(c1);
		String frmResult = String.format("%.2f", c1.getPerimeter());
		System.out.printf("Perimter: 2%,f2" + frmResult);
		System.out.println("Area: " + c1.getArea());
		
	}

}
