import java.util.Scanner;
public class ArrayIndexOOB {

	public static void main(String[] args) {
		int[] list = new int[100];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 10);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the index of the array: ");
		int index = input.nextInt();
		try { 
			System.out.println(list[index]);
		} catch (IndexOutOfBoundsException e){
			System.err.print("Out of Bounds");
		}
		
	}

}
