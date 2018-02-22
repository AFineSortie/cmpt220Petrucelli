import java.util.Scanner;
public class ComputeDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] x = new double[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < x.length; i++) {
			double nextNum = input.nextDouble();
			x[i] = nextNum;
		}
		System.out.println("The mean is " + mean(x));
		System.out.println("The standard deviation is " + deviation(x));
		
		
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		double mean = sum / 10;
		return mean;
	}
	
	public static double deviation(double[] x) {
		double summation = 0;
		for (int i = 0; i < x.length; i++) {
			summation += ((x[i] - mean(x)) * (x[i] - mean(x))) / 9;
		}
		double deviation = Math.sqrt(summation);
		return deviation;
	}

}
