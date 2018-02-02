import java.util.Scanner;
public class ScissorsRockPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int comp = (int)(Math.random() * 2);
		System.out.print("Scissor (0), Rock (1), Paper (2): ");
		int pick = input.nextInt();
		String end = "";
		if (pick == 0 && comp == 0) {
			end = "It is a draw";
		} 
		if (pick == 0 && comp == 1) {
			end = "You lose";
		} 
		if (pick == 0 && comp == 2) {
			end = "You win";
		}
		
		if (pick == 1 && comp == 0) {
			end = "You win";
		} 
		if (pick == 1 && comp == 1) {
			end = "It is a draw";
		} 
		if (pick == 1 && comp == 2) {
			end = "You lose";
		}
		
		if (pick == 2 && comp == 0) {
			end = "You lose";
		} 
		if (pick == 2 && comp == 1) {
			end = "You win";
		} 
		if (pick == 2 && comp == 2) {
			end = "It is a draw";
		}
		System.out.println("You chose " + pick + ", the computer chose " + comp + ", " + end);
	}

}
