import java.util.Scanner;
public class CountOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers: ");
		int[] counts = new int[101];
		int nextNum = 1;
		while (nextNum != 0) {
			nextNum = input.nextInt();
			counts[nextNum] += 1;
		}
		
		for (int i = 1; i <= 100; i++) {
			if (counts[i] >= 1) {
				System.out.println(i + " appears " + counts[i] + " time(s)");
			}
		}
	}

}
