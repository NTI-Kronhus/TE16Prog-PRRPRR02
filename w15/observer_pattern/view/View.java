package observer_pattern.view;

import observer_pattern.model.Model;

public class View implements Observer {

	private Model model;
	private String name;

	public View(Model m, String n) {
		model = m;
		model.addObserver(this);
		name = n;
	}

	@Override
	public void update() {
		updateView();
	}

	private void updateView() {
		System.out.println(name + " : " + model.getText());
	}

}
