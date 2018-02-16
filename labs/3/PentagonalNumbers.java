
public class PentagonalNumbers {

	public static int getPentagonalNumber(int n) {
		int ret = n * ((3 * n) - 1) / 2;
		return ret;
	}
	
	public static void main(String[] args) {
		int j = 0;
		while (j <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%7d", getPentagonalNumber(i + j));
			}
		System.out.println(" ");
		j++;
		}
	}

}
