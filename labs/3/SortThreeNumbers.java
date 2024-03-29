import java.util.Scanner;
public class SortThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);

	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double max = Math.max(num1, Math.max(num2, num3));
		double min = Math.min(num1, Math.min(num2, num3));
		double mid;
		if (num1 != max && num1 != min) {
			mid = num1;
		} else if (num2 != max && num2 != min) {
			mid = num2;
		} else {
			mid = num3;
		}
		System.out.println(min + ", " + mid + ", " + max);
	}

}
