import java.util.Scanner;
public class PalindromeInteger {
	public static int reverse(int number) {
		String swap = Integer.toString(number);
		String backwards = "";
		for (int i = swap.length() - 1; i >= 0; i = i - 1) {
			char nextLetter = swap.charAt(i);
			backwards = backwards + nextLetter;
		}
		int num = Integer.parseInt(backwards);
		return num;
	}
	
	public static boolean isPalindrome( int number) {
		return number == reverse(number);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("The number backwards is: " + reverse(number));
		System.out.println("The number is a palindrome: " + isPalindrome(number));
		
		
	}

}
