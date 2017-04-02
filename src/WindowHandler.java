import javax.swing.JFrame;

public class WindowHandler extends JFrame {

	private static LoginWindow login = new LoginWindow();
	private static AdminMainWindow adminMain = new AdminMainWindow();
	
	public static void main (String[] args) {
		login.init();
		login.setVisib(true);
		
		
	}
	
	public static void changeToAdminMain() {
		login.setVisib(false);
		adminMain.init();
		adminMain.setVisib(true);
	}
	
	

}
