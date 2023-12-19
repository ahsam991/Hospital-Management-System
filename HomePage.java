
import java.util.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener, MouseListener

{

ImageIcon icon, c1image1;
 Font font,font1;
 JButton patientBtn,adminBtn,eb,eb1,dcbtn;
 JPanel CenterPanel;                                                                       // JPanel leftPanel, rightPanel;
 JLabel frameImage,c1ImgLabel1;
 JPanel panel1;


public HomePage()
{
    this.setTitle("Welcome To My Health App");
    this.setSize(800,600);
	this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setVisible(true);
   
    panel1= new JPanel();
    panel1.setLayout(null);
	
    panel1.setBackground(Color.white);
   
	icon = new ImageIcon("Homepage.jpg");
	setIconImage(icon.getImage());

     font = new Font("Times New Roman", Font.BOLD, 12);
     font1 = new Font("Times New Roman", Font.BOLD, 14);


   // leftPanel = new JPanel();
   // leftPanel.setBounds(0,0,300,200);
   // leftPanel.setBackground(new Color(135, 206, 235));
   // leftPanel.setLayout(null);
   // this.add(leftPanel);
   
       /* CenterPanel = new JPanel();
        CenterPanel.setBounds(0,0, 980, 600);
		  
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Homepage.jpg")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 980, 680);
     
		 icon = new ImageIcon("Homepage.jpg");*/


         //this.add(frameImage);
  //  ImageIcon img =new ImageIcon("Image//iconmonstr-home-8-240.png");
   // frameImage = new JLabel(img);
   // frameImage.setBounds(0,10,180,100);
    //leftPanel.add(frameImage);
    //this.add(leftPanel);



  //  rightPanel = new JPanel();
  //  rightPanel.setBounds(0,0,120,100);
   // rightPanel.setBackground(new Color(47,86,233));
  //  rightPanel.setLayout(null);
   // this.add(rightPanel);

    //Buttons

     patientBtn = new JButton("PATIENT SECTION");
     patientBtn.setFont(font1);
     patientBtn.setBounds(500,140,250,40);
     patientBtn.setBackground(new Color(173,216,230));
     patientBtn.setOpaque(true);
     patientBtn.setForeground(Color.BLACK);
     patientBtn.addActionListener(this);
     patientBtn.addMouseListener(this);
     panel1.add(patientBtn);

    adminBtn = new JButton("ADMIN SECTION");
    adminBtn.setFont(font1);
    adminBtn.setBounds(500, 220, 250, 40);
    adminBtn.setBackground(new Color(173,216,230));
    adminBtn.setOpaque(true);
    adminBtn.setForeground(Color.BLACK);
    adminBtn.addActionListener(this);
    adminBtn.addMouseListener(this);
    panel1.add(adminBtn);

    
    dcbtn = new JButton("SEARCH DOCTOR");
    dcbtn.setFont(font1);
    dcbtn.setBounds(500, 300, 250, 40);
    dcbtn.setBackground(new Color(173,216,230));
    dcbtn.setOpaque(true);
    dcbtn.setForeground(Color.BLACK);
    dcbtn.addActionListener(this);
    dcbtn.addMouseListener(this);
    panel1.add(dcbtn);

    eb1 = new JButton("BACK");
    eb1.setFont(font1);
    eb1.setBounds(500, 380, 250, 40);
    eb1.setBackground(new Color(173,216,230));
    eb1.setOpaque(true);
    eb1.setForeground(Color.BLACK);
    eb1.addActionListener(this);
    eb1.addMouseListener(this);
    panel1.add(eb1);

    eb = new JButton("EXIT");
    eb.setFont(font1);
    eb.setBounds(500, 460, 250, 40);
    eb .setBackground(new Color(173,216,230));
    eb.setOpaque(true);
    eb.setForeground(Color.BLACK);
    eb.addActionListener(this);
    eb.addMouseListener(this);
    panel1.add(eb);


    c1image1 = new ImageIcon("Homepage.gif");
		c1ImgLabel1 = new JLabel(c1image1);
		c1ImgLabel1.setBounds(0, 0, 800, 600);
		panel1.add(c1ImgLabel1);
	     //this.setVisible(true);
         this.add(panel1);
	/* adminBtn = new JButton("doctor section");
    adminBtn.setFont(font);
    adminBtn.setBounds(400, 400, 300, 150);
    adminBtn.setBackground(new Color(2, 211, 249 ));
    adminBtn.setForeground(new Color(255, 255, 255));
    adminBtn.addActionListener(this);
    this.add(adminBtn);*/
}

public void actionPerformed(ActionEvent ae){
        
    if(ae.getSource() ==  patientBtn){
         
        Plog p = new Plog();
            p.setVisible(true);
            this.setVisible(false);
        }

    else if(ae.getSource() == adminBtn)
    {
        LoginPage L = new LoginPage();
        L.setVisible(true);
        this.setVisible(false);
        }	
        else if(ae.getSource()==eb1)
        {
            Welcome p = new Welcome();
            p.setVisible(true);
            this.setVisible(false);
        } 
        else if(ae.getSource()==dcbtn)
        {
           AppointmentForm p1 = new  AppointmentForm ();
          //  p1.setVisible(true);
            this.setVisible(false);
        } 

        else if(ae.getSource()==eb)
        {
            System.exit(0);
        }
    }
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void mouseEntered(MouseEvent me)
        {
            if(me.getSource() == patientBtn)
            {
                patientBtn.setBackground(new Color(253,253,253));
                patientBtn.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == eb)
            {
                eb.setBackground(new Color(253,253,253));
                eb.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == eb1)
            {
                eb1.setBackground(new Color(253,253,253));
                eb1.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == adminBtn)
            {
                adminBtn.setBackground(new Color(253,253,253));
                adminBtn.setForeground(new Color(198, 65, 83));
            }
            else if(me.getSource() == dcbtn)
            {
                dcbtn.setBackground(new Color(253,253,253));
                dcbtn.setForeground(new Color(198, 65, 83));
            }
            
            else
            {
                
            }
        }
    
        @Override
        public void mouseExited(MouseEvent me) {
            if(me.getSource() == patientBtn)
            {
                patientBtn.setBackground(new Color(173,216,230));
                patientBtn.setForeground(Color.BLACK);
            }
            else if(me.getSource() == eb)
            {
                eb.setBackground(new Color(173,216,230));
                eb.setForeground(Color.BLACK);
            }
            else if(me.getSource() == adminBtn)
            {
                adminBtn.setBackground(new Color(173,216,230));
                adminBtn.setForeground(Color.BLACK);
            }
            else if(me.getSource() == eb1)
            {
                eb1.setBackground(new Color(173,216,230));
                eb1.setForeground(Color.BLACK);
            }
            else if(me.getSource() == dcbtn)
            {
                dcbtn.setBackground(new Color(173,216,230));
                dcbtn.setForeground(Color.BLACK);
            }
            else
            {
                
            }
        }
}        
    
