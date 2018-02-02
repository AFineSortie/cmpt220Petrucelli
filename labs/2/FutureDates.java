import java.util.Scanner;
public class FutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int passed = input.nextInt();
		int futureDay = (today + passed) % 7;
		
		String todayString = "";
		switch (today) {
			case 0: todayString = "Sunday";
				break;
			case 1: todayString = "Monday";
				break;
			case 2: todayString = "Tuesday";
				break;
			case 3: todayString = "Wednesday";
				break;
			case 4: todayString = "Thursday";
				break;
			case 5: todayString = "Friday";
				break;
			case 6: todayString = "Saturday";
				break;
		}
		
		String futureString = "";
		switch (futureDay) {
			case 0: futureString = "Sunday";
				break;
			case 1: futureString = "Monday";
				break;
			case 2: futureString = "Tuesday";
				break;
			case 3: futureString = "Wednesday";
				break;
			case 4: futureString = "Thursday";
				break;
			case 5: futureString = "Friday";
				break;
			case 6: futureString = "Saturday";
				break;
		}
		
		System.out.println("Today is " + todayString + " and the future day is " + futureString);
	}

}
