
public class Saving extends Account {
	
	public Saving() {
	}
	
	public Saving(int id, double balance) {
		setId(id);
		setBalance(balance);
	}
	
	public String toString() {
		return "Saving: \nID: " + this.getId() + "\nBalance: " + this.getBalance();	
		}
}
