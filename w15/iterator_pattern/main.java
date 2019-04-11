package iterator_pattern;

public class main {
	
	public static void main(String[] args) {
		
		SchoolClass klass = new SchoolClass();
		
		klass.addStudent(new Student("Mattis"));
		klass.addStudent(new Student("Emanuel"));
		klass.addStudent(new Student("Michael"));
		klass.addStudent(new Student("William"));
		klass.addStudent(new Student("Sebastian"));
		klass.addStudent(new Student("Lucas"));
		klass.addStudent(new Student("Anton"));
		klass.addStudent(new Student("Bahja"));
		klass.addStudent(new Student("Oscar"));
		klass.addStudent(new Student("Jakob"));
		klass.addStudent(new Student("Jesper"));
		
		
		for (Student s : klass) {
			System.out.println(s);
		}
		
	}

}
