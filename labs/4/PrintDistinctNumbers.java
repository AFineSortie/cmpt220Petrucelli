import java.util.Scanner;
public class PrintDistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] nums = new int[10];
		boolean inArray = false;
		for (int i = 0; i < nums.length; i++) {
			int nextNum = input.nextInt();
			for (int j = 0; j < i; j++) {
				if (nextNum == nums[j]) {
					inArray = true;
				}
			}
			if (! inArray) {
				nums[i] = nextNum;
			}
			inArray = false;
		}
		int distinct = 0;
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				distinct++;
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println("\nThere are " + distinct + " distinct numbers");
	}

}
