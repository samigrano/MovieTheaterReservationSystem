import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReservationHandler {
	
	public static ArrayList<Reservation> reservations = new ArrayList<>();
	
	public ReservationHandler() {
		deSerializeReservationsList();
	}
	
	public static void serializeReservationList() {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("allReservations"+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(reservations);
			out.close();
			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void deSerializeReservationsList() {
		try {
			FileInputStream fileIn = new FileInputStream("allReservations"+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			reservations = (ArrayList<Reservation>) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i) {
			System.out.println("The file is not yet created.");

		}catch(ClassNotFoundException c) {

			c.printStackTrace();

		}
	}
	
	
	
	
}
