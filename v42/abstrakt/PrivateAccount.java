package abstrakt;

public class PrivateAccount extends Account implements Transferable {

	public static final double WITHDRAW_FEE = 5;

	public PrivateAccount(String owner) {
		super(owner);
	}

	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			return; // abort
		}
		super.withdraw(amount + WITHDRAW_FEE);
	}

	@Override
	void getInfo() {
		System.out.println("ÄGARE: " + this.getOwner());
		System.out.println("SALDO: " + this.getBalance());
	}

	@Override
	public void transferMoney(Account acc, double amount) {
		this.withdraw(amount);
		acc.deposit(amount);
	}

}
