import java.util.Arrays;

public class LoginHandler {
	
	private static String loggedAs;
	
	public static String getLoggedAs() {
		return loggedAs;
	}

	public static void setLoggedAs(String das) {
		loggedAs = das;
	}

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
