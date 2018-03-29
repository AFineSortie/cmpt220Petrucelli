
public class AccountSubclassesTest {

	public static void main(String[] args) {
		Account acc1 = new Account(112233, 33.33);
		Checking chk1 = new Checking(100.00, 112234, 4.00);
		Saving sav1 = new Saving(112235, 3.50);
		
		System.out.println(acc1.toString());
		System.out.println("\n" + chk1.toString());
		System.out.println("\n" + sav1.toString());
	}

}
