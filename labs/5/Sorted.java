import java.util.Scanner;
public class Sorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the list: ");
		int size = input.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the contents of the list: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		System.out.print("The list has " + size + " integers: ");
		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
		if (isSorted(nums)) {
			System.out.println("\nThe list is already sorted");
		} else {
			System.out.println("\nThe list is not sorted");
		}
		
	}
	public static boolean isSorted(int[] nums) {
		boolean isSorted = true;
		for (int i = 0; i < nums.length; i++) {
			int currNum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (currNum > nums[j]) {
					isSorted = false;
				}
			}
		}
		return isSorted;
	}

}
