import java.util.Scanner;
public class FindFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		while (number % 2 == 0) {
			number /= 2;
			System.out.print("2, ");
		}
		int i = 3;
		while (number > 1) {
			if (number % i == 0) {
				number /= i;
				if (number > 1) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			} else {
				i += 2;
			}
		}
		if (number != 1) {
			System.out.print(number);
		}
	}

}
