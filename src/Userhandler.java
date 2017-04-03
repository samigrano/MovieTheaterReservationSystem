import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Userhandler {

	static ArrayList<User> users = new ArrayList<>();
	
	public static void serialize (User user) {

		try {
			String username = user.getUsername();
			FileOutputStream fileOut = new FileOutputStream(username+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(user);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/username.ser");
		}catch(IOException i) {
			i.printStackTrace();
		}
	}

	public static User deserialize(String username) {
		User temp = null;

		try {
			FileInputStream fileIn = new FileInputStream(username+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			temp = (User) in.readObject();
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
	
	public static void addUser(User user) {
		deSerializeUsersList();
		users.add(user);
		serializeUsersList();
	}
	
	public static void serializeUsersList() {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("allUsers"+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(users);
			out.close();
			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void deSerializeUsersList() {
		try {
			FileInputStream fileIn = new FileInputStream("allUsers"+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			users = (ArrayList<User>) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i) {
			System.out.println("The file is not yet created.");

		}catch(ClassNotFoundException c) {

			c.printStackTrace();

		}
	}
}
