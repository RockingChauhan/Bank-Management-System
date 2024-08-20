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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class cpin extends JFrame implements ActionListener{
	
	String pin;
	JButton b1, b2;
	JPasswordField p1,p2;	
	cpin(String pin){
		
		this.pin = pin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);
		
		JLabel label1 = new JLabel("CHANGE YOUR PIN");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD, 16));
		label1.setBounds(370, 130, 400, 30);
		l3.add(label1);
		
		JLabel label2 = new JLabel("NEW PIN");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD, 14));
		label2.setBounds(370, 180, 400, 30);
		l3.add(label2);
		
		p1 = new JPasswordField();
		p1.setBounds(510, 180, 200, 25);
		p1.setBackground(new Color(65, 125, 128));
		p1.setForeground(Color.WHITE);
		p1.setFont(new Font("Raleway", Font.BOLD, 16));
		l3.add(p1);
		
		JLabel label3 = new JLabel("RE-ENTER NEW PIN");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("System",Font.BOLD, 14));
		label3.setBounds(370, 215, 400, 30);
		l3.add(label3);
		
		p2 = new JPasswordField();
		p2.setBounds(510, 220, 200, 25);
		p2.setBackground(new Color(65, 125, 128));
		p2.setForeground(Color.WHITE);
		p2.setFont(new Font("Raleway", Font.BOLD, 22));
		l3.add(p2);
		
		b1 = new JButton("Change");
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
		
		try{
			
			String pin1 = p1.getText();
			String pin2 = p2.getText();
			
			if(!pin1.equals(pin2)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
				return;
			}
			
			if(e.getSource()==b1) {
			if (p1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Enter New PIN");
				return;
			}
			
			if (p2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
				return;
			}
			conn c = new conn();
			String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
			String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
			String q3 = "update Signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";
			
			c.statement.executeUpdate(q1);
			c.statement.executeUpdate(q2);
			c.statement.executeUpdate(q3);
			
			JOptionPane.showMessageDialog(null, "PIN changed successfully");
			setVisible(false);
			new main_Class(pin);
			
			}else if (e.getSource()==b2) {
				new main_Class(pin);
				setVisible(false);
			}
			
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new cpin("");
		
	}

}
