import java.util.Scanner;
public class DisplayPrimeFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		StackOfIntegers factorStack = new StackOfIntegers();
		
		int i = 2;
		while (number > 1) {
			if (number % i == 0) {
				number /= i;
				factorStack.push(i);
			} else {
				i++;
			}
		}
		if (number != 1) {
			factorStack.push(number);
		}
		
		for (int j = factorStack.getSize(); j > 0; j--) {
			System.out.print(factorStack.pop() + " ");
		}
	}

}
