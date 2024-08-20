package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class withdrawl extends JFrame implements ActionListener{
	
	String pin;
	TextField textField;
	JButton b1, b2;
	
	withdrawl(String pin){
		this.pin=pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("MAXIMUM WITHRAWAL LIMIT IS RS.10,000");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 16));
		label1.setBounds(370, 130, 400, 30);
		l3.add(label1);
		
		JLabel label2 = new JLabel("ENTER AMOUNT YOU WNAT TO WITHDRAW");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD, 14));
		label2.setBounds(370, 170, 400, 30);
		l3.add(label2);

		
		textField = new TextField();
		textField.setBounds(380, 210, 270, 25);
		textField.setBackground(new Color(65, 125, 128));
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Raleway", Font.BOLD, 22));
		l3.add(textField);
		
		b1 = new JButton("Withdraw");
		b1.setBackground(new Color(65, 125, 128));
		b1.setBounds(610,  285, 110, 30);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("Back");
		b2.setBackground(new Color(65, 125, 128));
		b2.setBounds(610,  320, 110, 30);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		l3.add(b2);
		
		setLayout (null);
		setSize(1280, 690);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		try {
			String amount = textField.getText();
			Date date = new Date();
			if (textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the Amonut you wish to withdraw");
			} else {
				conn c = new conn();
				ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
				int balance = 0;
				while(resultSet.next()) {
					if( resultSet.getString("type").equals("deposite")) {
						balance += Integer.parseInt(resultSet.getString("amount"));
					} else {
						balance -= Integer.parseInt(resultSet.getString("amount"));
					}
				}
				
				if (balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Account Balance");
					return;
				}
				
				c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
				JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
				setVisible(false);
				new main_Class(pin);
			}
			
		} catch (Exception E) {
			
		}
		} else if (e.getSource()==b2){
			setVisible(false);
			new main_Class(pin);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			new withdrawl("");
	}

}
