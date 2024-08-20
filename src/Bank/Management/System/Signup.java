package Bank.Management.System;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
	
	JDateChooser datechooser;
	JRadioButton r1, r2, r3, r4, r5;
	JButton next;
	JTextField textname, textFname, textEmail, textadd, textcity, textPinCode, textState;
	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L) +1000L;
	String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM"); // Set title in constructor
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);	
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25, 10, 100, 100);
		add(image);
		
		JLabel label1 = new JLabel("APPLICATION FORM" +first);
		label1.setBounds(160, 20, 600, 40);
		label1.setFont(new Font("Raleway", Font.BOLD, 38));
		add(label1);
		
		JLabel label2 = new JLabel("Page 1");
		label2.setBounds(330, 70, 600, 30);
		label2.setFont(new Font("Raleway", Font.BOLD, 22));
		add(label2);
		
		JLabel label3 = new JLabel("Personal Details");
		label3.setBounds(290, 90, 600, 30);
		label3.setFont(new Font("Raleway", Font.BOLD,22));
		add(label3);
		
		JLabel labelname = new JLabel("Name : ");
		labelname.setBounds(100, 150, 100, 30);
		labelname.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelname);
		
		textname = new JTextField();
		textname.setBounds(300, 150, 400, 30);
		textname.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textname);
		
		JLabel labelfname = new JLabel("Father's Name : ");
		labelfname.setBounds(100, 200, 200, 30);
		labelfname.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelfname);
		
		textFname = new JTextField();
		textFname.setBounds(300, 200, 400, 30);
		textFname.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textFname);
		
		JLabel DOB = new JLabel("Date Of Birth : ");
		DOB.setBounds(100, 280, 180, 30);
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		add(DOB);
		
		datechooser = new JDateChooser();
		datechooser.setForeground(new Color(105, 105, 105));
		datechooser.setBounds(300, 280, 400, 30);
		add(datechooser);
		
		JLabel label4 = new JLabel("Gender : ");
		label4.setBounds(100, 240, 200, 30);
		label4.setFont(new Font("Raleway", Font.BOLD, 20));
		add(label4);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(450, 240, 60, 30);
		r1.setBackground(new Color(222, 255, 228));
		r1.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(300, 240, 90, 30);
		r2.setBackground(new Color(222, 255, 228));
		r2.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
		JLabel labelemail = new JLabel("Email address : ");
		labelemail.setBounds(100, 330, 200, 30);
		labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelemail);
		
		textEmail = new JTextField();
		textEmail.setBounds(300, 330, 400, 30);
		textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textEmail);
		
		JLabel labelms = new JLabel("Marital Status : ");
		labelms.setBounds(100, 380, 200, 30);
		labelms.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelms);
		
		r3 = new JRadioButton("Single");
		r3.setBounds(450, 380, 90, 30);
		r3.setBackground(new Color(222, 255, 228));
		r3.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r3);
		
		r4 = new JRadioButton("Married");
		r4.setBounds(300, 380, 90, 30);
		r4.setBackground(new Color(222, 255, 228));
		r4.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r4);
		
		r5 = new JRadioButton("Others");
		r5.setBounds(300, 380, 90, 30);
		r5.setBackground(new Color(222, 255, 228));
		r5.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r5);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(r3);
		buttonGroup2.add(r4);
		buttonGroup2.add(r5);
		
		JLabel labelAdd = new JLabel("Address : ");
		labelAdd.setBounds(100, 420, 200, 30);
		labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelAdd);
		
		textadd = new JTextField();
		textadd.setBounds(300, 420, 400, 30);
		textadd.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textadd);
		
		textcity = new JTextField();
		textcity.setBounds(300, 465, 400, 30);
		textcity.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textcity);
		
		JLabel labelCity = new JLabel("City : ");
		labelCity.setBounds(100, 465, 200, 30);
		labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelCity);
		
		textPinCode = new JTextField();
		textPinCode.setBounds(300, 505, 400, 30);
		textPinCode.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textPinCode);
		
		JLabel labelPin = new JLabel("Pin Code : ");
		labelPin.setBounds(100, 505, 200, 30);
		labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelPin);
		
		JLabel labelState = new JLabel("State : ");
		labelState.setBounds(100, 540, 200, 30);
		labelState.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelState);
		
		textState = new JTextField();
		textState.setBounds(300, 545, 400, 30);
		textState.setFont(new Font("Raleway", Font.BOLD, 14));
		add(textState);
		
		next = new JButton("Next");
		next.setFont(new Font("Arial", Font.BOLD, 14));
		next.setForeground(Color.WHITE);
		next.setBackground(Color.BLACK);
		next.setBounds(620, 580, 80, 30);
		next.addActionListener(this);
		add(next);
		
        getContentPane().setBackground(new Color(222, 255, 228)); // Set background color
        setLayout(null); // Consider using a layout manager
        //setUndecorated(true);
        setSize(750, 650);
        setLocation(360, 30);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    	String formno = first;
    	String name = textname.getText();
    	String fname = textFname.getText();
    	String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
    	String gender = null;
    	if(r1.isSelected()) {
    		gender = "Male";
    	}else if (r2.isSelected()) {
    		gender = "Female";
    	}
    	String email = textEmail.getText();
    	String marital = null;
    	if(r3.isSelected()) {
    		marital = "Married";
    	}else if (r4.isSelected()) {
    		marital = "Unmarried";
    	}else if (r5.isSelected()) {
    		gender = "Others";
    	}
    	
    	String address = textadd.getText();
    	
    	String city = textcity.getText();
    	
    	String pin_code = textPinCode.getText();
    	
    	String state = textState.getText();
    	
    	try {
    		if (textname.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "Fill all the fields");
    		} else {
    			conn con1 = new conn();
    			String q = "insert into Signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin_code+"', '"+state+"')";
    			con1.statement.executeUpdate(q);
    			new Signup2(first);
    			setVisible(false);
    		}
    		
    	}catch (Exception E) {
    		E.printStackTrace();
    	}
    	 
    	
    }

    public static void main(String[] args) {
        new Signup();
    }
}
