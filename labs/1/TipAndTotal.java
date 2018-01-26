import java.util.Scanner;
public class TipAndTotal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total of the bill: ");
		double subtotal = input.nextDouble();
		
		System.out.print("Enter the gratuity rate (as a decimal): ");
		double rate = input.nextDouble();
		
		double tip = subtotal * rate;
		System.out.println("The tip is " + tip + " dollars");
		
		double total = subtotal + tip;
		System.out.println("The total is " + total + " dollars");
	}

}
