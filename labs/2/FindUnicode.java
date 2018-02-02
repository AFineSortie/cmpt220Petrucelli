import java.util.Scanner;
public class FindUnicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String charString = input.next();
		int characterNum = (int)charString.trim().charAt(0);
		System.out.print("The Unicode for the character " + charString + " is " + characterNum);
	}

}
