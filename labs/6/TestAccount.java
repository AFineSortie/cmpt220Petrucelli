
public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account(1122, 20000);
		acc1.setAnnualInterestRate(4.5);
		
		acc1.withdraw(2500);
		acc1.deposit(3000);
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getMonthlyInterest());
		System.out.println(acc1.getDateCreated());
	}

}
