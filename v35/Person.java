
public class Person <T> {

	private int age;
	private String name;
	private T favoritsak;
	
	public  Person(String name, int age, T favoritsak){
		this.age = age;
		this.name = name;
		this.favoritsak = favoritsak;		
	}
	
	
}
