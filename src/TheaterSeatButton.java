import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TheaterSeatButton extends JButton implements ActionListener {
	
	private String seatNum;
	
	

	public TheaterSeatButton(String seatNum) {
		this.seatNum = seatNum;
		this.setForeground(Color.BLACK);
		this.setForeground(Color.BLACK);
		this.setBackground(Color.GREEN);
		this.setFont(new Font("Arial", Font.PLAIN, 9));
		this.setText(seatNum);
		addActionListener(this);
	}
	
	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		WindowHandler.setReservationSeat(Integer.parseInt(seatNum));
	}
	
	
	
}
