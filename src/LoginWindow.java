import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginWindow extends JFrame {

	
	private JFrame loginFrame;
	private JPasswordField passwordField;
	private JTextField userNameField;

	public LoginWindow() {
		
	}

	public void init() {
		loginFrame = new JFrame();
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(105, 90, 333, 191);
		loginFrame.getContentPane().add(loginPanel);

		loginPanel.setVisible(true);
		loginPanel.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(11, 84, 106, 20);
		loginPanel.add(passwordField);


		userNameField = new JTextField();
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

				
				char[] input = passwordField.getPassword();
				char[] correct = {'a','d','m','i','n'};
				
				if (Arrays.equals(input, correct)) {
					WindowHandler.changeToAdminMain();
					loginFrame.dispose();
					
					
				}
			}
		});
		loginPanel.add(btnLogin);


		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(11, 69, 86, 14);
		loginPanel.add(lblPassword);
		loginFrame.setBounds(100, 100, 720, 480);


	}
}
