import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;

public class Button2 extends JFrame //implements ActionListener 
{
	JButton b1;
    JButton b2;
    JButton b3;
	JLabel l;
	//Font f;
	ImageIcon ii;
    
	public Button2()
	{
		
		ImageIcon iconb1=new ImageIcon("D:\\photo\\pp.png");
		ImageIcon iconb2=new ImageIcon("D:\\photo\\bb.png");
		ImageIcon iconb3=new ImageIcon("D:\\photo\\dd.png");
		
		b1=new JButton(iconb1);
		b2=new JButton(iconb2);
		b3=new JButton(iconb3);
		
		//l.setFont(f);
		
		l=new JLabel("Select Your Option"); 
		
		setLayout(null);
		
		//f=new Font("MS UI Gothic",Font.BOLD,15);
		
		
		b1.setBounds(170,240,128,128);
		b2.setBounds(340,240,128,128);
		b3.setBounds(510,240,128,128);
		l.setBounds(305,150,160,70);
		
		
		
		
		add(b1);
		add(b2);
		add(b3);
		add(l);
		
		
		setVisible(true);
		setSize(800,600);
		this.setLocationRelativeTo(null);
		setTitle("Select Button");
		
		
		//b1.addActionListener(this);
		//b2.addActionListener(this);	
		//b3.addActionListener(this);	
	}
		
	
}