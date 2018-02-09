
public class ConversionTables {

	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds   |   Pounds       Kilograms");
		int kilograms = 1;
		int pounds = 20;
		for (int i = 1; i <= 199; i++) {
			System.out.printf("\n%5d", kilograms);
			System.out.print("        ");
			System.out.printf("%7.1f", kilograms * 2.2);
			System.out.print("    |  ");
			System.out.printf("%5d", pounds);
			System.out.print("        ");
			System.out.printf("%8.2f", (pounds * .4545));
			kilograms ++;
			pounds += 5;
			
		}
	}

}
