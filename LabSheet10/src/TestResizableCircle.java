
public class TestResizableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResizableCircle rc = new ResizableCircle(10.0);
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println(rc);
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("Area: %.2f%n" , rc.getArea());
		Line("*");
		rc.resize(50);
		System.out.println("After resize(50%): " + rc);
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("After %.2f%n: " , rc.getArea());
		
		
	}
	public static void Line(String l) {
		for(int i = 0; i <= 50; i++ ) {
			System.out.print(l);
		}
		System.out.println();
	}

}
