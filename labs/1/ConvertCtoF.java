import java.util.Scanner;
public class ConvertCtoF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		double farenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " Celsius is " + farenheit + " Farenheit");

	}

}
