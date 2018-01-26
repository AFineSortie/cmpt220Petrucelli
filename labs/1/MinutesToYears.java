import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		long hours = minutes / 60;
		long days = hours / 24;
		long years = days / 365;
		long leftover = days - (years * 365);
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + leftover + " days");
		

	}

}
