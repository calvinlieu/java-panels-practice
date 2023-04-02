import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListen extends JFrame implements MouseListener{
	
	JLabel label;
	
	
	MouseListen() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(50, 50, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		this.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("You clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Invoked when a mouse button has bbeen pressed on a component
		label.setBackground(Color.yellow);
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released
		label.setBackground(Color.green);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// When a mouse enters a component
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// When a mouse exits a component
		
	}

}
