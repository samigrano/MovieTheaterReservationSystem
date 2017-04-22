import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.sun.glass.ui.MenuItem;
import javax.swing.JButton;

public class AdminMainWindow extends JFrame {

	private JFrame adminFrame;
	private static JButton btnAddMovie;
	private static JButton btnUserReg;


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
		adminJPanel.setBounds(0, 0, 300, 160);
		adminFrame.getContentPane().add(adminJPanel);
		
		adminJPanel.setVisible(true);
		adminJPanel.setLayout(null);
		
		JMenuBar adminMenuBar = new JMenuBar();
		adminMenuBar.setBounds(0, 0, 330, 25);
		adminMenuBar.setVisible(true);
		adminJPanel.add(adminMenuBar);
		
		JMenu adminMenu = new JMenu("Menu");
		adminMenu.setVisible(true);
		adminMenu.setBounds(0, 0, 330, 25);
		adminMenu.setMnemonic(KeyEvent.VK_A);
		adminMenuBar.add(adminMenu);
		
		JMenuItem addUser = new JMenuItem("Add user");
		addUser.setVisible(true);
		adminMenu.add(addUser);
		
		btnUserReg = new JButton("User reg");
		btnUserReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WindowHandler.changeToUserReg();
				btnUserReg.setEnabled(false);
			}
		});
		btnUserReg.setBounds(27, 67, 89, 23);
		adminJPanel.add(btnUserReg);
		
		btnAddMovie = new JButton("Add movie");
		btnAddMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindowHandler.changeMovieAddWindow();
				btnAddMovie.setEnabled(false);
			}
		});
		btnAddMovie.setBounds(154, 67, 112, 23);
		adminJPanel.add(btnAddMovie);
		addUser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowHandler.changeToUserReg();
			}
		});
		
		adminFrame.setBounds(100, 100, 348, 200);
	}
	public static void setAddMovieBtnTrue(){
		btnAddMovie.setEnabled(true);
	}
	public static void setUserRegBtnTrue(){
		btnUserReg.setEnabled(true);
	}
	public void setVisib(Boolean visible) {
		adminFrame.setBounds(100, 100, 350, 200);
		adminFrame.setVisible(visible);
	}
}
