import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Metoder {
	
	public static int fakultet(int n){

		if(n < 0){
			return -1;
		}
		
		if(n == 0){
			return 1;
		}
		else{
			return n*fakultet(n-1);
		}
		
	}
	
	public static <T> T test(T obj){
		return obj;
	}
	
	public static void ord(String... strings){

		for (String string : strings) {
			System.out.println(string);
		}	

	}
	
	
	public static void main(String[] args) {
	
	}

	
	
}
