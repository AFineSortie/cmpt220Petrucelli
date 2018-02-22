import java.util.Scanner;
public class EliminateDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		int[] distinctNums = eliminateDuplicates(nums);
		System.out.print("The distinct numbers are: ");
		for (int j = 0; j < distinctNums.length; j++) {
			if (distinctNums[j] > 0) {
				System.out.print(distinctNums[j] + " ");
			}
		}		
	}
	public static int[] eliminateDuplicates(int[] nums) {
		int[] distinctNums = new int[10];
		boolean inArray = false;
		for (int i = 0; i < nums.length; i++) {
			int nextNum = nums[i];
			for (int j = 0; j < i; j++) {
				if (nextNum == distinctNums[j]) {
					inArray = true;
				}
			}
			if (! inArray) {
				distinctNums[i] = nextNum;
			}
			inArray = false;
		}
		return distinctNums;
	}

}
