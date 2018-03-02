import java.util.Date;
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		this.id = newId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return this.getMonthlyInterestRate() * balance;
	}
	
	public void withdraw(double amt) {
		this.balance -= amt;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	
}
