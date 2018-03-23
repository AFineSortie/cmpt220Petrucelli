
public class Circle2DTest {

	public static void main(String[] args) {
		Circle2D a = new Circle2D(2, 2, 5.5);
		
		System.out.println("The area of circle a is: " + a.getArea());
		System.out.println("The perimeter of circle a is: " + a.getPerimeter());
		
		System.out.println("\n" + a.contains(3, 3));
		System.out.println(a.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(a.overlaps(new Circle2D(3, 5, 2.3)));

	}

}
