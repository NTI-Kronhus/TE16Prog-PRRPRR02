package abstrakt;

import java.util.ArrayList;

public class account_test {

	public static void main(String[] args) {

		ArrayList<Account> accounts = new ArrayList<Account>();

		accounts.add(new PrivateAccount("Tomas"));
		accounts.add(new PrivateAccount("William"));
		accounts.add(new CreditAccount("Lucas"));
		accounts.add(new CreditAccount("Loke"));
		accounts.add(new PrivateAccount("Linus"));

		for (Account account : accounts) {

			if (account instanceof CreditAccount) {
				((CreditAccount) account).extra();
			}

		}

	}

}
