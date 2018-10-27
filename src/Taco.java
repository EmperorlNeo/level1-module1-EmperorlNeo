import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Taco implements ActionListener {
	public static void main(String[] args) {
		new Taco().createUI();
		JOptionPane.showMessageDialog(null, "Would you like a taco?");

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	Dimension normal = new Dimension(250,250);
	private static void setMeat(String meat) {

	}

	private static void setSauce(String sauce) {

	}

	private static void getMeat() {
		setSauce("*MEAT INSERTED*");
	}

	private static void getSauce() {
		setMeat("*SAUCE INSERTED*");
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button) {
			  JOptionPane.showMessageDialog(null, "With meat?");
			  frame.dispose();
			  createUI();
		}

	}

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		button.setText("Yes");
		button2.setText("No");
		button.addActionListener(this);
		button.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		frame.setSize(500, 500);
		frame.setLocation(500, 500);
		button.setPreferredSize(normal);
		button2.setPreferredSize(normal);
	}

}