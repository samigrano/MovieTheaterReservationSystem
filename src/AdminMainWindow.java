import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.sun.glass.ui.MenuItem;

public class AdminMainWindow extends JFrame {

	private JFrame adminFrame;
	
	


	/**
	 * Create the frame.
	 */
	public AdminMainWindow() {
		
		init();
		
	}
	
	public void init() {
		adminFrame = new JFrame();
		adminFrame.setVisible(false);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		
		JPanel adminJPanel = new JPanel();
		adminJPanel.setBounds(0, 0, 1280, 720);
		adminFrame.getContentPane().add(adminJPanel);
		
		adminJPanel.setVisible(true);
		adminJPanel.setLayout(null);
		
		JMenuBar adminMenuBar = new JMenuBar();
		adminMenuBar.setBounds(0, 0, 1280, 25);
		adminMenuBar.setVisible(true);
		adminJPanel.add(adminMenuBar);
		
		JMenu adminMenu = new JMenu("Menu");
		adminMenu.setVisible(true);
		adminMenu.setBounds(0, 0, 1280, 25);
		adminMenu.setMnemonic(KeyEvent.VK_A);
		adminMenuBar.add(adminMenu);
		
		JMenuItem addUser = new JMenuItem("Add user");
		addUser.setVisible(true);
		adminMenu.add(addUser);
		addUser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowHandler.changeToUserReg();
				
			}
		});
		
		adminFrame.setBounds(100, 100, 720, 480);
	}
	
	public void setVisib(Boolean visible) {
		adminFrame.setBounds(100, 100, 720, 480);
		adminFrame.setVisible(visible);
	}

}
