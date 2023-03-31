import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuBars extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MenuBars(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("file");
		editMenu = new JMenu("edit");
		helpMenu = new JMenu("help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for load
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help
		loadItem.setMnemonic(KeyEvent.VK_L); //L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		

		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			System.out.println("Beep Boop, you loaded a file");
		}
		if (e.getSource() == saveItem) {
			System.out.println("Beep Boop, you saved a file");
		}
		if (e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
