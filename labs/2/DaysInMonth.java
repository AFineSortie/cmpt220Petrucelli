import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		int days = 0;
		switch (month) {
			case 0: days = 31;
				break;
			case 1: if (year % 4 == 0) {
				days = 29;
			} else {
				days = 28;
			}
				break;
			case 2: days = 31;
				break;
			case 3: days = 30;
				break;
			case 4: days = 31;
				break;
			case 5: days = 30;
				break;
			case 6: days = 31;
				break;
			case 7: days = 31;
				break;
			case 8: days = 	30;
				break;
			case 9: days = 31;
				break;
			case 10: days = 30;
				break;
			case 11: days = 31;
				break;	
		}
		System.out.println("There are " + days + " days in the month");
	} 	

}
