import java.util.ArrayList;

public class Reservation implements java.io.Serializable {
	
	private int reservationId;
	private String sessionUserName;
	private String movieName;
	private int theaterNum;
	private int roomNum;
	static String moviedas;
	
	public ArrayList<Integer> seatNumbers = new ArrayList<>();

	public int getReservationId() {
		return reservationId;
	}

	public String getSessionUserName() {
		return sessionUserName;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getTheaterNum() {
		return theaterNum;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public void setSessionUserName(String userName) {
		this.sessionUserName = userName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
		this.moviedas = movieName;
	}

	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	
	
}
