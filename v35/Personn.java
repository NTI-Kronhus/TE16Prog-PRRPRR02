
public class Personn <T> {

	private int age;
	private String name;
	private T favoritsak;
	
	public  Personn(String name, int age, T favoritsak){
		this.age = age;
		this.name = name;
		this.favoritsak = favoritsak;		
	}
	
	
}
