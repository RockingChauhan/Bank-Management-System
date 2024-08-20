package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener {
	
	JButton b1, b2, b3, b4, b5, b6, b7;
	String pin;
	
	FastCash(String pin) {
		this.pin = pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("Select Withdrawl Amount");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 20));
		label1.setBounds(375, 140, 400, 30);
		l3.add(label1);
		
		b1 = new JButton("Rs. 100");
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(65, 125, 128));
		b1.setBounds(350, 210, 120, 30);
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("Rs. 500");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(65, 125, 128));
		b2.setBounds(580, 210, 150, 30);
		b2.addActionListener(this);
		l3.add(b2);
		
		b3 = new JButton("Rs. 1000");
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(65, 125, 128));
		b3.setBounds(350, 248, 120, 30);
		b3.addActionListener(this);
		l3.add(b3);
		
		b4 = new JButton("Rs. 2000");
		b4.setForeground(Color.WHITE);
		b4.setBackground(new Color(65, 125, 128));
		b4.setBounds(580, 248, 150, 30);
		b4.addActionListener(this);
		l3.add(b4);
		
		b5 = new JButton("Rs. 5000");
		b5.setForeground(Color.WHITE);
		b5.setBackground(new Color(65, 125, 128));
		b5.setBounds(350, 285, 120, 30);
		b5.addActionListener(this);
		l3.add(b5);
		
		b6 = new JButton("Rs. 10000");
		b6.setForeground(Color.WHITE);
		b6.setBackground(new Color(65, 125, 128));
		b6.setBounds(580, 285, 150, 30);
		b6.addActionListener(this);
		l3.add(b6);
		
		b7 = new JButton("Back");
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
		
		if(e.getSource()==b7) {
			setVisible(false);
			new main_Class(pin);
		} else {
			String amount = ((JButton)e.getSource()).getText().substring(4);
			conn c = new conn();
			Date date = new Date();
			try {
				ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
				int balance = 0;
				while(resultset.next()) {
					if(resultset.getString("type").equals("deposite")) {
						balance += Integer.parseInt(resultset.getString("amount"));
					} else {
						balance -= Integer.parseInt(resultset.getString("amount"));
					}
				}String num = "17";
				
				if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
				JOptionPane.showMessageDialog(null, "Insufficient Balance");
				return;
				
				}
				
				c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
				JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debitted Sucessfully");
			} catch(Exception E) {
				E.printStackTrace();
			}
			
			setVisible(false);
			new main_Class(pin);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FastCash("");
	}

}
