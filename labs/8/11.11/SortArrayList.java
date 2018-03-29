import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		input.close();
		
		ArrayList<Integer> nums = new ArrayList(5);
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num4);
		nums.add(num5);
		
		sort(nums);
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}

	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}
