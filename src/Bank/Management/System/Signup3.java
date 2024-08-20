package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Signup3 extends JFrame implements ActionListener {
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JButton s,c;
	
	String formno;

	Signup3(String formno){
		
		this.formno = formno;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);	
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25, 10, 100, 100);
		add(image);
		
		JLabel l1 = new JLabel("Page 3 ");
		l1.setBounds(200, 40, 400, 40);
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		add(l1);
		
		JLabel l2 = new JLabel("Account Details");
		l2.setBounds(200, 70, 400, 40);
		l2.setFont(new Font("Raleway", Font.BOLD, 22));
		add(l2);
		
		JLabel l3 = new JLabel("Account Type");
		l3.setBounds(100, 120, 200, 30);
		l3.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l3);
		
		r1 = new JRadioButton("Savings Account");
		r1.setBounds(100, 150, 200, 30);
		r1.setBackground(new Color(215, 252, 252));
		r1.setFont(new Font("Raleway", Font.BOLD, 16));
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposite");
		r2.setBounds(350, 150, 200, 30);
		r2.setBackground(new Color(215, 252, 252));
		r2.setFont(new Font("Raleway", Font.BOLD, 16));
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setBounds(100, 190, 200, 30);
		r3.setBackground(new Color(215, 252, 252));
		r3.setFont(new Font("Raleway", Font.BOLD, 16));
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposite Account");
		r4.setBounds(350, 190, 250, 30);
		r4.setBackground(new Color(215, 252, 252));
		r4.setFont(new Font("Raleway", Font.BOLD, 16));
		add(r4);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		buttonGroup.add(r3);
		buttonGroup.add(r4);
		
		JLabel l4 = new JLabel("Card Number");
		l4.setBounds(100, 230, 200, 30);
		l4.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l4);
		
		JLabel l5 = new JLabel("(Your 16 - digit card number)");
		l5.setBounds(100, 270, 500, 20);
		l5.setFont(new Font("Raleway", Font.BOLD, 12));
		add(l5);
		
		JLabel l6 = new JLabel("XXXX-XXXX-XXXX-2589");
		l6.setBounds(330, 230, 300, 30);
		l6.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l6);
		
		JLabel l7= new JLabel("(It would appear on atm card/cheque book and statement)");
		l7.setBounds(330, 270, 500, 20);
		l7.setFont(new Font("Raleway", Font.BOLD, 12));
		add(l7);
		
		JLabel l8 = new JLabel("PIN : ");
		l8.setBounds(100, 300, 200, 30);
		l8.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l8);
		
		JLabel l9 = new JLabel("XXXX");
		l9.setBounds(330, 300, 200, 30);
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l9);
		
		JLabel l10 = new JLabel("(4 - digit password)");
		l10.setBounds(100, 330, 500, 20);
		l10.setFont(new Font("Raleway", Font.BOLD, 12));
		add(l10);
		
		JLabel l11 = new JLabel("Services Required");
		l11.setBounds(100, 370, 200, 30);
		l11.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l11);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(new Color(215, 252, 252));
		c1.setBounds(100, 400, 200, 30);
		c1.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(new Color(215, 252, 252));
		c2.setBounds(350, 400, 200, 30);
		c2.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(new Color(215, 252, 252));
		c3.setBounds(100, 440, 200, 30);
		c3.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c3);
		
		c4 = new JCheckBox("Email Alert");
		c4.setBackground(new Color(215, 252, 252));
		c4.setBounds(350, 440, 200, 30);
		c4.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(new Color(215, 252, 252));
		c5.setBounds(100, 480, 200, 30);
		c5.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c5);
		
		c6 = new JCheckBox("E - Statement");
		c6.setBackground(new Color(215, 252, 252));
		c6.setBounds(350, 480, 200, 30);
		c6.setFont(new Font("Raleway", Font.BOLD, 16));
		add(c6);
		
		JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details correct to the best of my knowledge", true);
		c7.setBackground(new Color(215, 252, 252));
		c7.setBounds(100, 530, 600, 20);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		add(c7);
		
		JLabel l12 = new JLabel("Form No : ");
		l12.setBounds(550, 10, 120, 30);
		l12.setFont(new Font("Raleway", Font.BOLD, 14));
		add(l12);
		
		JLabel l13 = new JLabel(formno);
		l13.setBounds(650, 10, 120, 30);
		l13.setFont(new Font("Raleway", Font.BOLD, 14));
		add(l13);
		
		s = new JButton("Submit");
		s.setBounds(250, 560, 100, 20);
		s.setBackground(Color.BLACK);
		s.setForeground(Color.WHITE);
		s.setFont(new Font("Raleway", Font.BOLD, 12));
		s.addActionListener(this);
		add(s);
		
		c = new JButton("Cancel");
		c.setBounds(420, 560, 100, 20);
		c.setBackground(Color.BLACK);
		c.setForeground(Color.WHITE);
		c.setFont(new Font("Raleway", Font.BOLD, 12));
		c.addActionListener(this);
		add(c);
		
		setLayout(null);
		setSize(750, 660);
		setLocation(360, 30);
		getContentPane().setBackground(new Color(215, 252, 252));
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String  atype = null;
		if (r1.isSelected()) {
			atype = "Savings Account";
		} else if (r2.isSelected()) {
			atype = "Fixed Deposite";
		} else if (r3.isSelected()) {
			atype = "Current Account";
		} else if (r4.isSelected()) {
			atype = "Recurring Deposite Account";
		}
		
	Random ran = new Random();
	long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
	String cardno = "" + Math.abs(first7);
	
	long first3 = (ran.nextLong() % 9000L) + 1000L;
	String pin = "" + Math.abs(first3);
	
	String fac = "";
	if(c1.isSelected()) {
		fac = fac+"ATM CARD";
	} else if (c2.isSelected()) {
		fac = fac+"Internet Banking";
	} else if (c3.isSelected()) {
		fac = fac+"Mobile Banking";
	} else if (c4.isSelected()) {
		fac = fac+"Email Alert";
	} else if (c5.isSelected()) {
		fac = fac+"Cheque Book";
	} else if (c6.isSelected()) {
		fac = fac+"E - Statement";
	}
	
	try {
		if (e.getSource()==s) {
			if (atype.equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			} else {
				conn c1 = new conn();
				String q1 = "insert into Signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
				String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
				c1.statement.executeUpdate(q1);
				c1.statement.executeUpdate(q2);
			JOptionPane.showMessageDialog(null, "Card Number : "+cardno+ " \n Pin : "+pin);
			new Deposit(pin);
			setVisible(false);
			}
		}else if (e.getSource()==c) {
			System.exit(0);
		}
		
	} catch(Exception E) {
		E.printStackTrace();
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup3("");
	}

}
