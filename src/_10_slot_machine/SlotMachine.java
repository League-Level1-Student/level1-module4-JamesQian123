package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	
	public void run() throws MalformedURLException {
		label = createLabelImage("casino7.jpeg");
		label1 = createLabelImage("cherry.png");
		label2 = createLabelImage("lemon.png");
		frame.setVisible(true);
		frame.setSize(1700,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.remove(label);
		panel.remove(label1);
		panel.remove(label2);
		panel.remove(button);
		Random r = new Random();
		int random = r.nextInt(3);
		if(random == 0) {
			try {
				label = createLabelImage("casino7.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(random == 1) {
			try {
				label = createLabelImage("cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(random == 2 ) {
			try {
				label = createLabelImage("lemon.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		 int random1 = r.nextInt(3);
			if(random1 == 0) {
				try {
					label1 = createLabelImage("casino7.jpeg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(random1 == 1) {
				try {
					label1 = createLabelImage("cherry.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(random1 == 2 ) {
				try {
					label1 = createLabelImage("lemon.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			int random2 = r.nextInt(3);
				if(random2 == 0) {
					try {
						label2 = createLabelImage("casino7.jpeg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(random2 == 1) {
					try {
						label2 = createLabelImage("cherry.png");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(random2 == 2 ) {
					try {
						label2 = createLabelImage("lemon.png");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(random == random1 && random == random2) {
					JOptionPane.showMessageDialog(null,"you win");
				}
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(button);
		frame.pack();
	}
    
	
    
    

}
