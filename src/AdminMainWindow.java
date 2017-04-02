import javax.swing.JFrame;

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
		adminFrame.setBounds(100, 100, 720, 480);
	}
	
	public void setVisib(Boolean visible) {
		adminFrame.setBounds(100, 100, 720, 480);
		adminFrame.setVisible(visible);
	}

}
