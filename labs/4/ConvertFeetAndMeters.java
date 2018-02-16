public class ConvertFeetAndMeters {

	public static void main(String[] args) {
		System.out.println("Feet         Meters   |    Meters         Feet");
		double meters = 20;
		double feet = 1;
		while (feet <= 10) {
			System.out.printf("%4.1f         %5.3f    |    %4.1f         %7.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
			feet++;
			meters = meters + 5;
		}
	}
	
	public static double footToMeter(double foot) {
		double meter = .305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}

}
