package fx_objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Star extends Polygon {

	public Star() {
		this(50, -18);
	}

	public Star(double radius) {
		this(radius, -18);
	}

	public Star(double radius, double startDeg) {

		double deg = Math.toRadians(startDeg);
		double x = Math.cos(deg) * radius + radius;
		double y = Math.sin(deg) * radius + radius;

		this.setFill(Color.YELLOW);

		for (int i = 0; i < 5; i++) {
			this.getPoints().add(x);
			this.getPoints().add(y);
			deg += 2 * Math.PI / 5 * 2;
			x = Math.cos(deg) * radius + radius;
			y = Math.sin(deg) * radius + radius;
		}

	}

}
