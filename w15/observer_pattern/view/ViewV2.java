package observer_pattern.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import observer_pattern.model.Model;

public class ViewV2 extends JFrame implements Observer {

	private Model model;
	private JTextArea textArea = new JTextArea();

	public ViewV2(Model m) {
		model = m;
		m.addObserver(this);
		prepareTextArea();
		this.setBounds(0, 0, 500, 500);
		this.setVisible(true);
	}

	private void prepareTextArea() {
		textArea.setFont(new Font("Courier New", Font.PLAIN, 40));
		textArea.setEditable(false);
		this.add(textArea);
	}

	@Override
	public void update() {
		updateView();
	}

	public void updateView() {
		textArea.setText(textArea.getText() + model.getText() + "\n");
	}

}
