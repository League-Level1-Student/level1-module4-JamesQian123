package _03_typing_tutor;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_tutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	
	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		char currentLetter = generateRandomLetter();
		label.setText("currentLetter");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(null);
		frame.add(panel);
		panel.add(label);
		frame.pack();
	}
	public void keyReleased() {
		char currentLetter = generateRandomLetter();
		label.setText("currentLetter");
		if(frame.getKeyListeners() .equals(currentLetter)) {
			
		}
		
		
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typing_tutor tutor = new Typing_tutor();
		tutor.setup(); 

	}

	
	
}
