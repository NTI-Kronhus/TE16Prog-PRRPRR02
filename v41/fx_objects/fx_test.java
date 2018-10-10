package fx_objects;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class fx_test extends Application {

	
	ArrayList<House> houses = new ArrayList<House>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 500,Color.RED);

		 Ball ball = new Ball(50,Color.BLUE);
		 root.getChildren().add(ball);
		for (int i = 0; i < Math.random()*20+5; i++) {
			Star star = new Star(Math.random()*30+20,Math.random()*360);
			star.setTranslateX(Math.random()*400);
			star.setTranslateY(Math.random()*400);
			root.getChildren().add(star);

		}

		
		
		AnimationTimer at = new AnimationTimer() {
			
			long before = 0;
			@Override
			public void handle(long now) {

				double lastX = 0;
				for (House house2 : houses) {
					house2.setTranslateX(house2.getTranslateX()-10);
				}
				if(Math.random() < 0.02){
					House h = new House();
					h.setTranslateX(500);
					h.setTranslateY(100);
					root.getChildren().add(h);
					houses.add(h);
					before = now;
				}
				
			}
		};
		
		at.start();
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}
}
