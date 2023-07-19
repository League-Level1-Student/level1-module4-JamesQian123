package _06_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();
	
	public void run() {
		frame.setVisible(true);
		frame.setSize(800,800);
		frame.add(panel);
		panel.add(button);
		button.setText("add");
		panel.add(button1);
		button1.setText("subtract");
		panel.add(button2);
		button2.setText("multiply");
		panel.add(button3);
		button3.setText("divide");
		panel.add(text);
		
		panel.add(text1);
		text.setColumns(10);
		text1.setColumns(10);
		frame.pack();
		frame.addMouseListener(this);
		
		
	}
	public int add(int valueX, int valueY) {
		return valueX + valueY;
	
	}
	public int subtract(int valueX, int valueY) {
		return valueX - valueY;
	}
	public int multiply(int valueX, int valueY) {
		return valueX * valueY;
	}
	public int divide( int valueX, int valueY) {
		return valueX/valueY;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e .equals(button)) {
		int answer = add(Integer.parseInt(text.getText()), Integer.parseInt(text1.getText()));
		
		label.setText("answer");
			
		}
		else if(e .equals(button1)) {
		int answer1 = 	subtract(Integer.parseInt(text.getText()), Integer.parseInt(text1.getText()));
		
			//label.setText();
		}
		else if(e .equals(button2)) {
			int answer2 = multiply(Integer.parseInt(text.getText()), Integer.parseInt(text1.getText()));
			label.setText(answer2 +"");
		}
		else if(e .equals(button3)) {
			int answer3 = divide(Integer.parseInt(text.getText()), Integer.parseInt(text1.getText()));
			label.setText(answer3 + "");
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
