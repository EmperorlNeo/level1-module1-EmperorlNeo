import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	 JLabel label = new JLabel();
	 JTextField numbers = new JTextField(8);
	 String bi = numbers.getText();
public static void main(String[] args) {
new BinaryConverter().createUI();
	
}
	  private void createUI() {
	// TODO Auto-generated method stub
		  JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(700, 200);
			frame.setLocation(600, 500);
			frame.setTitle("Convert 8 bits of binary ASCII");
			JPanel panel = new JPanel();
			frame.add(panel);
			panel.add(numbers);
			numbers.setLocation(10, 10);
			System.out.println(bi);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(null);
			button.setText("Convert");
			button.setSize(20, 15);
			panel.add(label);
	
}
	 
	static String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
         if (!input.matches(binary)) {
              JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
              return "-";
         }
         try {
              int asciiValue = Integer.parseInt(input, 2);
              char theLetter = (char) asciiValue;
              return "" + theLetter;
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
              return "-";
         }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String nary = convert(bi);
	label.setText(nary);
}


}
