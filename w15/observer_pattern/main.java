package observer_pattern;

import javax.swing.JOptionPane;

import observer_pattern.model.Model;
import observer_pattern.view.View;
import observer_pattern.view.ViewV2;

public class main {
	public static void main(String[] args) {

		Model m = new Model();

		View v = new View(m,"View 1");
		ViewV2 vv2 = new ViewV2(m);

		for (int i = 0; i < 10; i++) {
			m.updateText(JOptionPane.showInputDialog("Skriv ett inlägg:"));
			
			if(i == 4) {
				View v2 = new View(m,"View 2");
			}
		}

	}

}
