package observer_pattern.model;

public class Model extends Observable {

	String text;

	public void updateText(String t) {
		text = t;
		notifyObservers();
	}

	public String getText() {
		return text;
	}

}
