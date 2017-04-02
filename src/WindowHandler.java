import javax.swing.JFrame;

public class WindowHandler extends JFrame {

	private static LoginWindow login = new LoginWindow();
	private static AdminMainWindow adminMain = new AdminMainWindow();
	private static UserRegistrationWindow userReg = new UserRegistrationWindow();
	
	public static void main (String[] args) {
		//login.init();
		//login.setVisib(true);
		adminMain.init();
		adminMain.setVisib(true);
		
	}
	
	public static void changeToAdminMain() {
		login.setVisib(false);
		adminMain.init();
		adminMain.setVisib(true);
	}
	
	public static void changeToUserReg() {
		login.setVisib(false);
		adminMain.setVisib(false);
		userReg.initialize();
		userReg.setVisib(true);
	}
	
	

}
