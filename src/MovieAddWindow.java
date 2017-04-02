import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MovieAddWindow {

	private JFrame frame;
	private JTextField movieNameField;
	private JTextField movieRunningTimeField;
	private JTextField searchField;
	private JTextArea searchDisplay;

	public MovieAddWindow() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("MovieAddWindow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 712, 453);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		movieNameField = new JTextField();
		movieNameField.setBounds(10, 54, 140, 20);
		panel.add(movieNameField);
		movieNameField.setColumns(10);

		movieRunningTimeField = new JTextField();
		movieRunningTimeField.setBounds(10, 110, 140, 20);
		panel.add(movieRunningTimeField);
		movieRunningTimeField.setColumns(10);

		JLabel lbMovieName = new JLabel("Movie name");
		lbMovieName.setBounds(10, 29, 140, 14);
		panel.add(lbMovieName);

		JButton btnAddMovie = new JButton("Add");
		btnAddMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Movie movie = new Movie(movieNameField.getText(), Integer.parseInt(movieRunningTimeField.getText()));
				movieNameField.setText("");
				movieRunningTimeField.setText("");
			}
		});
		btnAddMovie.setBounds(10, 152, 91, 23);
		panel.add(btnAddMovie);

		JLabel lbRunningTime = new JLabel("Running time (min)");
		lbRunningTime.setBounds(10, 85, 140, 14);
		panel.add(lbRunningTime);

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

				Movie temp =	MovieHandler.deserialize(searchField.getText());
				searchField.setText("");
				
				String tempMovieName = temp.getMovieName();
				int tempRunningTime = temp.getRunningTime();
				
				searchDisplay.setText("Movie name: "+tempMovieName+"\nRunning time: "+tempRunningTime+"min");
				
			}
		});
		btnLoad.setBounds(350, 310, 91, 23);
		panel.add(btnLoad);

		JLabel lblSearchByMovieName = new JLabel("Search by movie name");
		lblSearchByMovieName.setBounds(350, 29, 140, 14);
		panel.add(lblSearchByMovieName);

		frame.setBounds(100, 100, 720, 480);
	}
}
