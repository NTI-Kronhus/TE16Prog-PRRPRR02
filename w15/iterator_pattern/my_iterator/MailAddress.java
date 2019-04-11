package iterator_pattern.my_iterator;

public class MailAddress {

	private String address;

	public MailAddress(String mail) {
		address = mail;
	}

	@Override
	public String toString() {
		return address;
	}
}
