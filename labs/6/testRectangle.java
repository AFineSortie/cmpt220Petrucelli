
public class testRectangle {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		System.out.println("The width of rectangle 1 is: " + rec1.width);
		System.out.println("The height of rectangle 1 is: " + rec1.height);
		System.out.println("The area of rectangle 1 is: " + rec1.getArea());
		System.out.println("The perimeter of rectangle 1 is: " + rec1.getPerimeter());
		
		System.out.println("\nThe width of rectangle 2 is: " + rec2.width);
		System.out.println("The height of rectangle 2 is: " + rec2.height);
		System.out.println("The area of rectangle 2 is: " + rec2.getArea());
		System.out.println("The perimeter of rectangle 2 is: " + rec2.getPerimeter());

	}

}
