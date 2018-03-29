
public class Checking extends Account {
	private double overdraftLimit = 1.0;
	
	public Checking() {
	}
	
	public Checking(double overdraftLimit, int id, double balance) {
		this.overdraftLimit = overdraftLimit;
		setId(id);
		setBalance(balance);
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public String toString() {
		return "Checking: \nID: " + this.getId() + "\nBalance: " + this.getBalance() + "\nOverdraft Limit: " + overdraftLimit;
	}
}
