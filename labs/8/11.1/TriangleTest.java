import java.util.Scanner;
public class TriangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("\nEnter the color of the triangle: ");
		String color = input.next();
		
		System.out.print("\nIs the triangle filled?: ");
		boolean filled = input.nextBoolean();
		
		Triangle tri1 = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println("Area: " + tri1.getArea());
		System.out.println("Perimeter: " + tri1.getPerimeter());
		System.out.println("Color: " + tri1.getColor());
		System.out.println("Filled: " + tri1.isFilled());
	}

}
