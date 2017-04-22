import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame {

	
	private JFrame loginFrame;
	private JPasswordField passwordField;
	private JTextField userNameField;
	private LoginHandler loginHandler = new LoginHandler();

	public LoginWindow() {
		init();
	}

	public void init() {
		loginFrame = new JFrame();
		loginFrame.setTitle("Login");
		loginFrame.setVisible(false);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(23, 21, 250, 200);
		loginFrame.getContentPane().add(loginPanel);

		loginPanel.setVisible(true);
		loginPanel.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(11, 84, 106, 20);
		loginPanel.add(passwordField);


		userNameField = new JTextField();
		userNameField.setText("admin");
		userNameField.setBounds(11, 44, 106, 20);
		loginPanel.add(userNameField);
		userNameField.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(11, 28, 86, 14);
		loginPanel.add(lblUsername);


		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(11, 115, 106, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				char[] inputPass = passwordField.getPassword();
				char[] admin = {'a','d','m','i','n'};
				char[] user = {'v','i','e','r','a','s'};
				
				String inputUserName = userNameField.getText();
				
				if (Arrays.equals(inputPass, admin) && inputUserName.equals("admin")) {
					WindowHandler.changeToAdminMain();
					loginFrame.dispose();
				}
				else if (loginHandler.checkPassword(inputPass, inputUserName)) {
					WindowHandler.changeToUserMainWindow();
					System.out.println("Logged in as: "+inputUserName);
					LoginHandler.setLoggedAs(inputUserName);
					WindowHandler.setReservationUserName(inputUserName);
				}
			}
		});
		loginPanel.add(btnLogin);


		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(11, 69, 86, 14);
		loginPanel.add(lblPassword);
		loginFrame.setBounds(100, 100, 350, 350);


	}
	
	public void setVisib(Boolean visible) {
		loginFrame.setVisible(visible);
		loginFrame.setBounds(100, 100, 200, 250);
	}
}
