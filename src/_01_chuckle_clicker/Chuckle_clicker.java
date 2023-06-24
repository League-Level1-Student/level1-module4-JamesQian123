package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_clicker implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	public void makeButtons() {
		//JOptionPane.showMessageDialog(null, "make buttons");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("joke");
		button2.setText("punchline");
		button.addActionListener(this);
		button2.addActionListener(this);
		
		}
			
			
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chuckle_clicker clicker = new Chuckle_clicker();
		clicker.makeButtons();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(button, "Why is Cinderella bad at soccer? ");
		}
		if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(button, "Because she keeps running away from the ball");
		}
		// TODO Auto-generated method stub
		
			
		

}
	}
