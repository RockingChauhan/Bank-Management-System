package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main_Class extends JFrame implements ActionListener {
	
	JButton b1, b2, b3, b4, b5, b6, b7;
	String pin;
	
	main_Class(String pin){
		
		this.pin = pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("Please Select Your Transaction");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 22));
		label1.setBounds(385, 130, 400, 30);
		l3.add(label1);
		
		b1 = new JButton("Deposite");
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(65, 125, 128));
		b1.setBounds(350, 210, 120, 30);
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("Cash Withrawal");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(65, 125, 128));
		b2.setBounds(580, 210, 150, 30);
		b2.addActionListener(this);
		l3.add(b2);
		
		b3 = new JButton("Fast Cash");
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(65, 125, 128));
		b3.setBounds(350, 248, 120, 30);
		b3.addActionListener(this);
		l3.add(b3);
		
		b4 = new JButton("Mini Statement");
		b4.setForeground(Color.WHITE);
		b4.setBackground(new Color(65, 125, 128));
		b4.setBounds(580, 248, 150, 30);
		b4.addActionListener(this);
		l3.add(b4);
		
		b5 = new JButton("Pin Change");
		b5.setForeground(Color.WHITE);
		b5.setBackground(new Color(65, 125, 128));
		b5.setBounds(350, 285, 120, 30);
		b5.addActionListener(this);
		l3.add(b5);
		
		b6 = new JButton("Balanace Enquiry");
		b6.setForeground(Color.WHITE);
		b6.setBackground(new Color(65, 125, 128));
		b6.setBounds(580, 285, 150, 30);
		b6.addActionListener(this);
		l3.add(b6);
		
		b7 = new JButton("Exit");
		b7.setForeground(Color.WHITE);
		b7.setBackground(new Color(65, 125, 128));
		b7.setBounds(350, 320, 120, 30);
		b7.addActionListener(this);
		l3.add(b7);
		
		setLayout (null);
		setSize(1280, 690);
		setLocation(0, 0);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			new Deposit(pin);
			setVisible(false);
		} else if(e.getSource()==b7) {
			System.exit(0);
		} else if (e.getSource()==b2) {
			new withdrawl(pin);
		} else if (e.getSource()==b6) {
			new BalanceEnquiry(pin);
			setVisible(false);
		} else if(e.getSource()==b3) {
			new FastCash(pin);
			setVisible(false);
		}else if (e.getSource()==b5) {
			new cpin(pin);
		}else if(e.getSource()==b4) {
			new mini(pin);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main_Class("");
	}

}
