package fx_objects;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class House extends Group {

	public static double FLOOR_HEIGHT = 75;

	public House(){
		this(150,(int) (Math.random()*4+1),true);
	}
	
	public House(double width, int floors,boolean basement) {

		Polygon roof = new Polygon(width / 2, 0, 0, FLOOR_HEIGHT, width, FLOOR_HEIGHT);
		this.getChildren().add(roof);

		for (int i = 1; i <= floors; i++) {
			Rectangle floor = new Rectangle(width, FLOOR_HEIGHT);
			floor.setTranslateY(FLOOR_HEIGHT * i);
			floor.setFill(Color.SANDYBROWN);
			floor.setStroke(Color.BLACK);
			this.getChildren().add(floor);
		}
		
		if(basement){
			Rectangle floor = new Rectangle(width, FLOOR_HEIGHT);
			floor.setTranslateY(FLOOR_HEIGHT * (floors+1));
			floor.setFill(Color.GRAY);
			floor.setStroke(Color.BLACK);
			this.getChildren().add(floor);
		}

	}

}
