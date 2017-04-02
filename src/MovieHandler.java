import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MovieHandler {

	public static void serialize (Movie movie) {

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
}
