import java.util.Scanner;
public class A1Paper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int smallestA = input.nextInt();
		int reqPapers = 2;
		double lenTape = 0.0;
		boolean  possible = false;
		for (int j = 2; j <= smallestA; j++) {
			int numPapers = input.nextInt();
			lenTape += (reqPapers / 2) * getLong(j);
			if (numPapers >= reqPapers) {
				possible = true;
				break;
			}
			reqPapers = (reqPapers - numPapers) * 2;
		}
		System.out.print(possible ? lenTape: "impossible");
	}
	
	public static double getLong(int j) {
		double longSide = (Math.pow(2, .25)) * Math.pow(Math.sqrt(2) / 2, j);
		return longSide;
	}
}
