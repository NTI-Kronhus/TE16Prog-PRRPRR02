package iterator_pattern.my_iterator;

public class main {

	public static void main(String[] args) {

		MailList lista = new MailList();

		lista.addMail(new MailAddress("jjaokk@gmail.com"));
		lista.addMail(new MailAddress("jjaokk@gmail.com"));
		lista.addMail(new MailAddress("jjaokk@gmail.com"));
		lista.addMail(new MailAddress("jjaokk@gmail.com"));
		lista.addMail(new MailAddress("jjaokk@gmail.com"));
		lista.addMail(new MailAddress("jjaokk@gmail.com"));

		IIterator<MailAddress> iterator = lista.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}

	}

}
