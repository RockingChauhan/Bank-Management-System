package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquiry extends JFrame implements ActionListener{
	
	JLabel label2;
	JButton b1;
	String pin;
	
	BalanceEnquiry(String pin){
		this.pin=pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("Your Current Balance is Rs ");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 16));
		label1.setBounds(350, 130, 400, 30);
		l3.add(label1);
		
		label2 = new JLabel();
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD, 14));
		label2.setBounds(350, 170, 400, 30);
		l3.add(label2);
		
		b1 = new JButton("Back");
		b1.setBackground(new Color(65, 125, 128));
		b1.setBounds(610,  320, 110, 30);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		l3.add(b1);
		
		int balance = 0;
		try {
			conn c = new conn();
			ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
			while(resultSet.next()) {
				if( resultSet.getString("type").equals("deposite")) {
					balance += Integer.parseInt(resultSet.getString("amount"));
				} else {
					balance -= Integer.parseInt(resultSet.getString("amount"));
				}
			}
		}catch (Exception E) {
			E.printStackTrace();
			}
		
		label2.setText(""+balance);
		
		setLayout (null);
		setSize(1280, 690);
		setLocation(0, 0);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		new main_Class(pin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BalanceEnquiry("");
	}

}
