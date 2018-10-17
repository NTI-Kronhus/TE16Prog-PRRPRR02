package abstrakt;

public class CreditAccount extends Account {

	private double MAX_CREDIT;
	private double CREDIT;

	public CreditAccount(String owner) {
		super(owner);
		this.MAX_CREDIT = 10000;
		this.CREDIT = this.MAX_CREDIT;
	}

	@Override
	public void deposit(double amount) {
		if (this.getCreditUsed() > 0) {
			if (this.CREDIT + amount > this.MAX_CREDIT) {
				amount -= this.getCreditUsed();
				this.CREDIT = this.MAX_CREDIT;
				super.deposit(amount);
			} else {
				this.CREDIT += amount;
			}
		} else {
			super.deposit(amount);
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			return; // abort
		}
		if (super.getBalance() - amount < 0) {
			double balance = super.getBalance();

			amount -= balance;
			if (this.CREDIT - amount < 0) {
				return;
			}
			super.withdraw(balance);
			this.CREDIT -= amount;

		} else {
			super.withdraw(amount);
		}
	}

	public double getCreditUsed() {
		return this.MAX_CREDIT - this.CREDIT;
	}

	public double getCreditLeft() {
		return this.CREDIT;
	}

	@Override
	public double getBalance() {
		return super.getBalance() - getCreditUsed();
	}

	@Override
	void getInfo() {
		System.out.println("ÄGARE: " + this.getOwner());
		System.out.println("SALDO: " + super.getBalance());
		System.out.println("CREDIT USED: " + this.getCreditUsed());
		System.out.println("CREDIT LEFT: " + this.getCreditLeft());
	}

	public void extra() {
		System.out.println("Denna metod finns bara i CreditAccount");
	}
}
