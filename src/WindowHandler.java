import javax.swing.JFrame;

public class WindowHandler extends JFrame {
	
	private static MovieAddWindow addMovie = new MovieAddWindow();
	private static LoginWindow login = new LoginWindow();
	private static AdminMainWindow adminMain = new AdminMainWindow();
	private static UserRegistrationWindow userReg = new UserRegistrationWindow();
	private static UserMainWindow userMain =  new UserMainWindow();
	private static Theater1room1 theater1r1 = new Theater1room1();
	
	
	public static void main (String[] args) {
		MovieHandler.serializeMovieList();
		MovieHandler.deSerializeMovieList();
		login.init();
		login.setVisib(true);
		//adminMain.init();
		//adminMain.setVisib(true);
		//addMovie.initialize();
		//addMovie.setVisib(true);
		//userMain.initialize();
		//addMovie.setVisib(true);
		
	}
	
	public static void changeToAdminMain() {
		login.setVisib(false);
		userReg.setVisib(false);
		adminMain.init();
		adminMain.setVisib(true);
		
	}
	
	public static void changeToUserReg() {
		login.setVisib(false);
		adminMain.setVisib(false);
		userReg.initialize();
		userReg.setVisib(true);
	}
	
	public static void changeToUserMainWindow() {
		login.setVisib(false);
		userReg.setVisib(false);
		adminMain.setVisib(false);
		userMain.initialize();
		
		//theater1r1.init();
		//theater1r1.setVisible(true);
	}
	
}
