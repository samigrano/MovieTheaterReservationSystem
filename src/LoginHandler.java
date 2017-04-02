import java.util.Arrays;

public class LoginHandler {
	
	
	public boolean checkPassword(char[] password, String userName) {
		
		User temp =	Userhandler.deserialize(userName);
		
		char[] tempPass = temp.getPassword();
		
		if (Arrays.equals(password, tempPass)) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
