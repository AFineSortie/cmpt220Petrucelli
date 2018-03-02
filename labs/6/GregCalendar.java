import java.util.GregorianCalendar;
public class GregCalendar {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.println(today.get(GregorianCalendar.YEAR));
		System.out.println(today.get(GregorianCalendar.MONTH));
		System.out.println(today.get(GregorianCalendar.DAY_OF_MONTH));
		
		GregorianCalendar mysteryDate = new GregorianCalendar();
		long millis = 1234567898765L;
		mysteryDate.setTimeInMillis(millis);
		System.out.println("\n" + mysteryDate.get(GregorianCalendar.YEAR));
		System.out.println(mysteryDate.get(GregorianCalendar.MONTH));
		System.out.println(mysteryDate.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}
