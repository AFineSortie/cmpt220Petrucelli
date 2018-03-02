import java.util.Scanner;
public class LinEqTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linEq = new LinearEquation(a, b, c, d, e, f);
		
		if (linEq.isSolvable()) {
			System.out.println("x is " + linEq.getX() + " and y is " + linEq.getY());
		} else {
			System.out.println("The equation has no solution");
		}
	}

}
