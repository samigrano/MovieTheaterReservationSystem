import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class UserRegistrationWindow {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField nameField;
	private JTextField searchField;
	private JTextArea searchDisplay;

	public UserRegistrationWindow() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("UserRegistrationWindow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 712, 453);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		usernameField = new JTextField();
		usernameField.setBounds(10, 54, 140, 20);
		panel.add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 112, 140, 20);
		panel.add(passwordField);
		passwordField.setColumns(10);

		nameField = new JTextField();
		nameField.setBounds(10, 166, 140, 20);
		panel.add(nameField);
		nameField.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 29, 84, 14);
		panel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 87, 95, 14);
		panel.add(lblPassword);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				User user = new User(usernameField.getText(), passwordField.getPassword(), nameField.getText());
				usernameField.setText("");
				passwordField.setText("");
				nameField.setText("");
				Userhandler.addUser(user);
			}
		});
		btnRegister.setBounds(10, 233, 91, 23);
		panel.add(btnRegister);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 143, 46, 14);
		panel.add(lblName);

		searchField = new JTextField();
		searchField.setBounds(350, 54, 140, 20);
		panel.add(searchField);
		searchField.setColumns(10);

		searchDisplay = new JTextArea();
		searchDisplay.setBounds(350, 94, 280, 184);
		panel.add(searchDisplay);
		searchDisplay.setColumns(10);
		searchDisplay.setEditable(false);

		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				User temp =	Userhandler.deserialize(searchField.getText());
				searchField.setText("");
				
				String tempUsername = temp.getUsername();
				char[] tempPasswordArr = temp.getPassword();
				String tempPassword = String.valueOf(tempPasswordArr);
				String tempName = temp.getName();
				
				searchDisplay.setText("Username: "+tempUsername+"\n Password: "+tempPassword.toString()+"\n Name: "+tempName);
				
			}
		});
		btnLoad.setBounds(350, 310, 91, 23);
		panel.add(btnLoad);

		JLabel lblSearchByUsername = new JLabel("Search by username");
		lblSearchByUsername.setBounds(350, 29, 140, 14);
		panel.add(lblSearchByUsername);

		frame.setBounds(100, 100, 720, 480);
	}
	
	public void setVisib(Boolean visible) {
		frame.setBounds(100, 100, 720, 480);
		frame.setVisible(visible);
	}
}
