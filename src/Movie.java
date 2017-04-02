
public class Movie implements java.io.Serializable {
	
	String movieName;
	int runningTime;
	
	
	public Movie (String movieName, int runningTime) {
		this.movieName = movieName;
		this.runningTime = runningTime;
		
		MovieHandler.serialize(this);
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

}
