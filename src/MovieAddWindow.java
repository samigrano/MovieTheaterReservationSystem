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
	private JTextField theaterNum;
	private JTextField roomNum;
	private JTextField month;
	private JTextField day;
	private JTextField hour;
	private JTextField min;

	public MovieAddWindow() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("MovieAddWindow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
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
		movieRunningTimeField.setBounds(10, 219, 140, 20);
		panel.add(movieRunningTimeField);
		movieRunningTimeField.setColumns(10);
		
		theaterNum = new JTextField();
		theaterNum.setBounds(10, 108, 140, 20);
		panel.add(theaterNum);
		theaterNum.setColumns(10);

		JLabel lbMovieName = new JLabel("Movie name");
		lbMovieName.setBounds(10, 29, 140, 14);
		panel.add(lbMovieName);

		JButton btnAddMovie = new JButton("Add");
		btnAddMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Movie movie = new Movie(movieNameField.getText(), 
						          Integer.parseInt(movieRunningTimeField.getText()), 
						          Integer.parseInt(theaterNum.getText()),
						          Integer.parseInt(roomNum.getText()),
						          Integer.parseInt(month.getText()), 
						          Integer.parseInt(day.getText()),
						          Integer.parseInt(hour.getText()), 
						          Integer.parseInt(min.getText()));
				movieNameField.setText("");
				movieRunningTimeField.setText("");
				theaterNum.setText("");
				roomNum.setText("");
				month.setText("");
				day.setText("");
				hour.setText("");
				min.setText("");
				
			}
		});
		btnAddMovie.setBounds(10, 419, 91, 23);
		panel.add(btnAddMovie);

		JLabel lbRunningTime = new JLabel("Running time (min)");
		lbRunningTime.setBounds(10, 194, 140, 14);
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
				int tempTheaterN = temp.getTheaterNum();
				int tempRoomN = temp.getRoomNum();
				int tempExiMon = temp.getExiMonth();
				int tempExiDay = temp.getExiDay();
				int tempExiHour = temp.getExiHour();
				int tempExiMin = temp.getExiMin();
				
				searchDisplay.setText("Movie name: "+tempMovieName+
						              "\nTheater: "+tempTheaterN+" Room: "+tempRoomN+
						              "\nRunning time: "+tempRunningTime+"min"+
						              "\nDate: "+tempExiMon+"."+tempExiDay+"."+ 
						              "\nTime: "+tempExiHour+":"+tempExiMin);
				
			}
		});
		btnLoad.setBounds(350, 310, 91, 23);
		panel.add(btnLoad);

		JLabel lblSearchByMovieName = new JLabel("Search by movie name");
		lblSearchByMovieName.setBounds(350, 29, 140, 14);
		panel.add(lblSearchByMovieName);
		
		roomNum = new JTextField();
		roomNum.setBounds(10, 163, 140, 20);
		panel.add(roomNum);
		roomNum.setColumns(10);
		
		JLabel lblTheaterNumber = new JLabel("Theater number");
		lblTheaterNumber.setBounds(10, 85, 140, 14);
		panel.add(lblTheaterNumber);
		
		JLabel lblRoomNumber = new JLabel("Room number");
		lblRoomNumber.setBounds(10, 139, 140, 14);
		panel.add(lblRoomNumber);
		
		JLabel lblExhibitionTime = new JLabel("Exhibition time");
		lblExhibitionTime.setBounds(10, 250, 140, 14);
		panel.add(lblExhibitionTime);
		
		month = new JTextField();
		month.setBounds(10, 296, 60, 20);
		panel.add(month);
		month.setColumns(10);
		
		day = new JTextField();
		day.setBounds(90, 296, 60, 20);
		panel.add(day);
		day.setColumns(10);
		
		JLabel lblMm = new JLabel("month");
		lblMm.setBounds(10, 275, 46, 14);
		panel.add(lblMm);
		
		JLabel lblDd = new JLabel("day");
		lblDd.setBounds(90, 275, 46, 14);
		panel.add(lblDd);
		
		hour = new JTextField();
		hour.setBounds(10, 339, 60, 20);
		panel.add(hour);
		hour.setColumns(10);
		
		min = new JTextField();
		min.setBounds(90, 339, 60, 20);
		panel.add(min);
		min.setColumns(10);
		
		JLabel lblHh = new JLabel("hour");
		lblHh.setBounds(10, 319, 46, 14);
		panel.add(lblHh);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setBounds(90, 319, 46, 14);
		panel.add(lblMin);

		frame.setBounds(100, 100, 720, 480);
	}
	
	public void setVisib(Boolean visib) {
		frame.setVisible(visib);
		frame.setBounds(100, 100, 720, 480);
	}
}
