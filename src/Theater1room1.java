import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.util.ArrayList;
import java.awt.event.InputMethodEvent;
import javax.swing.SwingConstants;

public class Theater1room1 extends JFrame {
		
	private JPanel contentPane;
	private JLabel freeSeats;
	private JLabel reservedSeats;
	private JButton confirm;
	private JButton remove;
	private static JTextField FS;
	private static JTextField RS;
	private int freeSeatNum;
	private int resSeatNum;
//	private JButton[] button = new JButton[100];//
	
	public Theater1room1() {
		init();
	}
//////////////////SETTERS///////////////
	
	public void setFreeSeats(int x){
		freeSeatNum = x;
	}

	public void setReservedSeats(int x){
		resSeatNum = x;
	}

//////////////////GETTERS///////////////

	public int getFreeSeats(){
		int x = freeSeatNum;
		return x;
	}

	public int getReservedSeats(){
		int x = resSeatNum;
		return x;
	}

/////////////////////////////////////

	public void changeSeatFreeToRes(){
		int x = getFreeSeats();
		int y = getReservedSeats();
		x--;
		y++;
		setFreeSeats(x);
		setReservedSeats(y);


	}
	
	public void init(){		
		setTitle("Theater1Room1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addLines();
		addSeats();
		setFreeSeats(100);
		setReservedSeats(0);

//////////////FREE SEATS/////////////////////////
		
		freeSeats = new JLabel("Free seats");
		freeSeats.setBounds(637, 60, 76, 14);
		contentPane.add(freeSeats);
		
		FS = new JTextField();
		FS.setBounds(637, 81, 46, 20);
		contentPane.add(FS);
		FS.setColumns(10);
		FS.setText(Integer.toString(getFreeSeats()));
		

//////////////RESERVED SEATS//////////////////////
		
		reservedSeats = new JLabel("Reserved seats");
		reservedSeats.setBounds(637, 136, 76, 14);
		contentPane.add(reservedSeats);
		
		RS = new JTextField();
		RS.setBounds(637, 159, 46, 20);
		contentPane.add(RS);
		RS.setColumns(10);
		RS.setText(Integer.toString(getReservedSeats()));
		

/////////////////////////////////////
		
		confirm = new JButton("CONFIRM");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// T‰h‰n tulee joku ilmotus varatuista seteist‰ ja ett‰ lasku tulee per‰st‰ :D
				System.exit(0);
			}
		});
		confirm.setBounds(624, 474, 89, 23);
		contentPane.add(confirm);	
		
		remove = new JButton("REMOVE");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//T‰h‰n tulee nappien alustus uudestaan... eli valintojen poisto	
			}
		});
		remove.setBounds(624, 410, 89, 23);
		contentPane.add(remove);

	}
	
////////////////////////////////////////////	
	
	public void addLines(){
		
		JLabel Line1 = new JLabel("1");
		Line1.setHorizontalAlignment(SwingConstants.CENTER);
		Line1.setBounds(10, 28, 46, 14);
		contentPane.add(Line1);
		
		JLabel Line2 = new JLabel("2");
		Line2.setHorizontalAlignment(SwingConstants.CENTER);
		Line2.setBounds(10, 78, 46, 14);
		contentPane.add(Line2);
		
		JLabel Line3 = new JLabel("3");
		Line3.setHorizontalAlignment(SwingConstants.CENTER);
		Line3.setBounds(10, 128, 46, 14);
		contentPane.add(Line3);
		
		JLabel Line4 = new JLabel("4");
		Line4.setHorizontalAlignment(SwingConstants.CENTER);
		Line4.setBounds(10, 178, 46, 14);
		contentPane.add(Line4);
		
		JLabel Line5 = new JLabel("5");
		Line5.setHorizontalAlignment(SwingConstants.CENTER);
		Line5.setBounds(10, 228, 46, 14);
		contentPane.add(Line5);
		
		JLabel Line6 = new JLabel("6");
		Line6.setHorizontalAlignment(SwingConstants.CENTER);
		Line6.setBounds(10, 278, 46, 14);
		contentPane.add(Line6);
		
		JLabel Line7 = new JLabel("7");
		Line7.setHorizontalAlignment(SwingConstants.CENTER);
		Line7.setBounds(10, 328, 46, 14);
		contentPane.add(Line7);
		
		JLabel Line8 = new JLabel("8");
		Line8.setHorizontalAlignment(SwingConstants.CENTER);
		Line8.setBounds(10, 378, 46, 14);
		contentPane.add(Line8);
		
		JLabel Line9 = new JLabel("9");
		Line9.setHorizontalAlignment(SwingConstants.CENTER);
		Line9.setBounds(10, 428, 46, 14);
		contentPane.add(Line9);
		
		JLabel Line10 = new JLabel("10");
		Line10.setHorizontalAlignment(SwingConstants.CENTER);
		Line10.setBounds(10, 478, 46, 14);
		contentPane.add(Line10);
	}
	

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((JButton)e.getSource()).setBackground(Color.RED);
			changeSeatFreeToRes();
			FS.setText(Integer.toString(getFreeSeats()));
			RS.setText(Integer.toString(getReservedSeats()));
			((JButton)e.getSource()).setEnabled(false);
			
			
		}
	}
	
	public void addSeats(){
		

///////////////////////////////T‰ll‰ saa kaikki napit toimimaan, mutta paikan m‰‰ritys ///////////////////////////		
/////////////////////////////// hiukan hukas n‰in 9tunnin koodauksen j‰lkeen :D        ///////////////////////////
//		int x = 50;
//		int y = 10;
//		int width = 50;
//		int heigth = 50;
//		
//		
//			for(int i=0; i<button.length; i++){
//				button[i] = new JButton("1");
//				button[i].setForeground(Color.BLACK);
//				button[i].setBackground(Color.GREEN);
//				button[i].setFont(new Font("Arial", Font.PLAIN, 9));
//				button[i].setBounds(x, y, width, heigth);
//				contentPane.add(button[i]);
//				button[i].addActionListener(new MyActionListener());
//		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		JButton seat1 = new JButton("1");
		seat1.setForeground(Color.BLACK);
		seat1.setBackground(Color.GREEN);
		seat1.setFont(new Font("Arial", Font.PLAIN, 9));
		seat1.setBounds(50, 10, 50, 50);
		contentPane.add(seat1);		
		seat1.addActionListener(new MyActionListener());
		
		JButton seat2 = new JButton("2");
		seat2.setForeground(Color.BLACK);
		seat2.setBackground(Color.GREEN);
		seat2.setFont(new Font("Arial", Font.PLAIN, 9));
		seat2.setBounds(100, 10, 50, 50);
		contentPane.add(seat2);
		seat2.addActionListener(new MyActionListener());
		
		JButton seat3 = new JButton("3");
		seat3.setForeground(Color.BLACK);
		seat3.setBackground(Color.GREEN);
		seat3.setFont(new Font("Arial", Font.PLAIN, 9));
		seat3.setBounds(150, 10, 50, 50);
		contentPane.add(seat3);
		seat3.addActionListener(new MyActionListener());
		
		JButton seat4 = new JButton("4");
		seat4.setForeground(Color.BLACK);
		seat4.setBackground(Color.GREEN);
		seat4.setFont(new Font("Arial", Font.PLAIN, 9));
		seat4.setBounds(200, 10, 50, 50);
		contentPane.add(seat4);
		seat4.addActionListener(new MyActionListener());
		
		JButton seat5 = new JButton("5");
		seat5.setForeground(Color.BLACK);
		seat5.setBackground(Color.GREEN);
		seat5.setFont(new Font("Arial", Font.PLAIN, 9));
		seat5.setBounds(250, 10, 50, 50);
		contentPane.add(seat5);
		seat5.addActionListener(new MyActionListener());
		
		JButton seat6 = new JButton("6");
		seat6.setForeground(Color.BLACK);
		seat6.setBackground(Color.GREEN);
		seat6.setFont(new Font("Arial", Font.PLAIN, 9));
		seat6.setBounds(300, 10, 50, 50);
		contentPane.add(seat6);
		seat6.addActionListener(new MyActionListener());
		
		JButton seat7 = new JButton("7");
		seat7.setForeground(Color.BLACK);
		seat7.setBackground(Color.GREEN);
		seat7.setFont(new Font("Arial", Font.PLAIN, 9));
		seat7.setBounds(350, 10, 50, 50);
		contentPane.add(seat7);
		seat7.addActionListener(new MyActionListener());
		
		JButton seat8 = new JButton("8");
		seat8.setForeground(Color.BLACK);
		seat8.setBackground(Color.GREEN);
		seat8.setFont(new Font("Arial", Font.PLAIN, 9));
		seat8.setBounds(400, 10, 50, 50);
		contentPane.add(seat8);
		seat8.addActionListener(new MyActionListener());
		
		JButton seat9 = new JButton("9");
		seat9.setForeground(Color.BLACK);
		seat9.setBackground(Color.GREEN);
		seat9.setFont(new Font("Arial", Font.PLAIN, 9));
		seat9.setBounds(450, 10, 50, 50);
		contentPane.add(seat9);
		seat9.addActionListener(new MyActionListener());
		
		JButton seat10 = new JButton("10");
		seat10.setForeground(Color.BLACK);
		seat10.setBackground(Color.GREEN);
		seat10.setFont(new Font("Arial", Font.PLAIN, 9));
		seat10.setBounds(500, 10, 50, 50);
		contentPane.add(seat10);
		seat10.addActionListener(new MyActionListener());
		
//////////////////// 11 - 20 ///////////////
		
		JButton seat11 = new JButton("11");
		seat11.setForeground(Color.BLACK);
		seat11.setBackground(Color.GREEN);
		seat11.setFont(new Font("Arial", Font.PLAIN, 9));
		seat11.setBounds(50, 60, 50, 50);
		contentPane.add(seat11);
		seat11.addActionListener(new MyActionListener());
		
		JButton seat12 = new JButton("12");
		seat12.setForeground(Color.BLACK);
		seat12.setBackground(Color.GREEN);
		seat12.setFont(new Font("Arial", Font.PLAIN, 9));
		seat12.setBounds(100, 60, 50, 50);
		contentPane.add(seat12);
		seat12.addActionListener(new MyActionListener());
		
		JButton seat13 = new JButton("13");
		seat13.setForeground(Color.BLACK);
		seat13.setBackground(Color.GREEN);
		seat13.setFont(new Font("Arial", Font.PLAIN, 9));
		seat13.setBounds(150, 60, 50, 50);
		contentPane.add(seat13);
		seat13.addActionListener(new MyActionListener());
		
		JButton seat14 = new JButton("14");
		seat14.setForeground(Color.BLACK);
		seat14.setBackground(Color.GREEN);
		seat14.setFont(new Font("Arial", Font.PLAIN, 9));
		seat14.setBounds(200, 60, 50, 50);
		contentPane.add(seat14);
		seat14.addActionListener(new MyActionListener());
		
		JButton seat15 = new JButton("15");
		seat15.setForeground(Color.BLACK);
		seat15.setBackground(Color.GREEN);
		seat15.setFont(new Font("Arial", Font.PLAIN, 9));
		seat15.setBounds(250, 60, 50, 50);
		contentPane.add(seat15);
		seat15.addActionListener(new MyActionListener());
		
		JButton seat16 = new JButton("16");
		seat16.setForeground(Color.BLACK);
		seat16.setBackground(Color.GREEN);
		seat16.setFont(new Font("Arial", Font.PLAIN, 9));
		seat16.setBounds(300, 60, 50, 50);
		contentPane.add(seat16);
		seat16.addActionListener(new MyActionListener());
		
		JButton seat17 = new JButton("17");
		seat17.setForeground(Color.BLACK);
		seat17.setBackground(Color.GREEN);
		seat17.setFont(new Font("Arial", Font.PLAIN, 9));
		seat17.setBounds(350, 60, 50, 50);
		contentPane.add(seat17);
		seat17.addActionListener(new MyActionListener());
		
		JButton seat18 = new JButton("18");
		seat18.setForeground(Color.BLACK);
		seat18.setBackground(Color.GREEN);
		seat18.setFont(new Font("Arial", Font.PLAIN, 9));
		seat18.setBounds(400, 60, 50, 50);
		contentPane.add(seat18);
		seat18.addActionListener(new MyActionListener());
		
		JButton seat19 = new JButton("19");
		seat19.setForeground(Color.BLACK);
		seat19.setBackground(Color.GREEN);
		seat19.setFont(new Font("Arial", Font.PLAIN, 9));
		seat19.setBounds(450, 60, 50, 50);
		contentPane.add(seat19);
		seat19.addActionListener(new MyActionListener());
		
		JButton seat20 = new JButton("20");
		seat20.setForeground(Color.BLACK);
		seat20.setBackground(Color.GREEN);
		seat20.setFont(new Font("Arial", Font.PLAIN, 9));
		seat20.setBounds(500, 60, 50, 50);
		contentPane.add(seat20);
		seat20.addActionListener(new MyActionListener());

////////////////////// 21 - 30 ////////////////		
		
		JButton seat21 = new JButton("21");
		seat21.setForeground(Color.BLACK);
		seat21.setBackground(Color.GREEN);
		seat21.setFont(new Font("Arial", Font.PLAIN, 9));
		seat21.setBounds(50, 110, 50, 50);
		contentPane.add(seat21);
		seat21.addActionListener(new MyActionListener());
		
		JButton seat22 = new JButton("22");
		seat22.setForeground(Color.BLACK);
		seat22.setBackground(Color.GREEN);
		seat22.setFont(new Font("Arial", Font.PLAIN, 9));
		seat22.setBounds(100, 110, 50, 50);
		contentPane.add(seat22);
		seat22.addActionListener(new MyActionListener());
		
		JButton seat23 = new JButton("23");
		seat23.setForeground(Color.BLACK);
		seat23.setBackground(Color.GREEN);
		seat23.setFont(new Font("Arial", Font.PLAIN, 9));
		seat23.setBounds(150, 110, 50, 50);
		contentPane.add(seat23);
		seat23.addActionListener(new MyActionListener());
		
		JButton seat24 = new JButton("24");
		seat24.setForeground(Color.BLACK);
		seat24.setBackground(Color.GREEN);
		seat24.setFont(new Font("Arial", Font.PLAIN, 9));
		seat24.setBounds(200, 110, 50, 50);
		contentPane.add(seat24);
		seat24.addActionListener(new MyActionListener());
		
		JButton seat25 = new JButton("25");
		seat25.setForeground(Color.BLACK);
		seat25.setBackground(Color.GREEN);
		seat25.setFont(new Font("Arial", Font.PLAIN, 9));
		seat25.setBounds(250, 110, 50, 50);
		contentPane.add(seat25);
		seat25.addActionListener(new MyActionListener());
		
		JButton seat26 = new JButton("26");
		seat26.setForeground(Color.BLACK);
		seat26.setBackground(Color.GREEN);
		seat26.setFont(new Font("Arial", Font.PLAIN, 9));
		seat26.setBounds(300, 110, 50, 50);
		contentPane.add(seat26);
		seat26.addActionListener(new MyActionListener());
		
		JButton seat27 = new JButton("27");
		seat27.setForeground(Color.BLACK);
		seat27.setBackground(Color.GREEN);
		seat27.setFont(new Font("Arial", Font.PLAIN, 9));
		seat27.setBounds(350, 110, 50, 50);
		contentPane.add(seat27);
		seat27.addActionListener(new MyActionListener());
		
		JButton seat28 = new JButton("28");
		seat28.setForeground(Color.BLACK);
		seat28.setBackground(Color.GREEN);
		seat28.setFont(new Font("Arial", Font.PLAIN, 9));
		seat28.setBounds(400, 110, 50, 50);
		contentPane.add(seat28);
		seat28.addActionListener(new MyActionListener());
		
		JButton seat29 = new JButton("29");
		seat29.setForeground(Color.BLACK);
		seat29.setBackground(Color.GREEN);
		seat29.setFont(new Font("Arial", Font.PLAIN, 9));
		seat29.setBounds(450, 110, 50, 50);
		contentPane.add(seat29);
		seat29.addActionListener(new MyActionListener());
		
		JButton seat30 = new JButton("30");
		seat30.setForeground(Color.BLACK);
		seat30.setBackground(Color.GREEN);
		seat30.setFont(new Font("Arial", Font.PLAIN, 9));
		seat30.setBounds(500, 110, 50, 50);
		contentPane.add(seat30);
		seat30.addActionListener(new MyActionListener());
		
////////////////////// 31 - 40 ////////////////////////////		
		
		JButton seat31 = new JButton("31");
		seat31.setForeground(Color.BLACK);
		seat31.setBackground(Color.GREEN);
		seat31.setFont(new Font("Arial", Font.PLAIN, 9));
		seat31.setBounds(50, 160, 50, 50);
		contentPane.add(seat31);
		seat31.addActionListener(new MyActionListener());
		
		JButton seat32 = new JButton("32");
		seat32.setForeground(Color.BLACK);
		seat32.setBackground(Color.GREEN);
		seat32.setFont(new Font("Arial", Font.PLAIN, 9));
		seat32.setBounds(100, 160, 50, 50);
		contentPane.add(seat32);
		seat32.addActionListener(new MyActionListener());
		
		JButton seat33 = new JButton("33");
		seat33.setForeground(Color.BLACK);
		seat33.setBackground(Color.GREEN);
		seat33.setFont(new Font("Arial", Font.PLAIN, 9));
		seat33.setBounds(150, 160, 50, 50);
		contentPane.add(seat33);
		seat33.addActionListener(new MyActionListener());
		
		JButton seat34 = new JButton("34");
		seat34.setForeground(Color.BLACK);
		seat34.setBackground(Color.GREEN);
		seat34.setFont(new Font("Arial", Font.PLAIN, 9));
		seat34.setBounds(200, 160, 50, 50);
		contentPane.add(seat34);
		seat34.addActionListener(new MyActionListener());
		
		JButton seat35 = new JButton("35");
		seat35.setForeground(Color.BLACK);
		seat35.setBackground(Color.GREEN);
		seat35.setFont(new Font("Arial", Font.PLAIN, 9));
		seat35.setBounds(250, 160, 50, 50);
		contentPane.add(seat35);
		seat35.addActionListener(new MyActionListener());
		
		JButton seat36 = new JButton("36");
		seat36.setForeground(Color.BLACK);
		seat36.setBackground(Color.GREEN);
		seat36.setFont(new Font("Arial", Font.PLAIN, 9));
		seat36.setBounds(300, 160, 50, 50);
		contentPane.add(seat36);
		seat36.addActionListener(new MyActionListener());
		
		JButton seat37 = new JButton("37");
		seat37.setForeground(Color.BLACK);
		seat37.setBackground(Color.GREEN);
		seat37.setFont(new Font("Arial", Font.PLAIN, 9));
		seat37.setBounds(350, 160, 50, 50);
		contentPane.add(seat37);
		seat37.addActionListener(new MyActionListener());
		
		JButton seat38 = new JButton("38");
		seat38.setForeground(Color.BLACK);
		seat38.setBackground(Color.GREEN);
		seat38.setFont(new Font("Arial", Font.PLAIN, 9));
		seat38.setBounds(400, 160, 50, 50);
		contentPane.add(seat38);
		seat38.addActionListener(new MyActionListener());
		
		JButton seat39 = new JButton("39");
		seat39.setForeground(Color.BLACK);
		seat39.setBackground(Color.GREEN);
		seat39.setFont(new Font("Arial", Font.PLAIN, 9));
		seat39.setBounds(450, 160, 50, 50);
		contentPane.add(seat39);
		seat39.addActionListener(new MyActionListener());
		
		JButton seat40 = new JButton("40");
		seat40.setForeground(Color.BLACK);
		seat40.setBackground(Color.GREEN);
		seat40.setFont(new Font("Arial", Font.PLAIN, 9));
		seat40.setBounds(500, 160, 50, 50);
		contentPane.add(seat40);
		seat40.addActionListener(new MyActionListener());
		
////////////////////// 41 - 50 //////////////////////		
		
		JButton seat41 = new JButton("41");
		seat41.setForeground(Color.BLACK);
		seat41.setBackground(Color.GREEN);
		seat41.setFont(new Font("Arial", Font.PLAIN, 9));
		seat41.setBounds(50, 210, 50, 50);
		contentPane.add(seat41);
		seat41.addActionListener(new MyActionListener());
		
		JButton seat42 = new JButton("42");
		seat42.setForeground(Color.BLACK);
		seat42.setBackground(Color.GREEN);
		seat42.setFont(new Font("Arial", Font.PLAIN, 9));
		seat42.setBounds(100, 210, 50, 50);
		contentPane.add(seat42);
		seat42.addActionListener(new MyActionListener());
		
		JButton seat43 = new JButton("43");
		seat43.setForeground(Color.BLACK);
		seat43.setBackground(Color.GREEN);
		seat43.setFont(new Font("Arial", Font.PLAIN, 9));
		seat43.setBounds(150, 210, 50, 50);
		contentPane.add(seat43);
		seat43.addActionListener(new MyActionListener());
		
		JButton seat44 = new JButton("44");
		seat44.setForeground(Color.BLACK);
		seat44.setBackground(Color.GREEN);
		seat44.setFont(new Font("Arial", Font.PLAIN, 9));
		seat44.setBounds(200, 210, 50, 50);
		contentPane.add(seat44);
		seat44.addActionListener(new MyActionListener());
		
		JButton seat45 = new JButton("45");
		seat45.setForeground(Color.BLACK);
		seat45.setBackground(Color.GREEN);
		seat45.setFont(new Font("Arial", Font.PLAIN, 9));
		seat45.setBounds(250, 210, 50, 50);
		contentPane.add(seat45);
		seat45.addActionListener(new MyActionListener());
		
		JButton seat46 = new JButton("46");
		seat46.setForeground(Color.BLACK);
		seat46.setBackground(Color.GREEN);
		seat46.setFont(new Font("Arial", Font.PLAIN, 9));
		seat46.setBounds(300, 210, 50, 50);
		contentPane.add(seat46);
		seat46.addActionListener(new MyActionListener());
		
		JButton seat47 = new JButton("47");
		seat47.setForeground(Color.BLACK);
		seat47.setBackground(Color.GREEN);
		seat47.setFont(new Font("Arial", Font.PLAIN, 9));
		seat47.setBounds(350, 210, 50, 50);
		contentPane.add(seat47);
		seat47.addActionListener(new MyActionListener());
		
		JButton seat48 = new JButton("48");
		seat48.setForeground(Color.BLACK);
		seat48.setBackground(Color.GREEN);
		seat48.setFont(new Font("Arial", Font.PLAIN, 9));
		seat48.setBounds(400, 210, 50, 50);
		contentPane.add(seat48);
		seat48.addActionListener(new MyActionListener());
		
		JButton seat49 = new JButton("49");
		seat49.setForeground(Color.BLACK);
		seat49.setBackground(Color.GREEN);
		seat49.setFont(new Font("Arial", Font.PLAIN, 9));
		seat49.setBounds(450, 210, 50, 50);
		contentPane.add(seat49);
		seat49.addActionListener(new MyActionListener());
		
		JButton seat50 = new JButton("50");
		seat50.setForeground(Color.BLACK);
		seat50.setBackground(Color.GREEN);
		seat50.setFont(new Font("Arial", Font.PLAIN, 9));
		seat50.setBounds(500, 210, 50, 50);
		contentPane.add(seat50);
		seat50.addActionListener(new MyActionListener());

////////////////////// 51 - 60 //////////////////////		
		
		JButton seat51 = new JButton("51");
		seat51.setForeground(Color.BLACK);
		seat51.setBackground(Color.GREEN);
		seat51.setFont(new Font("Arial", Font.PLAIN, 9));
		seat51.setBounds(50, 260, 50, 50);
		contentPane.add(seat51);
		seat51.addActionListener(new MyActionListener());
		
		JButton seat52 = new JButton("52");
		seat52.setForeground(Color.BLACK);
		seat52.setBackground(Color.GREEN);
		seat52.setFont(new Font("Arial", Font.PLAIN, 9));
		seat52.setBounds(100, 260, 50, 50);
		contentPane.add(seat52);
		seat52.addActionListener(new MyActionListener());
		
		JButton seat53 = new JButton("53");
		seat53.setForeground(Color.BLACK);
		seat53.setBackground(Color.GREEN);
		seat53.setFont(new Font("Arial", Font.PLAIN, 9));
		seat53.setBounds(150, 260, 50, 50);
		contentPane.add(seat53);
		seat53.addActionListener(new MyActionListener());
		
		JButton seat54 = new JButton("54");
		seat54.setForeground(Color.BLACK);
		seat54.setBackground(Color.GREEN);
		seat54.setFont(new Font("Arial", Font.PLAIN, 9));
		seat54.setBounds(200, 260, 50, 50);
		contentPane.add(seat54);
		seat54.addActionListener(new MyActionListener());
		
		JButton seat55 = new JButton("55");
		seat55.setForeground(Color.BLACK);
		seat55.setBackground(Color.GREEN);
		seat55.setFont(new Font("Arial", Font.PLAIN, 9));
		seat55.setBounds(250, 260, 50, 50);
		contentPane.add(seat55);
		seat55.addActionListener(new MyActionListener());
		
		JButton seat56 = new JButton("56");
		seat56.setForeground(Color.BLACK);
		seat56.setBackground(Color.GREEN);
		seat56.setFont(new Font("Arial", Font.PLAIN, 9));
		seat56.setBounds(300, 260, 50, 50);
		contentPane.add(seat56);
		seat56.addActionListener(new MyActionListener());
		
		JButton seat57 = new JButton("57");
		seat57.setForeground(Color.BLACK);
		seat57.setBackground(Color.GREEN);
		seat57.setFont(new Font("Arial", Font.PLAIN, 9));
		seat57.setBounds(350, 260, 50, 50);
		contentPane.add(seat57);
		seat57.addActionListener(new MyActionListener());
		
		JButton seat58 = new JButton("58");
		seat58.setForeground(Color.BLACK);
		seat58.setBackground(Color.GREEN);
		seat58.setFont(new Font("Arial", Font.PLAIN, 9));
		seat58.setBounds(400, 260, 50, 50);
		contentPane.add(seat58);
		seat58.addActionListener(new MyActionListener());
		
		JButton seat59 = new JButton("59");
		seat59.setForeground(Color.BLACK);
		seat59.setBackground(Color.GREEN);
		seat59.setFont(new Font("Arial", Font.PLAIN, 9));
		seat59.setBounds(450, 260, 50, 50);
		contentPane.add(seat59);
		seat59.addActionListener(new MyActionListener());
		
		JButton seat60 = new JButton("60");
		seat60.setForeground(Color.BLACK);
		seat60.setBackground(Color.GREEN);
		seat60.setFont(new Font("Arial", Font.PLAIN, 9));
		seat60.setBounds(500, 260, 50, 50);
		contentPane.add(seat60);
		seat60.addActionListener(new MyActionListener());

////////////////////// 61 - 70 //////////////////////		
		
		JButton seat61 = new JButton("61");
		seat61.setForeground(Color.BLACK);
		seat61.setBackground(Color.GREEN);
		seat61.setFont(new Font("Arial", Font.PLAIN, 9));
		seat61.setBounds(50, 310, 50, 50);
		contentPane.add(seat61);
		seat61.addActionListener(new MyActionListener());
		
		JButton seat62 = new JButton("62");
		seat62.setForeground(Color.BLACK);
		seat62.setBackground(Color.GREEN);
		seat62.setFont(new Font("Arial", Font.PLAIN, 9));
		seat62.setBounds(100, 310, 50, 50);
		contentPane.add(seat62);
		seat62.addActionListener(new MyActionListener());
		
		JButton seat63 = new JButton("63");
		seat63.setForeground(Color.BLACK);
		seat63.setBackground(Color.GREEN);
		seat63.setFont(new Font("Arial", Font.PLAIN, 9));
		seat63.setBounds(150, 310, 50, 50);
		contentPane.add(seat63);
		seat63.addActionListener(new MyActionListener());
		
		JButton seat64 = new JButton("64");
		seat64.setForeground(Color.BLACK);
		seat64.setBackground(Color.GREEN);
		seat64.setFont(new Font("Arial", Font.PLAIN, 9));
		seat64.setBounds(200, 310, 50, 50);
		contentPane.add(seat64);
		seat64.addActionListener(new MyActionListener());
		
		JButton seat65 = new JButton("65");
		seat65.setForeground(Color.BLACK);
		seat65.setBackground(Color.GREEN);
		seat65.setFont(new Font("Arial", Font.PLAIN, 9));
		seat65.setBounds(250, 310, 50, 50);
		contentPane.add(seat65);
		seat65.addActionListener(new MyActionListener());
		
		JButton seat66 = new JButton("66");
		seat66.setForeground(Color.BLACK);
		seat66.setBackground(Color.GREEN);
		seat66.setFont(new Font("Arial", Font.PLAIN, 9));
		seat66.setBounds(300, 310, 50, 50);
		contentPane.add(seat66);
		seat66.addActionListener(new MyActionListener());
		
		JButton seat67 = new JButton("67");
		seat67.setForeground(Color.BLACK);
		seat67.setBackground(Color.GREEN);
		seat67.setFont(new Font("Arial", Font.PLAIN, 9));
		seat67.setBounds(350, 310, 50, 50);
		contentPane.add(seat67);
		seat67.addActionListener(new MyActionListener());
		
		JButton seat68 = new JButton("68");
		seat68.setForeground(Color.BLACK);
		seat68.setBackground(Color.GREEN);
		seat68.setFont(new Font("Arial", Font.PLAIN, 9));
		seat68.setBounds(400, 310, 50, 50);
		contentPane.add(seat68);
		seat68.addActionListener(new MyActionListener());
		
		JButton seat69 = new JButton("69");
		seat69.setForeground(Color.BLACK);
		seat69.setBackground(Color.GREEN);
		seat69.setFont(new Font("Arial", Font.PLAIN, 9));
		seat69.setBounds(450, 310, 50, 50);
		contentPane.add(seat69);
		seat69.addActionListener(new MyActionListener());
		
		JButton seat70 = new JButton("70");
		seat70.setForeground(Color.BLACK);
		seat70.setBackground(Color.GREEN);
		seat70.setFont(new Font("Arial", Font.PLAIN, 9));
		seat70.setBounds(500, 310, 50, 50);
		contentPane.add(seat70);
		seat70.addActionListener(new MyActionListener());

////////////////////// 61 - 70 //////////////////////		
		
		JButton seat71 = new JButton("71");
		seat71.setForeground(Color.BLACK);
		seat71.setBackground(Color.GREEN);
		seat71.setFont(new Font("Arial", Font.PLAIN, 9));
		seat71.setBounds(50, 360, 50, 50);
		contentPane.add(seat71);
		seat71.addActionListener(new MyActionListener());
		
		JButton seat72 = new JButton("72");
		seat72.setForeground(Color.BLACK);
		seat72.setBackground(Color.GREEN);
		seat72.setFont(new Font("Arial", Font.PLAIN, 9));
		seat72.setBounds(100, 360, 50, 50);
		contentPane.add(seat72);
		seat72.addActionListener(new MyActionListener());
		
		JButton seat73 = new JButton("73");
		seat73.setForeground(Color.BLACK);
		seat73.setBackground(Color.GREEN);
		seat73.setFont(new Font("Arial", Font.PLAIN, 9));
		seat73.setBounds(150, 360, 50, 50);
		contentPane.add(seat73);
		seat73.addActionListener(new MyActionListener());
		
		JButton seat74 = new JButton("74");
		seat74.setForeground(Color.BLACK);
		seat74.setBackground(Color.GREEN);
		seat74.setFont(new Font("Arial", Font.PLAIN, 9));
		seat74.setBounds(200, 360, 50, 50);
		contentPane.add(seat74);
		seat74.addActionListener(new MyActionListener());
		
		JButton seat75 = new JButton("75");
		seat75.setForeground(Color.BLACK);
		seat75.setBackground(Color.GREEN);
		seat75.setFont(new Font("Arial", Font.PLAIN, 9));
		seat75.setBounds(250, 360, 50, 50);
		contentPane.add(seat75);
		seat75.addActionListener(new MyActionListener());
		
		JButton seat76 = new JButton("76");
		seat76.setForeground(Color.BLACK);
		seat76.setBackground(Color.GREEN);
		seat76.setFont(new Font("Arial", Font.PLAIN, 9));
		seat76.setBounds(300, 360, 50, 50);
		contentPane.add(seat76);
		seat76.addActionListener(new MyActionListener());
		
		JButton seat77 = new JButton("77");
		seat77.setForeground(Color.BLACK);
		seat77.setBackground(Color.GREEN);
		seat77.setFont(new Font("Arial", Font.PLAIN, 9));
		seat77.setBounds(350, 360, 50, 50);
		contentPane.add(seat77);
		seat77.addActionListener(new MyActionListener());
		
		JButton seat78 = new JButton("78");
		seat78.setForeground(Color.BLACK);
		seat78.setBackground(Color.GREEN);
		seat78.setFont(new Font("Arial", Font.PLAIN, 9));
		seat78.setBounds(400, 360, 50, 50);
		contentPane.add(seat78);
		seat78.addActionListener(new MyActionListener());
		
		JButton seat79 = new JButton("79");
		seat79.setForeground(Color.BLACK);
		seat79.setBackground(Color.GREEN);
		seat79.setFont(new Font("Arial", Font.PLAIN, 9));
		seat79.setBounds(450, 360, 50, 50);
		contentPane.add(seat79);
		seat79.addActionListener(new MyActionListener());
		
		JButton seat80 = new JButton("80");
		seat80.setForeground(Color.BLACK);
		seat80.setBackground(Color.GREEN);
		seat80.setFont(new Font("Arial", Font.PLAIN, 9));
		seat80.setBounds(500, 360, 50, 50);
		contentPane.add(seat80);
		seat80.addActionListener(new MyActionListener());

////////////////////// 81 - 90 //////////////////////		
		
		JButton seat81 = new JButton("81");
		seat81.setForeground(Color.BLACK);
		seat81.setBackground(Color.GREEN);
		seat81.setFont(new Font("Arial", Font.PLAIN, 9));
		seat81.setBounds(50, 410, 50, 50);
		contentPane.add(seat81);
		seat81.addActionListener(new MyActionListener());
		
		JButton seat82 = new JButton("82");
		seat82.setForeground(Color.BLACK);
		seat82.setBackground(Color.GREEN);
		seat82.setFont(new Font("Arial", Font.PLAIN, 9));
		seat82.setBounds(100, 410, 50, 50);
		contentPane.add(seat82);
		seat82.addActionListener(new MyActionListener());
		
		JButton seat83 = new JButton("83");
		seat83.setForeground(Color.BLACK);
		seat83.setBackground(Color.GREEN);
		seat83.setFont(new Font("Arial", Font.PLAIN, 9));
		seat83.setBounds(150, 410, 50, 50);
		contentPane.add(seat83);
		seat83.addActionListener(new MyActionListener());
		
		JButton seat84 = new JButton("84");
		seat84.setForeground(Color.BLACK);
		seat84.setBackground(Color.GREEN);
		seat84.setFont(new Font("Arial", Font.PLAIN, 9));
		seat84.setBounds(200, 410, 50, 50);
		contentPane.add(seat84);
		seat84.addActionListener(new MyActionListener());
		
		JButton seat85 = new JButton("85");
		seat85.setForeground(Color.BLACK);
		seat85.setBackground(Color.GREEN);
		seat85.setFont(new Font("Arial", Font.PLAIN, 9));
		seat85.setBounds(250, 410, 50, 50);
		contentPane.add(seat85);
		seat85.addActionListener(new MyActionListener());
		
		JButton seat86 = new JButton("86");
		seat86.setForeground(Color.BLACK);
		seat86.setBackground(Color.GREEN);
		seat86.setFont(new Font("Arial", Font.PLAIN, 9));
		seat86.setBounds(300, 410, 50, 50);
		contentPane.add(seat86);
		seat86.addActionListener(new MyActionListener());
		
		JButton seat87 = new JButton("87");
		seat87.setForeground(Color.BLACK);
		seat87.setBackground(Color.GREEN);
		seat87.setFont(new Font("Arial", Font.PLAIN, 9));
		seat87.setBounds(350, 410, 50, 50);
		contentPane.add(seat87);
		seat87.addActionListener(new MyActionListener());
		
		JButton seat88 = new JButton("88");
		seat88.setForeground(Color.BLACK);
		seat88.setBackground(Color.GREEN);
		seat88.setFont(new Font("Arial", Font.PLAIN, 9));
		seat88.setBounds(400, 410, 50, 50);
		contentPane.add(seat88);
		seat88.addActionListener(new MyActionListener());
		
		JButton seat89 = new JButton("89");
		seat89.setForeground(Color.BLACK);
		seat89.setBackground(Color.GREEN);
		seat89.setFont(new Font("Arial", Font.PLAIN, 9));
		seat89.setBounds(450, 410, 50, 50);
		contentPane.add(seat89);
		seat89.addActionListener(new MyActionListener());
		
		JButton seat90 = new JButton("90");
		seat90.setForeground(Color.BLACK);
		seat90.setBackground(Color.GREEN);
		seat90.setFont(new Font("Arial", Font.PLAIN, 9));
		seat90.setBounds(500, 410, 50, 50);
		contentPane.add(seat90);
		seat90.addActionListener(new MyActionListener());

////////////////////// 91 - 100 //////////////////////		
		
		JButton seat91 = new JButton("91");
		seat91.setForeground(Color.BLACK);
		seat91.setBackground(Color.GREEN);
		seat91.setFont(new Font("Arial", Font.PLAIN, 9));
		seat91.setBounds(50, 460, 50, 50);
		contentPane.add(seat91);
		seat91.addActionListener(new MyActionListener());
		
		JButton seat92 = new JButton("92");
		seat92.setForeground(Color.BLACK);
		seat92.setBackground(Color.GREEN);
		seat92.setFont(new Font("Arial", Font.PLAIN, 9));
		seat92.setBounds(100, 460, 50, 50);
		contentPane.add(seat92);
		seat92.addActionListener(new MyActionListener());
		
		JButton seat93 = new JButton("93");
		seat93.setForeground(Color.BLACK);
		seat93.setBackground(Color.GREEN);
		seat93.setFont(new Font("Arial", Font.PLAIN, 9));
		seat93.setBounds(150, 460, 50, 50);
		contentPane.add(seat93);
		seat93.addActionListener(new MyActionListener());
		
		JButton seat94 = new JButton("94");
		seat94.setForeground(Color.BLACK);
		seat94.setBackground(Color.GREEN);
		seat94.setFont(new Font("Arial", Font.PLAIN, 9));
		seat94.setBounds(200, 460, 50, 50);
		contentPane.add(seat94);
		seat94.addActionListener(new MyActionListener());
		
		JButton seat95 = new JButton("95");
		seat95.setForeground(Color.BLACK);
		seat95.setBackground(Color.GREEN);
		seat95.setFont(new Font("Arial", Font.PLAIN, 9));
		seat95.setBounds(250, 460, 50, 50);
		contentPane.add(seat95);
		seat95.addActionListener(new MyActionListener());
		
		JButton seat96 = new JButton("96");
		seat96.setForeground(Color.BLACK);
		seat96.setBackground(Color.GREEN);
		seat96.setFont(new Font("Arial", Font.PLAIN, 9));
		seat96.setBounds(300, 460, 50, 50);
		contentPane.add(seat96);
		seat96.addActionListener(new MyActionListener());
		
		JButton seat97 = new JButton("97");
		seat97.setForeground(Color.BLACK);
		seat97.setBackground(Color.GREEN);
		seat97.setFont(new Font("Arial", Font.PLAIN, 9));
		seat97.setBounds(350, 460, 50, 50);
		contentPane.add(seat97);
		seat97.addActionListener(new MyActionListener());
		
		JButton seat98 = new JButton("98");
		seat98.setForeground(Color.BLACK);
		seat98.setBackground(Color.GREEN);
		seat98.setFont(new Font("Arial", Font.PLAIN, 9));
		seat98.setBounds(400, 460, 50, 50);
		contentPane.add(seat98);
		seat98.addActionListener(new MyActionListener());
		
		JButton seat99 = new JButton("99");
		seat99.setForeground(Color.BLACK);
		seat99.setBackground(Color.GREEN);
		seat99.setFont(new Font("Arial", Font.PLAIN, 9));
		seat99.setBounds(450, 460, 50, 50);
		contentPane.add(seat99);		
		seat99.addActionListener(new MyActionListener());
		
		JButton seat100 = new JButton("100");
		seat100.setForeground(Color.BLACK);
		seat100.setBackground(Color.GREEN);
		seat100.setFont(new Font("Arial", Font.PLAIN, 9));
		seat100.setBounds(500, 460, 50, 50);
		contentPane.add(seat100);
		seat100.addActionListener(new MyActionListener());
	}
}
