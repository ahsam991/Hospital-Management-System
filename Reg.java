import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

 

public class Reg extends JFrame implements  ActionListener
{
    JPanel leftPanel;
    JLabel name,age,email,phoneNo,bloodGrp,pass;
    JTextField nameField,ageField,eField,noField,passField;
	JComboBox comboGrp;
	JButton bNext,bBack;
	JRadioButton male,female;
    Font font;

 


     public Reg ()
     {
        font = new Font("System", Font.BOLD, 20);
        this.setTitle("Hospital Registration");
        this.setSize(800,600);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 

        name = new JLabel("Name :");
        name.setBounds(160,30,250,32);
        name.setForeground(Color.BLACK);
        name.setFont(font);
        this.add(name);
		
		nameField = new JTextField();
        nameField.setBounds(315,30,250,30);
        nameField.setFont(font);
        this.add(nameField);
		
		 pass = new JLabel("Password :");
        pass.setBounds(160,75,250,32);
        pass.setForeground(Color.BLACK);
        pass.setFont(font);
        this.add(pass);
		
		passField = new JTextField();
        passField.setBounds(315,75,250,30);
        passField.setFont(font);
        this.add(passField);
		
		age = new JLabel("Age :");
        age.setBounds(160,135,250,32);
        age.setForeground(Color.BLACK);
        age.setFont(font);
        this.add(age);
		
		ageField = new JTextField();
        ageField.setBounds(315,135,250,30);
        ageField.setFont(font);
        this.add(ageField);
		
		email = new JLabel("E-mail :");
        email.setBounds(160,195,250,32);
        email.setForeground(Color.BLACK);
        email.setFont(font);
        this.add(email);
		
		eField = new JTextField();
        eField.setBounds(315,195,250,30);
        eField.setFont(font);
        this.add(eField);
		
		phoneNo = new JLabel("Phone No :");
        phoneNo.setBounds(160,255,250,32);
        phoneNo.setForeground(Color.BLACK);
        phoneNo.setFont(font);
        this.add(phoneNo);
		
		noField = new JTextField();
        noField.setBounds(315,255,250,30);
        noField.setFont(font);
        this.add(noField);
		
		bloodGrp = new JLabel("Blood Group :");
        bloodGrp.setBounds(160,315,250,32);
        bloodGrp.setForeground(Color.BLACK);
        bloodGrp.setFont(font);
        this.add(bloodGrp);
		
		
		
		String items2[] = {"A+", "A-", "B+", "B-", "AB+", "AB-"};
		comboGrp = new JComboBox(items2);
		comboGrp.setBounds(315,315,250,30);
		this.add(comboGrp);
		
		male = new JRadioButton("Male");
		male.setBounds(315, 375, 100, 20);
		male.setBackground(Color.decode("#1E90FF"));
		male.setOpaque(true);
		this.add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(465, 375, 100, 20);
		female.setBackground(Color.decode("#1E90FF"));
		female.setOpaque(true);
		this.add(female);
 
		
		
		
        bNext=new JButton("Next");
		bNext.setBounds(465,435,100,30);
		bNext.addActionListener(this);
		this.add(bNext);
		
		bBack=new JButton("Back");
		bBack.setBounds(160,435,100,30);
		bBack.addActionListener(this);
		this.add(bBack);
		
 

        
        leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 800, 600);
        leftPanel.setBackground(Color.decode("#ADD8E6"));
        this.add(leftPanel);

 

 


     }
	  public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bNext) {
              Plog jp = new Plog();
            jp.setVisible(true);
            this.setVisible(false);
        }

        else if (e.getSource() == bBack) {
            Plog hp = new Plog();
            hp.setVisible(true);
            this.setVisible(false);
        }
      
}
}