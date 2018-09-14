import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class maze extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		Map map = MapInterpreter.interpretMap(new File("map.txt"));
		Scene scene = new Scene(map,map.getWidth(),map.getHeight());
		
		primaryStage.setScene(scene);
		primaryStage.show();

	
	}
	
	public static void main(String[] args) {
		launch();
	}

}
