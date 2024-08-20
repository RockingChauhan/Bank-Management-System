package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener{
	
	JComboBox combobox, combobox2, combobox3, combobox4, combobox5;
	JTextField textPan, textAdhar;
	JRadioButton r1, e1;
	JRadioButton r2, e2;
	JButton next;
	
	String formno;
	Signup2 (String formno){
		
		super("APPLICATION FORM");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);	
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		this.formno = formno;
		
		JLabel l1 = new JLabel("Page 2 :- ");
		l1.setBounds(300, 30, 600, 40);
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		add(l1);
		
		JLabel l2 = new JLabel("Advance Details");
		l2.setBounds(300, 60, 600, 40);
		l2.setFont(new Font("Raleway", Font.BOLD, 22));
		add(l2);
		
		JLabel l3 = new JLabel("Religion : ");
		l3.setBounds(100, 110, 100, 30);
		l3.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l3);
		
		String Religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
		combobox = new JComboBox(Religion);
		combobox.setBackground(new Color(252,208,76));
		combobox.setFont(new Font("Raleway", Font.BOLD, 18));
		combobox.setBounds(350, 110,320, 30);
		add(combobox);
		
		JLabel l4 = new JLabel("Category : ");
		l4.setBounds(100, 150, 100, 30);
		l4.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l4);
		
		String Category[] = {"Genral", "SC", "ST", "OBC", "Others"};
		combobox2 = new JComboBox(Category);
		combobox2.setBackground(new Color(252,208,76));
		combobox2.setFont(new Font("Raleway", Font.BOLD, 18));
		combobox2.setBounds(350, 150, 320, 30);
		add(combobox2);
		
		JLabel l5 = new JLabel("Income : ");
		l5.setBounds(100, 190, 100, 30);
		l5.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l5);
		
		String Income[] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000","Above 10,00,000"};
		combobox3 = new JComboBox(Income);
		combobox3.setBackground(new Color(252,208,76));
		combobox3.setFont(new Font("Raleway", Font.BOLD, 18));
		combobox3.setBounds(350, 190,320, 30);
		add(combobox3);
		
		JLabel l6 = new JLabel("Education : ");
		l6.setBounds(100, 230, 150, 30);
		l6.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l6);
		
		String education[] = {"Non - Graduate", "Graduate", "Post Graduate", "Others"};
		combobox4 = new JComboBox(education);
		combobox4.setBackground(new Color(252,208,76));
		combobox4.setFont(new Font("Raleway", Font.BOLD, 18));
		combobox4.setBounds(350, 230,320, 30);
		add(combobox4);
		
		JLabel l7 = new JLabel("Occupation : ");
		l7.setBounds(100, 270, 150, 30);
		l7.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l7);
		
		String occupation[] = {"Salried", "Sel-Employed", "Business", "Student","Retired", "Others"};
		combobox5 = new JComboBox(occupation);
		combobox5.setBackground(new Color(252,208,76));
		combobox5.setFont(new Font("Raleway", Font.BOLD, 18));
		combobox5.setBounds(350, 270, 320, 30);
		add(combobox5);
		
		JLabel l8 = new JLabel("Pan Number : ");
		l8.setBounds(100, 310, 150, 30);
		l8.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l8);
		
		textPan = new JTextField();
		textPan.setBounds(350, 310, 320, 30);
		textPan.setFont(new Font("Raleway", Font.BOLD, 18));
		add(textPan);
		
		JLabel l9 = new JLabel("Adhar Number : ");
		l9.setBounds(100, 350, 150, 30);
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l9);
		
		textAdhar = new JTextField();
		textAdhar.setBounds(350, 350, 320, 30);
		textAdhar.setFont(new Font("Raleway", Font.BOLD, 18));
		add(textAdhar);
		
		JLabel l10 = new JLabel("Senior Citizen : ");
		l10.setBounds(100, 390, 150, 30);
		l10.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l10);
		
		r1 = new JRadioButton("Yes");
		r1.setBounds(350, 390, 90, 30);
		r1.setBackground(new Color(252, 208, 76));
		r1.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r1);
		
		r2 = new JRadioButton("No");
		r2.setBounds(460, 390, 90, 30);
		r2.setBackground(new Color(252, 208, 76));
		r2.setFont(new Font("Raleway", Font.BOLD, 14));
		add(r2);
	
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
		JLabel l11 = new JLabel("Existing Account : ");
		l11.setBounds(100, 430, 150, 30);
		l11.setFont(new Font("Raleway", Font.BOLD, 18));
		add(l11);
		
		e1 = new JRadioButton("Yes");
		e1.setBounds(350, 430, 90, 30);
		e1.setBackground(new Color(252, 208, 76));
		e1.setFont(new Font("Raleway", Font.BOLD, 14));
		add(e1);
		
		e2 = new JRadioButton("No");
		e2.setBounds(460, 430, 90, 30);
		e2.setBackground(new Color(252, 208, 76));
		e2.setFont(new Font("Raleway", Font.BOLD, 14));
		add(e2);
	
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(e1);
		buttonGroup2.add(e2);
		
		JLabel l12 = new JLabel("Form No : ");
		l12.setBounds(550, 10, 120, 30);
		l12.setFont(new Font("Raleway", Font.BOLD, 14));
		add(l12);
		
		JLabel l13 = new JLabel(formno);
		l13.setBounds(650, 10, 120, 30);
		l13.setFont(new Font("Raleway", Font.BOLD, 14));
		add(l13);
		
		next = new JButton("Next");
		next.setFont(new Font("Arial", Font.BOLD, 14));
		next.setForeground(Color.WHITE);
		next.setBackground(Color.BLACK);
		next.setBounds(620, 480, 80, 30);
		next.addActionListener(this);
		add(next);
		
		setLayout(null);
		setSize(750, 600);
		setLocation(360, 30);
		getContentPane().setBackground(new Color(252, 208, 76));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
			
			String rel = (String) combobox.getSelectedItem();
			String cate = (String) combobox2.getSelectedItem();
			String inc = (String) combobox3.getSelectedItem();
			String edu = (String) combobox4.getSelectedItem();
			String occ = (String) combobox5.getSelectedItem();
			
			String pan = textPan.getText();
			String adhar = textAdhar.getText();
			
			String scitizen = null;
	    	if(r1.isSelected()) {
	    		scitizen = "Yes";
	    	}else if (r2.isSelected()) {
	    		scitizen = "No";
	    	}
	    	
	    	String eaccount = null;
	    	if(r1.isSelected()) {
	    		eaccount = "Yes";
	    	}else if (r2.isSelected()) {
	    		eaccount = "No";
	    	}
	    	
	    try {
	    	
	    	if (textPan.getText().equals("") || textAdhar.getText().equals("")) {
	    		JOptionPane.showMessageDialog(null, "Fill all the fields");
	    	} else {
	    		conn c1 = new conn();
	    		String q = "insert into Signup2  values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"', '"+edu+"','"+occ+"','"+pan+"', '"+adhar+"', '"+scitizen+"', '"+eaccount+"')";
	    		c1.statement.executeUpdate(q);
	    		new Signup3(formno);
	    		setVisible(false);
	    	}
	    	
			
		} catch (Exception E) {
			E.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup2("");
	}

}
