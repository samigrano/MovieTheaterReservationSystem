
public class Movie implements java.io.Serializable {
	
	String movieName;
	int runningTime;
	int theaterNum;
	int roomNum;
	int exiMonth;
	int exiDay;
	int exiHour;
	int exiMin;
	
	public Movie(String movieName, int runningTime, int theaterNum, int roomNum, int exiMonth, int exiDay, int exiHour, int exiMin) {
		
		this.movieName = movieName;
		this.runningTime = runningTime;
		this.theaterNum = theaterNum;
		this.roomNum = roomNum;
		this.exiMonth = exiMonth;
		this.exiDay = exiDay;
		this.exiHour = exiHour;
		this.exiMin = exiMin;
		
		MovieHandler.serialize(this);
	}

	public String getMovieName() {
		return movieName;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public int getTheaterNum() {
		return theaterNum;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public int getExiMonth() {
		return exiMonth;
	}

	public int getExiDay() {
		return exiDay;
	}

	public int getExiHour() {
		return exiHour;
	}

	public int getExiMin() {
		return exiMin;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public void setExiMonth(int exiMonth) {
		this.exiMonth = exiMonth;
	}

	public void setExiDay(int exiDay) {
		this.exiDay = exiDay;
	}

	public void setExiHour(int exiHour) {
		this.exiHour = exiHour;
	}

	public void setExiMin(int exiMin) {
		this.exiMin = exiMin;
	}
	
	

	
	
}
