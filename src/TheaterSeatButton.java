import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class TheaterSeatButton extends JButton {
	
	private String seatNum;
	
	

	public TheaterSeatButton(String seatNum) {
		this.seatNum = seatNum;
		this.setForeground(Color.BLACK);
		this.setForeground(Color.BLACK);
		this.setBackground(Color.GREEN);
		this.setFont(new Font("Arial", Font.PLAIN, 9));
		this.setText(seatNum);
	}
	
	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	
}
