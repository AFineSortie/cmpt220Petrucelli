import java.util.Scanner;
public class NbyNMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print(randomNum() + " ");
			}
			System.out.print(randomNum() + "\n");
		}
	}
	
	public static int randomNum() {
		int num = (int)Math.round(Math.random());
		return num;
	}

}
