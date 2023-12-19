import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Student
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Loginbutton extends JFrame implements ActionListener{

    private JLabel userLabel,passLabel,textLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton LoginButton,clearButton,back,home;
    private Font f;
    private JLabel frameImage;
    private JPanel leftPanel;
	String checkname;

   
	 
    Loginbutton()

    {  
        
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(1000,800);
        this.setBounds(400, 150, 1000, 800);
        this.setTitle("Login Page");
        this.setLayout(null);
        this.setBackground(new Color(47,86,233));
        

        f = new Font("Arial",Font.BOLD,20);
        

        textLabel=new JLabel("ENTER YOUR INFORMATION");
        textLabel.setBounds(500,200,1000,50);
        textLabel.setForeground(new Color(0,142,201));
        textLabel.setFont(new Font("Serif", Font.BOLD, 24));
        this.add(textLabel);

        userLabel = new JLabel("User ID : ");
        userLabel.setBounds(400,300,150,50);
        userLabel.setForeground(new Color(0, 142, 201));
        userLabel.setFont(f);
        this.add(userLabel);

        leftPanel = new JPanel();
    leftPanel.setBounds(0,0,350,800);
    leftPanel.setBackground(new Color(0,0,0));
    leftPanel.setLayout(null);
    this.add(leftPanel);

    //ImageIcon img =new ImageIcon("Image//iconmonstr-marketing-5-240.png");
    //frameImage = new JLabel(img);
    //frameImage.setBounds(0,100,380,500);
    //leftPanel.add(frameImage);
    //this.add(leftPanel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(550,300 ,300 , 50);
        tf.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        this.add(tf);

        passLabel = new JLabel("Password: ");
        passLabel.setForeground(new Color(0, 142, 201));
        passLabel.setBounds(400,370,150,50);
        
        passLabel.setFont(f);
        this.add(passLabel);

        pf = new JPasswordField();
        pf.setFont(f);
        pf.setEchoChar('*');
        pf.setBounds(550,370, 300, 50);
        this.add(pf);
                            // Buttons
        LoginButton = new JButton("Login");
        LoginButton.setFont(f);
        LoginButton.setBounds(650, 480, 90, 50);
       // LoginButton.setBackground(new Color(0, 255, 0));
        //LoginButton.setForeground(new Color(255,255,255));
        LoginButton.addActionListener(this);
        this.add(LoginButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(f);
        clearButton.setBounds(750, 480, 90, 50);
        clearButton.addActionListener(this);
        this.add(clearButton);
		
		back= new JButton("Back");
        back.setFont(f);
        back.setBounds(550, 480, 90, 50);
		back.addActionListener(this);
        this.add(back);
		
		
        home = new JButton("Home Page");
        home.setFont(f);
        home.setBounds(550, 540, 290, 50);
        //home.setBackground(new Color(176, 0, 0));
        //home.setForeground(new Color(255,255,255));
        //home.setOpaque(true);
		home.addActionListener(this);
        this.add(home);
        
	}

     public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();	
		checkname = tf.getText();
		if(ae.getSource() == LoginButton ){
			//checkname = tf.getText();
			File myFileread = new File(checkname+".txt");
			try {
				Scanner sc = new Scanner(myFileread);
				while(sc.hasNextLine()){
					String line = sc.nextLine();
                    String[] values = line.split(" ");
                    if(values[2].equals(tf.getText()))
                    {
                       if(values[1].equals(pf.getText()))
					   {	
							//System.out.println("Login Successfully");
                            dispose();
						    PatientFeature pf = new PatientFeature();
							pf.setVisible(true);
							this.setVisible(false);
						}
						
						else{System.out.println("Wrong password");}
						
					   }
					   else{
					   System.out.println("Wrong User Name");}
					   
                    }
               
				sc.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
        }
        if(ae.getSource()==clearButton)
        {
            tf.setText("  ");
        }
		
		else if(ae.getSource()== back)
		{
			patientLogin csf = new patientLogin();
			csf.setVisible(true);
			this.setVisible(false);
		}
			if(ae.getSource()==home)
		{
            dispose();
			HomePage hp = new HomePage();
			hp.setVisible(true);
			this.setVisible(false);
		}
		
        

    } 
    
     /*public static void main(String[] args) {
        Loginbutton frame = new Loginbutton();
        frame.setVisible(true);
    } */
}





