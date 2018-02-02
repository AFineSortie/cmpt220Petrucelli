import java.util.Scanner;
public class CheckSSN {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String ssn = input.next();

		String ssnTrim = ssn.replace("-", "");
		//System.out.println(ssnTrim);
		//System.out.println(ssn);

		int i = 0;
		boolean valid = true;
		while (i <= 8) {
			char test = ssnTrim.charAt(i);
			if (Character.isDigit(test) && ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
				valid = true;
			} else {
				valid = false;
				break;
			}
			i = i + 1;

		}
		
		if (valid && ssn.length() == 11) {
			System.out.println(ssn + " is a valid Social Security Number");
		} else {
			System.out.println(ssn + " is not a valid Social Security Number");
		}
	}

}
