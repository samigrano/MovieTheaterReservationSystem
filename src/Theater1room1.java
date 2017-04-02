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

public class Theater1room1 extends JFrame {

	private JPanel contentPane;
	private JButton seat41;
	private ArrayList<JButton> freeSeats = new ArrayList<>();
	private ArrayList<JButton> reservedSeats = new ArrayList<>();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Theater1room1() {
		setTitle("Theater1Room1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addSeats();

//////////////FREE SEATS/////////////////////////
		
		JLabel FreeSeats = new JLabel("Free seats");
		FreeSeats.setBounds(483, 42, 76, 14);
		contentPane.add(FreeSeats);
				
		textField = new JTextField(getFreeSeats(freeSeats));
		textField.setBounds(483, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

//////////////RESERVED SEATS//////////////////////
		
		JLabel ReservedSeats = new JLabel("Reserved seats");
		ReservedSeats.setBounds(483, 118, 76, 14);
		contentPane.add(ReservedSeats);
		
		textField_1 = new JTextField(getReservedSeats(reservedSeats));
		textField_1.setBounds(483, 141, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		

/////////////////////////////////////
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setBounds(480, 194, 89, 23);
		contentPane.add(btnConfirm);
		

	}
	
	public void setFreeSeats(){
		
	}
	
	public void setReservedSeats(){
		
	}
	
	public int getFreeSeats(ArrayList<JButton> list){
		int x = 0;
		for(int i=0; i<list.size(); i++){
			x++;
		}
		return x;
	}
	
	public int getReservedSeats(ArrayList<JButton> list){
		int x = 0;
		for(int i=0; i<list.size(); i++){
			x++;
		}
		return x;
	}
	
	public void addSeats(){
		JButton seat1 = new JButton("1");
		seat1.setForeground(Color.BLACK);
		seat1.setBackground(Color.BLACK);
		seat1.setFont(new Font("Arial", Font.PLAIN, 8));
		seat1.setBounds(10, 11, 40, 30);
		contentPane.add(seat1);
		JButton seat2 = new JButton("2");
		seat2.setForeground(Color.BLACK);
		seat2.setBackground(Color.BLACK);
		seat2.setFont(new Font("Arial", Font.PLAIN, 8));
		seat2.setBounds(50, 11, 40, 30);
		contentPane.add(seat2);
		JButton seat3 = new JButton("3");
		seat3.setForeground(Color.BLACK);
		seat3.setBackground(Color.BLACK);
		seat3.setFont(new Font("Arial", Font.PLAIN, 8));
		seat3.setBounds(90, 11, 40, 30);
		contentPane.add(seat3);
		JButton seat4 = new JButton("4");
		seat4.setForeground(Color.BLACK);
		seat4.setBackground(Color.BLACK);
		seat4.setFont(new Font("Arial", Font.PLAIN, 8));
		seat4.setBounds(130, 11, 40, 30);
		contentPane.add(seat4);
		JButton seat5 = new JButton("5");
		seat5.setForeground(Color.BLACK);
		seat5.setBackground(Color.BLACK);
		seat5.setFont(new Font("Arial", Font.PLAIN, 8));
		seat5.setBounds(170, 11, 40, 30);
		contentPane.add(seat5);
		JButton seat6 = new JButton("6");
		seat6.setForeground(Color.BLACK);
		seat6.setBackground(Color.BLACK);
		seat6.setFont(new Font("Arial", Font.PLAIN, 8));
		seat6.setBounds(210, 11, 40, 30);
		contentPane.add(seat6);
		JButton seat7 = new JButton("7");
		seat7.setForeground(Color.BLACK);
		seat7.setBackground(Color.BLACK);
		seat7.setFont(new Font("Arial", Font.PLAIN, 8));
		seat7.setBounds(250, 11, 40, 30);
		contentPane.add(seat7);
		JButton seat8 = new JButton("8");
		seat8.setForeground(Color.BLACK);
		seat8.setBackground(Color.BLACK);
		seat8.setFont(new Font("Arial", Font.PLAIN, 8));
		seat8.setBounds(290, 11, 40, 30);
		contentPane.add(seat8);
		JButton seat9 = new JButton("9");
		seat9.setForeground(Color.BLACK);
		seat9.setBackground(Color.BLACK);
		seat9.setFont(new Font("Arial", Font.PLAIN, 8));
		seat9.setBounds(330, 11, 40, 30);
		contentPane.add(seat9);
		JButton seat10 = new JButton("10");
		seat10.setForeground(Color.BLACK);
		seat10.setBackground(Color.BLACK);
		seat10.setFont(new Font("Arial", Font.PLAIN, 8));
		seat10.setBounds(370, 11, 40, 30);
		contentPane.add(seat10);
		
		JButton seat11 = new JButton("11");
		seat11.setForeground(Color.BLACK);
		seat11.setBackground(Color.BLACK);
		seat11.setFont(new Font("Arial", Font.PLAIN, 8));
		seat11.setBounds(10, 41, 40, 30);
		contentPane.add(seat11);
		JButton seat12 = new JButton("12");
		seat12.setForeground(Color.BLACK);
		seat12.setBackground(Color.BLACK);
		seat12.setFont(new Font("Arial", Font.PLAIN, 8));
		seat12.setBounds(50, 41, 40, 30);
		contentPane.add(seat12);		
		JButton seat13 = new JButton("13");
		seat13.setForeground(Color.BLACK);
		seat13.setBackground(Color.BLACK);
		seat13.setFont(new Font("Arial", Font.PLAIN, 8));
		seat13.setBounds(90, 41, 40, 30);
		contentPane.add(seat13);		
		JButton seat14 = new JButton("14");
		seat14.setForeground(Color.BLACK);
		seat14.setBackground(Color.BLACK);
		seat14.setFont(new Font("Arial", Font.PLAIN, 8));
		seat14.setBounds(130, 41, 40, 30);
		contentPane.add(seat14);		
		JButton seat15 = new JButton("15");
		seat15.setForeground(Color.BLACK);
		seat15.setBackground(Color.BLACK);
		seat15.setFont(new Font("Arial", Font.PLAIN, 8));
		seat15.setBounds(170, 41, 40, 30);
		contentPane.add(seat15);		
		JButton seat16 = new JButton("16");
		seat16.setForeground(Color.BLACK);
		seat16.setBackground(Color.BLACK);
		seat16.setFont(new Font("Arial", Font.PLAIN, 8));
		seat16.setBounds(210, 41, 40, 30);
		contentPane.add(seat16);		
		JButton seat17 = new JButton("17");
		seat17.setForeground(Color.BLACK);
		seat17.setBackground(Color.BLACK);
		seat17.setFont(new Font("Arial", Font.PLAIN, 8));
		seat17.setBounds(250, 41, 40, 30);
		contentPane.add(seat17);		
		JButton seat18 = new JButton("18");
		seat18.setForeground(Color.BLACK);
		seat18.setBackground(Color.BLACK);
		seat18.setFont(new Font("Arial", Font.PLAIN, 8));
		seat18.setBounds(290, 41, 40, 30);
		contentPane.add(seat18);		
		JButton seat19 = new JButton("19");
		seat19.setForeground(Color.BLACK);
		seat19.setBackground(Color.BLACK);
		seat19.setFont(new Font("Arial", Font.PLAIN, 8));
		seat19.setBounds(330, 41, 40, 30);
		contentPane.add(seat19);		
		JButton seat20 = new JButton("20");
		seat20.setForeground(Color.BLACK);
		seat20.setBackground(Color.BLACK);
		seat20.setFont(new Font("Arial", Font.PLAIN, 8));
		seat20.setBounds(370, 41, 40, 30);
		contentPane.add(seat20);
		
		JButton seat21 = new JButton("21");
		seat21.setForeground(Color.BLACK);
		seat21.setBackground(Color.BLACK);
		seat21.setFont(new Font("Arial", Font.PLAIN, 8));
		seat21.setBounds(10, 71, 40, 30);
		contentPane.add(seat21);		
		JButton seat22 = new JButton("22");
		seat22.setForeground(Color.BLACK);
		seat22.setBackground(Color.BLACK);
		seat22.setFont(new Font("Arial", Font.PLAIN, 8));
		seat22.setBounds(50, 71, 40, 30);
		contentPane.add(seat22);		
		JButton seat23 = new JButton("23");
		seat23.setForeground(Color.BLACK);
		seat23.setBackground(Color.BLACK);
		seat23.setFont(new Font("Arial", Font.PLAIN, 8));
		seat23.setBounds(90, 71, 40, 30);
		contentPane.add(seat23);		
		JButton seat24 = new JButton("24");
		seat24.setForeground(Color.BLACK);
		seat24.setBackground(Color.BLACK);
		seat24.setFont(new Font("Arial", Font.PLAIN, 8));
		seat24.setBounds(130, 71, 40, 30);
		contentPane.add(seat24);		
		JButton seat25 = new JButton("25");
		seat25.setForeground(Color.BLACK);
		seat25.setBackground(Color.BLACK);
		seat25.setFont(new Font("Arial", Font.PLAIN, 8));
		seat25.setBounds(170, 71, 40, 30);
		contentPane.add(seat25);		
		JButton seat26 = new JButton("26");
		seat26.setForeground(Color.BLACK);
		seat26.setBackground(Color.BLACK);
		seat26.setFont(new Font("Arial", Font.PLAIN, 8));
		seat26.setBounds(210, 71, 40, 30);
		contentPane.add(seat26);		
		JButton seat27 = new JButton("27");
		seat27.setForeground(Color.BLACK);
		seat27.setBackground(Color.BLACK);
		seat27.setFont(new Font("Arial", Font.PLAIN, 8));
		seat27.setBounds(250, 71, 40, 30);
		contentPane.add(seat27);		
		JButton seat28 = new JButton("28");
		seat28.setForeground(Color.BLACK);
		seat28.setBackground(Color.BLACK);
		seat28.setFont(new Font("Arial", Font.PLAIN, 8));
		seat28.setBounds(290, 71, 40, 30);
		contentPane.add(seat28);		
		JButton seat29 = new JButton("29");
		seat29.setForeground(Color.BLACK);
		seat29.setBackground(Color.BLACK);
		seat29.setFont(new Font("Arial", Font.PLAIN, 8));
		seat29.setBounds(330, 71, 40, 30);
		contentPane.add(seat29);		
		JButton seat30 = new JButton("30");
		seat30.setForeground(Color.BLACK);
		seat30.setBackground(Color.BLACK);
		seat30.setFont(new Font("Arial", Font.PLAIN, 8));
		seat30.setBounds(370, 71, 40, 30);
		contentPane.add(seat30);
		
		JButton seat31 = new JButton("31");
		seat31.setForeground(Color.BLACK);
		seat31.setBackground(Color.BLACK);
		seat31.setFont(new Font("Arial", Font.PLAIN, 8));
		seat31.setBounds(10, 101, 40, 30);
		contentPane.add(seat31);		
		JButton seat32 = new JButton("32");
		seat32.setForeground(Color.BLACK);
		seat32.setBackground(Color.BLACK);
		seat32.setFont(new Font("Arial", Font.PLAIN, 8));
		seat32.setBounds(50, 101, 40, 30);
		contentPane.add(seat32);		
		JButton seat33 = new JButton("33");
		seat33.setForeground(Color.BLACK);
		seat33.setBackground(Color.BLACK);
		seat33.setFont(new Font("Arial", Font.PLAIN, 8));
		seat33.setBounds(90, 101, 40, 30);
		contentPane.add(seat33);		
		JButton seat34 = new JButton("34");
		seat34.setForeground(Color.BLACK);
		seat34.setBackground(Color.BLACK);
		seat34.setFont(new Font("Arial", Font.PLAIN, 8));
		seat34.setBounds(130, 101, 40, 30);
		contentPane.add(seat34);		
		JButton seat35 = new JButton("35");
		seat35.setForeground(Color.BLACK);
		seat35.setBackground(Color.BLACK);
		seat35.setFont(new Font("Arial", Font.PLAIN, 8));
		seat35.setBounds(170, 101, 40, 30);
		contentPane.add(seat35);		
		JButton seat36 = new JButton("36");
		seat36.setForeground(Color.BLACK);
		seat36.setBackground(Color.BLACK);
		seat36.setFont(new Font("Arial", Font.PLAIN, 8));
		seat36.setBounds(210, 101, 40, 30);
		contentPane.add(seat36);		
		JButton seat37 = new JButton("37");
		seat37.setForeground(Color.BLACK);
		seat37.setBackground(Color.BLACK);
		seat37.setFont(new Font("Arial", Font.PLAIN, 8));
		seat37.setBounds(250, 101, 40, 30);
		contentPane.add(seat37);		
		JButton seat38 = new JButton("38");
		seat38.setForeground(Color.BLACK);
		seat38.setBackground(Color.BLACK);
		seat38.setFont(new Font("Arial", Font.PLAIN, 8));
		seat38.setBounds(290, 101, 40, 30);
		contentPane.add(seat38);		
		JButton seat39 = new JButton("39");
		seat39.setForeground(Color.BLACK);
		seat39.setBackground(Color.BLACK);
		seat39.setFont(new Font("Arial", Font.PLAIN, 8));
		seat39.setBounds(330, 101, 40, 30);
		contentPane.add(seat39);		
		JButton seat40 = new JButton("40");
		seat40.setForeground(Color.BLACK);
		seat40.setBackground(Color.BLACK);
		seat40.setFont(new Font("Arial", Font.PLAIN, 8));
		seat40.setBounds(370, 101, 40, 30);
		contentPane.add(seat40);
		
		JButton seat41 = new JButton("41");
		seat41.setForeground(Color.BLACK);
		seat41.setBackground(Color.BLACK);
		seat41.setFont(new Font("Arial", Font.PLAIN, 8));
		seat41.setBounds(10, 131, 40, 30);
		contentPane.add(seat41);		
		JButton seat42 = new JButton("42");
		seat42.setForeground(Color.BLACK);
		seat42.setBackground(Color.BLACK);
		seat42.setFont(new Font("Arial", Font.PLAIN, 8));
		seat42.setBounds(50, 131, 40, 30);
		contentPane.add(seat42);		
		JButton seat43 = new JButton("43");
		seat43.setForeground(Color.BLACK);
		seat43.setBackground(Color.BLACK);
		seat43.setFont(new Font("Arial", Font.PLAIN, 8));
		seat43.setBounds(90, 131, 40, 30);
		contentPane.add(seat43);		
		JButton seat44 = new JButton("44");
		seat44.setForeground(Color.BLACK);
		seat44.setBackground(Color.BLACK);
		seat44.setFont(new Font("Arial", Font.PLAIN, 8));
		seat44.setBounds(130, 131, 40, 30);
		contentPane.add(seat44);		
		JButton seat45 = new JButton("45");
		seat45.setForeground(Color.BLACK);
		seat45.setBackground(Color.BLACK);
		seat45.setFont(new Font("Arial", Font.PLAIN, 8));
		seat45.setBounds(170, 131, 40, 30);
		contentPane.add(seat45);		
		JButton seat46 = new JButton("46");
		seat46.setForeground(Color.BLACK);
		seat46.setBackground(Color.BLACK);
		seat46.setFont(new Font("Arial", Font.PLAIN, 8));
		seat46.setBounds(210, 131, 40, 30);
		contentPane.add(seat46);		
		JButton seat47 = new JButton("47");
		seat47.setForeground(Color.BLACK);
		seat47.setBackground(Color.BLACK);
		seat47.setFont(new Font("Arial", Font.PLAIN, 8));
		seat47.setBounds(250, 131, 40, 30);
		contentPane.add(seat47);		
		JButton seat48 = new JButton("48");
		seat48.setForeground(Color.BLACK);
		seat48.setBackground(Color.BLACK);
		seat48.setFont(new Font("Arial", Font.PLAIN, 8));
		seat48.setBounds(290, 131, 40, 30);
		contentPane.add(seat48);		
		JButton seat49 = new JButton("49");
		seat49.setForeground(Color.BLACK);
		seat49.setBackground(Color.BLACK);
		seat49.setFont(new Font("Arial", Font.PLAIN, 8));
		seat49.setBounds(330, 131, 40, 30);
		contentPane.add(seat49);		
		JButton seat50 = new JButton("50");
		seat50.setForeground(Color.BLACK);
		seat50.setBackground(Color.BLACK);
		seat50.setFont(new Font("Arial", Font.PLAIN, 8));
		seat50.setBounds(370, 131, 40, 30);
		contentPane.add(seat50);
		
		JButton seat51 = new JButton("51");
		seat51.setForeground(Color.BLACK);
		seat51.setBackground(Color.BLACK);
		seat51.setFont(new Font("Arial", Font.PLAIN, 8));
		seat51.setBounds(10, 161, 40, 30);
		contentPane.add(seat51);		
		JButton seat52 = new JButton("52");
		seat52.setForeground(Color.BLACK);
		seat52.setBackground(Color.BLACK);
		seat52.setFont(new Font("Arial", Font.PLAIN, 8));
		seat52.setBounds(50, 161, 40, 30);
		contentPane.add(seat52);		
		JButton seat53 = new JButton("53");
		seat53.setForeground(Color.BLACK);
		seat53.setBackground(Color.BLACK);
		seat53.setFont(new Font("Arial", Font.PLAIN, 8));
		seat53.setBounds(90, 161, 40, 30);
		contentPane.add(seat53);		
		JButton seat54 = new JButton("54");
		seat54.setForeground(Color.BLACK);
		seat54.setBackground(Color.BLACK);
		seat54.setFont(new Font("Arial", Font.PLAIN, 8));
		seat54.setBounds(130, 161, 40, 30);
		contentPane.add(seat54);		
		JButton seat55 = new JButton("55");
		seat55.setForeground(Color.BLACK);
		seat55.setBackground(Color.BLACK);
		seat55.setFont(new Font("Arial", Font.PLAIN, 8));
		seat55.setBounds(170, 161, 40, 30);
		contentPane.add(seat55);		
		JButton seat56 = new JButton("56");
		seat56.setForeground(Color.BLACK);
		seat56.setBackground(Color.BLACK);
		seat56.setFont(new Font("Arial", Font.PLAIN, 8));
		seat56.setBounds(210, 161, 40, 30);
		contentPane.add(seat56);		
		JButton seat57 = new JButton("57");
		seat57.setForeground(Color.BLACK);
		seat57.setBackground(Color.BLACK);
		seat57.setFont(new Font("Arial", Font.PLAIN, 8));
		seat57.setBounds(250, 161, 40, 30);
		contentPane.add(seat57);		
		JButton seat58 = new JButton("58");
		seat58.setForeground(Color.BLACK);
		seat58.setBackground(Color.BLACK);
		seat58.setFont(new Font("Arial", Font.PLAIN, 8));
		seat58.setBounds(290, 161, 40, 30);
		contentPane.add(seat58);		
		JButton seat59 = new JButton("59");
		seat59.setForeground(Color.BLACK);
		seat59.setBackground(Color.BLACK);
		seat59.setFont(new Font("Arial", Font.PLAIN, 8));
		seat59.setBounds(330, 161, 40, 30);
		contentPane.add(seat59);		
		JButton seat60 = new JButton("60");
		seat60.setForeground(Color.BLACK);
		seat60.setBackground(Color.BLACK);
		seat60.setFont(new Font("Arial", Font.PLAIN, 8));
		seat60.setBounds(370, 161, 40, 30);
		contentPane.add(seat60);
		
		JButton seat61 = new JButton("61");
		seat61.setForeground(Color.BLACK);
		seat61.setBackground(Color.BLACK);
		seat61.setFont(new Font("Arial", Font.PLAIN, 8));
		seat61.setBounds(10, 191, 40, 30);
		contentPane.add(seat61);		
		JButton seat62 = new JButton("62");
		seat62.setForeground(Color.BLACK);
		seat62.setBackground(Color.BLACK);
		seat62.setFont(new Font("Arial", Font.PLAIN, 8));
		seat62.setBounds(50, 191, 40, 30);
		contentPane.add(seat62);		
		JButton seat63 = new JButton("63");
		seat63.setForeground(Color.BLACK);
		seat63.setBackground(Color.BLACK);
		seat63.setFont(new Font("Arial", Font.PLAIN, 8));
		seat63.setBounds(90, 191, 40, 30);
		contentPane.add(seat63);		
		JButton seat64 = new JButton("64");
		seat64.setForeground(Color.BLACK);
		seat64.setBackground(Color.BLACK);
		seat64.setFont(new Font("Arial", Font.PLAIN, 8));
		seat64.setBounds(130, 191, 40, 30);
		contentPane.add(seat64);		
		JButton seat65 = new JButton("65");
		seat65.setForeground(Color.BLACK);
		seat65.setBackground(Color.BLACK);
		seat65.setFont(new Font("Arial", Font.PLAIN, 8));
		seat65.setBounds(170, 191, 40, 30);
		contentPane.add(seat65);		
		JButton seat66 = new JButton("66");
		seat66.setForeground(Color.BLACK);
		seat66.setBackground(Color.BLACK);
		seat66.setFont(new Font("Arial", Font.PLAIN, 8));
		seat66.setBounds(210, 191, 40, 30);
		contentPane.add(seat66);		
		JButton seat67 = new JButton("67");
		seat67.setForeground(Color.BLACK);
		seat67.setBackground(Color.BLACK);
		seat67.setFont(new Font("Arial", Font.PLAIN, 8));
		seat67.setBounds(250, 191, 40, 30);
		contentPane.add(seat67);		
		JButton seat68 = new JButton("68");
		seat68.setForeground(Color.BLACK);
		seat68.setBackground(Color.BLACK);
		seat68.setFont(new Font("Arial", Font.PLAIN, 8));
		seat68.setBounds(290, 191, 40, 30);
		contentPane.add(seat68);		
		JButton seat69 = new JButton("69");
		seat69.setForeground(Color.BLACK);
		seat69.setBackground(Color.BLACK);
		seat69.setFont(new Font("Arial", Font.PLAIN, 8));
		seat69.setBounds(330, 191, 40, 30);
		contentPane.add(seat69);		
		JButton seat70 = new JButton("70");
		seat70.setForeground(Color.BLACK);
		seat70.setBackground(Color.BLACK);
		seat70.setFont(new Font("Arial", Font.PLAIN, 8));
		seat70.setBounds(370, 191, 40, 30);
		contentPane.add(seat70);
		
		JButton seat71 = new JButton("71");
		seat71.setForeground(Color.BLACK);
		seat71.setBackground(Color.BLACK);
		seat71.setFont(new Font("Arial", Font.PLAIN, 8));
		seat71.setBounds(10, 221, 40, 30);
		contentPane.add(seat71);		
		JButton seat72 = new JButton("72");
		seat72.setForeground(Color.BLACK);
		seat72.setBackground(Color.BLACK);
		seat72.setFont(new Font("Arial", Font.PLAIN, 8));
		seat72.setBounds(50, 221, 40, 30);
		contentPane.add(seat72);		
		JButton seat73 = new JButton("73");
		seat73.setForeground(Color.BLACK);
		seat73.setBackground(Color.BLACK);
		seat73.setFont(new Font("Arial", Font.PLAIN, 8));
		seat73.setBounds(90, 221, 40, 30);
		contentPane.add(seat73);		
		JButton seat74 = new JButton("74");
		seat74.setForeground(Color.BLACK);
		seat74.setBackground(Color.BLACK);
		seat74.setFont(new Font("Arial", Font.PLAIN, 8));
		seat74.setBounds(130, 221, 40, 30);
		contentPane.add(seat74);		
		JButton seat75 = new JButton("75");
		seat75.setForeground(Color.BLACK);
		seat75.setBackground(Color.BLACK);
		seat75.setFont(new Font("Arial", Font.PLAIN, 8));
		seat75.setBounds(170, 221, 40, 30);
		contentPane.add(seat75);		
		JButton seat76 = new JButton("76");
		seat76.setForeground(Color.BLACK);
		seat76.setBackground(Color.BLACK);
		seat76.setFont(new Font("Arial", Font.PLAIN, 8));
		seat76.setBounds(210, 221, 40, 30);
		contentPane.add(seat76);	
		JButton seat77 = new JButton("77");
		seat77.setForeground(Color.BLACK);
		seat77.setBackground(Color.BLACK);
		seat77.setFont(new Font("Arial", Font.PLAIN, 8));
		seat77.setBounds(250, 221, 40, 30);
		contentPane.add(seat77);		
		JButton seat78 = new JButton("78");
		seat78.setForeground(Color.BLACK);
		seat78.setBackground(Color.BLACK);
		seat78.setFont(new Font("Arial", Font.PLAIN, 8));
		seat78.setBounds(290, 221, 40, 30);
		contentPane.add(seat78);		
		JButton seat79 = new JButton("79");
		seat79.setForeground(Color.BLACK);
		seat79.setBackground(Color.BLACK);
		seat79.setFont(new Font("Arial", Font.PLAIN, 8));
		seat79.setBounds(330, 221, 40, 30);
		contentPane.add(seat79);		
		JButton seat80 = new JButton("80");
		seat80.setForeground(Color.BLACK);
		seat80.setBackground(Color.BLACK);
		seat80.setFont(new Font("Arial", Font.PLAIN, 8));
		seat80.setBounds(370, 221, 40, 30);
		contentPane.add(seat80);
		
		JButton seat81 = new JButton("81");
		seat81.setForeground(Color.BLACK);
		seat81.setBackground(Color.BLACK);
		seat81.setFont(new Font("Arial", Font.PLAIN, 8));
		seat81.setBounds(10, 251, 40, 30);
		contentPane.add(seat81);		
		JButton seat82 = new JButton("82");
		seat82.setForeground(Color.BLACK);
		seat82.setBackground(Color.BLACK);
		seat82.setFont(new Font("Arial", Font.PLAIN, 8));
		seat82.setBounds(50, 251, 40, 30);
		contentPane.add(seat82);		
		JButton seat83 = new JButton("83");
		seat83.setForeground(Color.BLACK);
		seat83.setBackground(Color.BLACK);
		seat83.setFont(new Font("Arial", Font.PLAIN, 8));
		seat83.setBounds(90, 251, 40, 30);
		contentPane.add(seat83);		
		JButton seat84 = new JButton("84");
		seat84.setForeground(Color.BLACK);
		seat84.setBackground(Color.BLACK);
		seat84.setFont(new Font("Arial", Font.PLAIN, 8));
		seat84.setBounds(130, 251, 40, 30);
		contentPane.add(seat84);		
		JButton seat85 = new JButton("85");
		seat85.setForeground(Color.BLACK);
		seat85.setBackground(Color.BLACK);
		seat85.setFont(new Font("Arial", Font.PLAIN, 8));
		seat85.setBounds(170, 251, 40, 30);
		contentPane.add(seat85);		
		JButton seat86 = new JButton("86");
		seat86.setForeground(Color.BLACK);
		seat86.setBackground(Color.BLACK);
		seat86.setFont(new Font("Arial", Font.PLAIN, 8));
		seat86.setBounds(210, 251, 40, 30);
		contentPane.add(seat86);		
		JButton seat87 = new JButton("87");
		seat87.setForeground(Color.BLACK);
		seat87.setBackground(Color.BLACK);
		seat87.setFont(new Font("Arial", Font.PLAIN, 8));
		seat87.setBounds(250, 251, 40, 30);
		contentPane.add(seat87);		
		JButton seat88 = new JButton("88");
		seat88.setForeground(Color.BLACK);
		seat88.setBackground(Color.BLACK);
		seat88.setFont(new Font("Arial", Font.PLAIN, 8));
		seat88.setBounds(290, 251, 40, 30);
		contentPane.add(seat88);		
		JButton seat89 = new JButton("89");
		seat89.setForeground(Color.BLACK);
		seat89.setBackground(Color.BLACK);
		seat89.setFont(new Font("Arial", Font.PLAIN, 8));
		seat89.setBounds(330, 251, 40, 30);
		contentPane.add(seat89);		
		JButton seat90 = new JButton("90");
		seat90.setForeground(Color.BLACK);
		seat90.setBackground(Color.BLACK);
		seat90.setFont(new Font("Arial", Font.PLAIN, 8));
		seat90.setBounds(370, 251, 40, 30);
		contentPane.add(seat90);
		
		JButton seat91 = new JButton("91");
		seat91.setForeground(Color.BLACK);
		seat91.setBackground(Color.BLACK);
		seat91.setFont(new Font("Arial", Font.PLAIN, 8));
		seat91.setBounds(10, 281, 40, 30);
		contentPane.add(seat91);		
		JButton seat92 = new JButton("92");
		seat92.setForeground(Color.BLACK);
		seat92.setBackground(Color.BLACK);
		seat92.setFont(new Font("Arial", Font.PLAIN, 8));
		seat92.setBounds(50, 281, 40, 30);
		contentPane.add(seat92);		
		JButton seat93 = new JButton("93");
		seat93.setForeground(Color.BLACK);
		seat93.setBackground(Color.BLACK);
		seat93.setFont(new Font("Arial", Font.PLAIN, 8));
		seat93.setBounds(90, 281, 40, 30);
		contentPane.add(seat93);	
		JButton seat94 = new JButton("94");
		seat94.setForeground(Color.BLACK);
		seat94.setBackground(Color.BLACK);
		seat94.setFont(new Font("Arial", Font.PLAIN, 8));
		seat94.setBounds(130, 281, 40, 30);
		contentPane.add(seat94);		
		JButton seat95 = new JButton("95");
		seat95.setForeground(Color.BLACK);
		seat95.setBackground(Color.BLACK);
		seat95.setFont(new Font("Arial", Font.PLAIN, 8));
		seat95.setBounds(170, 281, 40, 30);
		contentPane.add(seat95);		
		JButton seat96 = new JButton("96");
		seat96.setForeground(Color.BLACK);
		seat96.setBackground(Color.BLACK);
		seat96.setFont(new Font("Arial", Font.PLAIN, 8));
		seat96.setBounds(210, 281, 40, 30);
		contentPane.add(seat96);		
		JButton seat97 = new JButton("97");
		seat97.setForeground(Color.BLACK);
		seat97.setBackground(Color.BLACK);
		seat97.setFont(new Font("Arial", Font.PLAIN, 8));
		seat97.setBounds(250, 281, 40, 30);
		contentPane.add(seat97);		
		JButton seat98 = new JButton("98");
		seat98.setForeground(Color.BLACK);
		seat98.setBackground(Color.BLACK);
		seat98.setFont(new Font("Arial", Font.PLAIN, 8));
		seat98.setBounds(290, 281, 40, 30);
		contentPane.add(seat98);		
		JButton seat99 = new JButton("99");
		seat99.setForeground(Color.BLACK);
		seat99.setBackground(Color.BLACK);
		seat99.setFont(new Font("Arial", Font.PLAIN, 8));
		seat99.setBounds(330, 281, 40, 30);
		contentPane.add(seat99);		
		JButton seat100 = new JButton("100");
		seat100.setForeground(Color.BLACK);
		seat100.setBackground(Color.BLACK);
		seat100.setFont(new Font("Arial", Font.PLAIN, 8));
		seat100.setBounds(370, 281, 40, 30);
		contentPane.add(seat100);
	}
}