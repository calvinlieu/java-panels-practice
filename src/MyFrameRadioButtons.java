//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ButtonGroup;
//import javax.swing.JFrame;
//import javax.swing.JRadioButton;
//
//public class MyFrameRadioButtons extends JFrame implements ActionListener {
//	
//	JRadioButton pizzaButton;
//	JRadioButton hamburgerButton;
//	JRadioButton hotDogButton;
//	
//	MyFrameRadioButtons() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		
//		pizzaButton = new JRadioButton("pizza");
//		hamburgerButton = new JRadioButton("hamburger");
//		hotDogButton = new JRadioButton("hot dog");
//		
//		
//		ButtonGroup group = new ButtonGroup();
//		group.add(pizzaButton);
//		group.add(hamburgerButton);
//		group.add(hotDogButton);
//		
//		pizzaButton.addActionListener(this);
//		hamburgerButton.addActionListener(this);
//		hotDogButton.addActionListener(this);
//		
//		this.add(pizzaButton);
//		this.add(hamburgerButton);
//		this.add(hotDogButton);
//	
//		
//		this.pack();
//		this.setVisible(true);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getSource() == pizzaButton) {
//			System.out.println("you ordered pizza");
//		} else if (e.getSource() == hamburgerButton) {
//			System.out.print("You ordered hamburger");
//		} else if (e.getSource() == hotDogButton) {
//			System.out.print("You ordered hot dog");
//		}
//	}
//
//}
