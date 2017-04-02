import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UserMainWindow extends JFrame {

	private JPanel contentPane;
	private JFrame userFrame;

	/**
	 * Create the frame.
	 */
	public UserMainWindow() {
		init();
	}
	
	public void init(){
		userFrame = new JFrame();
		userFrame.setVisible(false);
		userFrame.setBounds(100, 100, 720, 480);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public void setVisib(Boolean visib) {
		userFrame.setVisible(visib);
		userFrame.setBounds(100, 100, 720, 480);
	}
}
