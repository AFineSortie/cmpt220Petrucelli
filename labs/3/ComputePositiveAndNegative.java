import java.util.Scanner;
public class ComputePositiveAndNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");

		int data = 1;
		int sum = 0;
		int countNeg = 0;
		int countPos = 0;
		int totalNum = 0;
		while (data != 0) {
			data = input.nextInt();

			sum += data;
			
			if (data < 0) { 
				countNeg ++;
				totalNum ++;
			} else if (data > 0) {
				countPos ++;
				totalNum ++;
			}
		}
		float avg = (float)sum / totalNum;
		System.out.println("The number of positives is " + countPos);
		System.out.println("The number of negatives is " + countNeg);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + avg);

	}

}
