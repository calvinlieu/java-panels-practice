import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerPractice extends JFrame implements KeyListener {
	
	JLabel label;
	
	
	KeyListenerPractice() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-5, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-5);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+5);
			break;
		case 'd': label.setLocation(label.getX()+5, label.getY());
			break;
		
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-5, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-5);
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a button is released
//		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key char: " + e.getKeyCode());
		
	}

}
