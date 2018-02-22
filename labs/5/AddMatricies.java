import java.util.Scanner;
public class AddMatricies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix 1: ");
		double[][] matrix1 = new double[3][3]; 
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix 2: ");
		double[][] matrix2 = new double[3][3];
		for (int k = 0; k <= 2; k++) {
			for (int l = 0; l <= 2; l++) {
				matrix2[k][l] = input.nextDouble();
			}
		}
		double [][] matrix3 = addMatrix(matrix1, matrix2);
		
		System.out.printf("%5.1f %5.1f %5.1f     ", matrix1[0][0], matrix1[0][1], matrix1[0][2]);
		System.out.printf("%5.1f %5.1f %5.1f     ", matrix2[0][0], matrix2[0][1], matrix2[0][2]);
		System.out.printf("%5.1f %5.1f %5.1f     ", matrix3[0][0], matrix3[0][1], matrix3[0][2]);
		System.out.printf("\n%5.1f %5.1f %5.1f   ", matrix1[1][0], matrix1[1][1], matrix1[1][2]);
		System.out.print("+ ");
		System.out.printf("%5.1f %5.1f %5.1f   ", matrix2[1][0], matrix2[1][1], matrix2[1][2]);
		System.out.print("= ");
		System.out.printf("%5.1f %5.1f %5.1f   ", matrix3[1][0], matrix3[1][1], matrix3[1][2]);
		System.out.printf("\n%5.1f %5.1f %5.1f     ", matrix1[2][0], matrix1[2][1], matrix1[2][2]);
		System.out.printf("%5.1f %5.1f %5.1f     ", matrix2[2][0], matrix2[2][1], matrix2[2][2]);
		System.out.printf("%5.1f %5.1f %5.1f     ", matrix3[2][0], matrix3[2][1], matrix3[2][2]);
	}
	public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
		double[][] matrix3 = new double[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrix3;
	}

}
