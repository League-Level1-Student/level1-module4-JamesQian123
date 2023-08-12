package _09_whack_a_mole;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhackAMole mole = new WhackAMole();
		Random r = new Random();
		int num = r.nextInt(24);
		mole.drawButton(num);
		

	}
	public void drawButton(int mole) {
		frame = new JFrame();
		panel = new JPanel();
		for(int i = 0; i < 24; i++) {
			JButton button1 = new JButton();
			panel.add(button1);
			if(mole == i) {
				button = button1;
				button1.setText("mole");
			}
			button1.addActionListener(this);
			
		}
	
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300,400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(button == e.getSource()) {
			drawButton(new Random().nextInt(24));
		}
		
		else {
			speak("this isnt the mole");
		}
	}

}
