package iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SchoolClass implements Iterable<Student> {

	private ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent(Student s) {
		students.add(s);
	}

	@Override
	public Iterator<Student> iterator() {
		return students.iterator();
	}

}
