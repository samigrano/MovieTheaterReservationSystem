
public class User implements java.io.Serializable {
	
	String username;
	char[] password;
	String name;
	
	public User (String username, char[] password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
		Userhandler.serialize(this);
	}
	
	
	

	public String getUsername() {
		return username;
	}

	public char[] getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

}
