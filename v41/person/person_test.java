package person;

public class person_test {
	
	public static void main(String[] args) {
		
		Person p = new Person(69,"jaok",75,185);
		System.out.println(p.getName());
		System.out.println(p.getLength());
		p.setLength(190);
		System.out.println(p.getLength());
		
	}

}
