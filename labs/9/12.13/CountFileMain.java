import java.io.File;
import java.util.Scanner;
public class CountFileMain {

	public static void main(String[] args) throws java.io.IOException {
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		int numChar = 0;
		int numWords = 0;
		int numLines = 0;
		while (input.hasNext()) {
			String next = input.next();
			char[] chars = next.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				numChar++;
			}
		}
		input.close();
		
		Scanner input2 = new Scanner(file);
		while (input2.hasNextLine()) {
			input2.nextLine();
			numLines++;
		}
		input2.close();
		
		Scanner input3 = new Scanner(file);
		while (input3.hasNext()) {
			String next = input3.next();
			Scanner input4 = new Scanner(next);
			while (input4.hasNext()) {
				input4.next();
				numWords++;
			}
			input4.close();

		}
		input3.close();
		
		System.out.println("Number of characters: " + numChar);
		System.out.println("Number of words: " + numWords);
		System.out.println("Number of lines: " + numLines);

	}

}
