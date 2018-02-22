import java.util.Scanner;
public class SmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) {
			double nextNum = input.nextDouble();
			array[i] = nextNum;
		}
		System.out.println("The minimum is " + min(array));
	}
	
	public static double min(double[] array) {
		double currentMin = array[0];
		for (int i = 0; i < array.length; i++) {
			if (currentMin > array[i]) {
				currentMin = array[i];
			}
		}
		return currentMin;
	}
	

}
