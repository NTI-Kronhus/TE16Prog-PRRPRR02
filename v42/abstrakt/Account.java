package abstrakt;

public abstract class Account {

	private double balance;
	private String owner;

	public Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getOwner() {
		return this.owner;
	}

	abstract void getInfo();

	public void deposit(double amount) {
		if (amount < 0) {
			return; // abort
		}
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			return; // abort
		}
		if (this.balance - amount < 0) {
			return; // abort
		}
		this.balance -= amount;
	}

}
