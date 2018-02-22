import java.util.Scanner;
public class NineHeadsAndTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		int[] binaryNum = new int[9];
		int biggestBinary = 256;
		for (int i = 0; i < binaryNum.length; i++) {
			if (num - biggestBinary >= 0) {
				binaryNum[i] += 1;
				num -= biggestBinary;
			}
			biggestBinary /= 2;
		}
		for (int j = 0; j < binaryNum.length; j++) {
			if (j == 6 || j == 3) {
				System.out.print("\n" + printHT(binaryNum[j]));
			} else {
				System.out.print(printHT(binaryNum[j]));
			}
		}
	}
	public static String printHT(int n) {
		String side = " ";
		if (n == 0) {
			side = "H ";
		} else {
			side = "T ";
		}
		return side;
	}
}
