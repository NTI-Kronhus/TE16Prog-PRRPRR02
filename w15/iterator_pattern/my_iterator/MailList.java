package iterator_pattern.my_iterator;

import java.util.ArrayList;

public class MailList implements IIterable<MailAddress> {

	private ArrayList<MailAddress> addresses;

	public MailList() {
		addresses = new ArrayList<MailAddress>();
	}

	public void addMail(MailAddress a) {
		addresses.add(a);
	}

	@Override
	public IIterator<MailAddress> getIterator() {
		return new MailAddressIterator();
	}

	class MailAddressIterator implements IIterator<MailAddress> {

		@Override
		public boolean hasNext() {
			if (addresses.size() > 0) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public MailAddress getNext() {
			MailAddress mail = addresses.get(0);
			addresses.remove(0);
			return mail;
		}

	}

}
