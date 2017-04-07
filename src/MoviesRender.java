import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class MoviesRender {

	private JFrame frame;


	public MoviesRender() {
		//initialize();
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));


		MovieHandler.deSerializeMovieList();


		System.out.println(MovieHandler.movies.size());
		for (int i = 0; i < MovieHandler.movies.size(); i++) {
			String movieName = MovieHandler.movies.get(i).getMovieName();
			JButton btnNewButton = new JButton(movieName);
			panel.add(btnNewButton);
		}


		frame.setBounds(100, 100, 720, 480);


	}
}
