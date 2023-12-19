
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;



public class BMRcalculator extends JFrame implements ActionListener
{
    JLabel l,l1,l2,l3,l4,l5,frameImage;
    JButton b1,b2,back,exit;
    JTextField t1,t2,t3,t4;
    Font f1,f2;
    ImageIcon ii;
    
    public BMRcalculator()
    {
        
        
        l1=new JLabel("BMR Calculator");
        l2=new JLabel("Height(inch):");
        l3=new JLabel("Weight(lbs):");
        l4=new JLabel("Age:");
        l5=new JLabel("Result:");
       
        //ii=new ImageIcon("B M R.png");
        
        l=new JLabel(ii);
        
        add(l);
		
        
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
		
        
        b1=new JButton("Male");
        b2=new JButton("Female");
		back=new JButton("Back");
		exit=new JButton("Exit");
		
		
		//ii=new ImageIcon("B M R.png");
		 //l=new JLabel(ii);//***********
        
        setLayout(null);
        
        f1=new Font("Lucida Fax",Font.BOLD,25);
        f2=new Font("MS UI Gothic",Font.BOLD,15);
        l1.setBounds(300,30,300,30);
        l2.setBounds(400,100,200,30);
        l3.setBounds(400,200,200,30);
        l4.setBounds(400,300,200,30);
        l5.setBounds(400,470,200,30);
        l.setBounds(0,-20,800,600);
        
        



       
        t1.setBounds(500,100,200,30);
        t2.setBounds(500,200,200,30);
        t3.setBounds(500,300,200,30);
        t4.setBounds(500,470,200,30);
        
        b1.setBounds(500,385,100,30);
        b2.setBounds(600,385,100,30);
		back.setBounds(600,520,100,30);
		exit.setBounds(600,600,100,30);
		
        
        //l2.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        
        add(b1);
        add(b2);
		add(back);
		add(exit);
        
        setVisible(true);
        setSize(800,600);
        setTitle("Bmr");
		
		
        b1.addActionListener(this);
        b2.addActionListener(this);
        back.addActionListener(this);
		exit.addActionListener(this); 
		
		////****************/////
		frameImage = new JLabel("");
		Image frameimg = new ImageIcon(this.getClass().getResource("B M R.png")).getImage();
		frameImage.setIcon(new ImageIcon(frameimg));
		frameImage.setBounds(0, 0, 800, 600);
		this.setLocationRelativeTo(null);
		this.add(frameImage);
		
		
		
    
    
    }    
    public void actionPerformed(ActionEvent e)
    {
		 if (e.getSource() == back) {
            Pbutton1 c1 = new Pbutton1();
            c1.setVisible(true);
            this.setVisible(false);
        }
		 else if (e.getSource()==exit)
		{
			System.exit(0);
		}
        double w=Double.parseDouble(t1.getText());
        double h=Double.parseDouble(t2.getText());
        int a=Integer.parseInt(t3.getText());
        if(e.getSource()==b1)
    {
        double bmrM=655 + (4.3 * w) + (4.7 * h) - (4.7 * a);
        t4.setText("");
        t4.setText(bmrM+" "+"Calories/day");
    }
    else if(e.getSource()==b2)
    {
        double bmrW=66 + (6.3 * w) + (12.9 * h) - (6.8 * a);
        t4.setText(" ");
        t4.setText(bmrW+" "+"Calories/day");

    }        
    }
    
	
	/*public static void main(String args[])
    {
        new BMRcalculator().setVisible(true);
    }*/
	
}
