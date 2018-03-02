import java.util.Scanner;
public class LocationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] arr = new double[rows][columns];
		System.out.println("Enter the array: ");

		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		
		Location largestLoc = locateLargest(arr);
		System.out.println("The location of the largest element is " + largestLoc.getMaxValue() + " at (" + largestLoc.getRow() + ", " + largestLoc.getColumn() + ")");
		
	}
	
	public static Location locateLargest(double[][] arr) {
		double maxValue = arr[0][0];
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		Location largestLoc = new Location(row, column, maxValue);
		return largestLoc;
	}

}
