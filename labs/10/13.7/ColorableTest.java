
public class ColorableTest {

	public static void main(String[] args) {
		GeometricObject[] list = {new Square(3), new Square(4), new Square(7), 
				new Square(10), new Square(22)};
		for (int i = 0; i < list.length; i++) {
			System.out.println("\n\nArea of Square " + i + ": " + list[i].getArea());
			if (list[i] instanceof Colorable) {
				((Square) list[i]).howToColor();
			}
		}
	}

}
