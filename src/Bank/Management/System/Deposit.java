package Bank.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Deposit extends JFrame implements ActionListener {
	
	String pin;
	TextField textField;
	JButton b1, b2;
	
	Deposit(String pin){
		
		this.pin = pin;
			
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("ENTER AMOUT YOU WANT TO DEPOSITE");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 16));
		label1.setBounds(370, 130, 400, 30);
		l3.add(label1);
		
		textField = new TextField();
		textField.setBounds(380, 170, 270, 25);
		textField.setBackground(new Color(65, 125, 128));
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Raleway", Font.BOLD, 22));
		l3.add(textField);
		
		b1 = new JButton("Deposite");
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
		try {
			String amount = textField.getText();
			Date date = new Date();
			if (e.getSource() == b1) {
			if (textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Enter amount you wnat to deposite");
			} else {
				conn c = new conn();
				c.statement.executeUpdate("Insert into bank values('"+pin+"','"+date+"','deposite','"+amount+"')");
				JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully ");
				setVisible(false);
				new main_Class(pin);
				setVisible(false);
			}
			
			}else if (e.getSource()==b2){
				new main_Class(pin);
				setVisible(false);
			}
			
		}catch (Exception E) {
		E.printStackTrace();}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Deposit("");
	}

}
