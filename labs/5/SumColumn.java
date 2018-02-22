import java.util.Scanner;
public class SumColumn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3x4 matrix, row by row:");
		double[][] m = new double[3][4];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println("The sum of the elements at column 0 is " + sumColumn(m, 0));
		System.out.println("The sum of the elements at column 1 is " + sumColumn(m, 1));
		System.out.println("The sum of the elements at column 2 is " + sumColumn(m, 2));
		System.out.println("The sum of the elements at column 3 is " + sumColumn(m, 3));
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i <= 2; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

}
