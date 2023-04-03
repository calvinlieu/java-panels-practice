import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame{
	
	JFrame frame;
	JPanel panel;
	JLabel userlabel;
	JLabel passwordLabel;
	JTextField userText;
	JPasswordField passText;
	JButton button;
	
	LoginScreen() {
		frame = new JFrame();
		panel = new JPanel();
		passText = new JPasswordField();
		button = new JButton("Login");
		userlabel = new JLabel("User");
		userlabel.setBounds(10,  20,  80,  25);
		
		panel.add(userlabel);
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		
		frame.setVisible(true);
		
		
		
		
		
	}

}
