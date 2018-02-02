import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String userInput = input.next();
		int charInput = (int)userInput.toLowerCase().trim().charAt(0);
		if (charInput == 'a' || charInput == 'e' || charInput == 'i' || charInput == 'o' || charInput == 'u') {
			System.out.println(userInput + " is a vowel");
		} else if (charInput >= 'a' && charInput <= 'z') {
			System.out.println(userInput + " is a consonant");
		} else {
			System.out.println(userInput + " is an invalid input");
		}
	}

}
