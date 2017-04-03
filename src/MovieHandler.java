import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MovieHandler {

	static ArrayList<Movie> movies = new ArrayList<>();


	public MovieHandler() {
		try {
			deSerializeMovieList();
		} catch (Exception e) {
			return;
		}
	}

	public static void serialize(Movie movie) {

		try {
			String movieName = movie.getMovieName();
			FileOutputStream fileOut = new FileOutputStream(movieName+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(movie);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/username.ser");
		}catch(IOException i) {
			i.printStackTrace();
		}
	}

	public static Movie deserialize(String moviename) {
		Movie temp = null;

		try {
			FileInputStream fileIn = new FileInputStream(moviename+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			temp = (Movie) in.readObject();
			in.close();
			fileIn.close();
			return temp;
		}catch(IOException i) {
			i.printStackTrace();

		}catch(ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();

		}


		return temp;

	}

	public static void addMovie(Movie movie) {
		movies.add(movie);
		serializeMovieList();
	}

	public static void serializeMovieList() {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("allMovies"+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(movies);
			out.close();
			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public static void deSerializeMovieList() {
		try {
			FileInputStream fileIn = new FileInputStream("allMovies"+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			movies = (ArrayList<Movie>) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i) {
			System.out.println("The file is not yet created.");

		}catch(ClassNotFoundException c) {

			c.printStackTrace();

		}
	}
}


