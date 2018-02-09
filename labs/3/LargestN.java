
public class LargestN {

	public static void main(String[] args) {
		int n = 0;
		int i = 0;
		while (n < 12000) {
			i++;
			n = i * i * i;
		}
		System.out.println(i - 1 + " is the largest n such that n^3 < 12000");
	}

}
