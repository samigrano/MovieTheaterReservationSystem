import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserMainWindow {

	private JFrame userFrame;

	/**
	 * Create the application.
	 */
	public UserMainWindow() {
		MovieHandler.deSerializeMovieList();
		System.out.println(MovieHandler.movies.size());
		//initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		
		userFrame = new JFrame();
		
		userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userFrame.getContentPane().setLayout(null);
		
		
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 0, 0, 0);
		userFrame.getContentPane().add(userPanel);
		userPanel.setLayout(null);
		
		JTextArea movie1TextArea = new JTextArea();
		movie1TextArea.setEditable(false);
		movie1TextArea.setBounds(10, 11, 200, 100);
		userFrame.getContentPane().add(movie1TextArea);
		
		try {
			//Adding movie name
			movie1TextArea.append(MovieHandler.movies.get(0).getMovieName());
			//Adding theater number
			movie1TextArea.append("\nTheater: "+MovieHandler.movies.get(0).getTheaterNum());
			//Adding room number
			movie1TextArea.append("\nRoom: "+MovieHandler.movies.get(0).getRoomNum());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JTextArea movie2TextArea = new JTextArea();
		movie2TextArea.setBounds(255, 11, 200, 100);
		userFrame.getContentPane().add(movie2TextArea);
		
		try {
			//Adding movie name
			movie2TextArea.append(MovieHandler.movies.get(1).getMovieName());
			//Adding theater number
			movie2TextArea.append("\nTheater: "+MovieHandler.movies.get(1).getTheaterNum());
			//Adding room number
			movie2TextArea.append("\nRoom: "+MovieHandler.movies.get(1).getRoomNum());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JTextArea movie3TextArea = new JTextArea();
		movie3TextArea.setBounds(502, 11, 200, 100);
		userFrame.getContentPane().add(movie3TextArea);
		
		try {
			//Adding movie name
			movie3TextArea.append(MovieHandler.movies.get(2).getMovieName());
			//Adding theater number
			movie3TextArea.append("\nTheater: "+MovieHandler.movies.get(2).getTheaterNum());
			//Adding room number
			movie3TextArea.append("\nRoom: "+MovieHandler.movies.get(2).getRoomNum());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		JButton movie1Button = new JButton("New button");
		movie1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WindowHandler.setRervationMovieName(MovieHandler.movies.get(0).getMovieName());
				WindowHandler.setReservationTheaterNum(MovieHandler.movies.get(0).getTheaterNum());
				WindowHandler.setReservationRoomNum(MovieHandler.movies.get(0).getRoomNum());
				
				if (MovieHandler.movies.get(0).getTheaterNum() == 1) {
					WindowHandler.changeToTheater1Room1();
				}
				
				
			
			}
		});
		movie1Button.setBounds(10, 122, 200, 23);
		userFrame.getContentPane().add(movie1Button);
		
		JButton movie2Button = new JButton("New button");
		movie2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WindowHandler.setRervationMovieName(MovieHandler.movies.get(1).getMovieName());
				WindowHandler.setReservationTheaterNum(MovieHandler.movies.get(1).getTheaterNum());
				WindowHandler.setReservationRoomNum(MovieHandler.movies.get(1).getRoomNum());
				
				if (MovieHandler.movies.get(0).getTheaterNum() == 1) {
					WindowHandler.changeToTheater1Room1();
				}
				
			}
		});
		movie2Button.setBounds(255, 122, 200, 23);
		userFrame.getContentPane().add(movie2Button);
		
		JButton movie3Button = new JButton("New button");
		movie3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindowHandler.setRervationMovieName(MovieHandler.movies.get(2).getMovieName());
				WindowHandler.setReservationTheaterNum(MovieHandler.movies.get(2).getTheaterNum());
				WindowHandler.setReservationRoomNum(MovieHandler.movies.get(2).getRoomNum());
				
				if (MovieHandler.movies.get(0).getTheaterNum() == 1) {
					WindowHandler.changeToTheater1Room1();
				}
				
			}
		});
		movie3Button.setBounds(502, 122, 200, 23);
		userFrame.getContentPane().add(movie3Button);
		
		userFrame.setVisible(true);
		userFrame.setBounds(100, 100, 720, 480);
	}
	
	
	
}
