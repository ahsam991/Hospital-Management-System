import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Plog extends JFrame implements MouseListener, ActionListener
{	
	JLabel login1,userLabel1,passLabel1,imgLabel1,c1ImgLabel;
	JTextField userTF1;
	JPasswordField passPF1;
	JButton exitBtn1,admin1,loginBtn1, cna,backBtn1;
	JPanel panel1;
	ImageIcon icon1, image1, c1image2;
	Font myFont;

	public Plog()
	{
		this.setTitle("Pateint login");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.white);

		icon1 = new ImageIcon("img2.jpg");
		setIconImage(icon1.getImage());

		login1 = new JLabel("Log in with username and password.");
		login1.setBounds(180, 180, 250, 30);
		login1.setForeground(new Color(0,0,0));
		panel1.add(login1);

		userLabel1 = new JLabel("Username : ");
		userLabel1.setBounds(120, 230, 500, 30);
		userLabel1.setForeground(new Color(0,0,0));
		panel1.add(userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(200, 237, 150, 20);
		panel1.add(userTF1);

		passLabel1 = new JLabel("Password  : ");
		passLabel1.setBounds(120, 260, 100, 30);
		passLabel1.setForeground(new Color(0,0,0));
		panel1.add(passLabel1);

		passPF1 = new JPasswordField();
		passPF1.setBounds(200, 267, 150, 20);
		passPF1.setEchoChar('*');
		panel1.add(passPF1);

		
		loginBtn1 = new JButton("Log In");
		loginBtn1.setBounds(120, 325, 80, 30);
		loginBtn1.setForeground(Color.WHITE);
		loginBtn1.setBackground(new Color(137,207,240));
		loginBtn1.addActionListener(this);
		loginBtn1.addMouseListener(this);
		panel1.add(loginBtn1);

		exitBtn1 = new JButton("Exit");
		exitBtn1.setBounds(210, 325, 80, 30);
		exitBtn1.setForeground(Color.WHITE);
		exitBtn1.setBackground(new Color(137,207,240));
		exitBtn1.addActionListener(this);
		exitBtn1.addMouseListener(this);
		panel1.add(exitBtn1);

		backBtn1 = new JButton("Back");
		backBtn1.setBounds(310, 325, 80, 30);
		backBtn1.setForeground(Color.WHITE);
		backBtn1.setBackground(new Color(169,0,0));
		backBtn1.addActionListener(this);
		backBtn1.addMouseListener(this);
		panel1.add(backBtn1);

		login1 = new JLabel("--Or--");
		login1.setBounds(230, 360, 250, 30);
		login1.setForeground(new Color(137,207,240));
		panel1.add(login1);

		cna = new JButton("Create New Account");
		cna.setBounds(150, 395, 180, 20);
		cna.setForeground(Color.WHITE);
		cna.setBackground(new Color(169,0,0));
		cna.addActionListener(this);
		cna.addMouseListener(this);
		panel1.add(cna);

		c1image2 = new ImageIcon("patientlogin.png");
		c1ImgLabel = new JLabel(c1image2);
		c1ImgLabel.setBounds(0, 0, 800, 600);
		panel1.add(c1ImgLabel);

		/*image1 = new ImageIcon("patientlogin.png");
		imgLabel1 = new JLabel(image1);
		imgLabel1.setBounds(0, 0, 1270, 710);
		panel1.add(imgLabel1);*/
		
		this.add(panel1); 

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == admin1)
		{
			admin1.setBackground(Color.WHITE);
			admin1.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(Color.WHITE);
			loginBtn1.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(Color.WHITE);
			exitBtn1.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == cna)
		{
			cna.setBackground(Color.WHITE);
			cna.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == admin1)
		{
			admin1.setForeground(Color.WHITE);
			admin1.setBackground(new Color(137,207,240));
		}
		else if(me.getSource() == loginBtn1)
		{
			loginBtn1.setForeground(Color.WHITE);
			loginBtn1.setBackground(new Color(137,207,240));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setForeground(Color.WHITE);
			exitBtn1.setBackground(new Color(137,207,240));
		}
		else if(me.getSource() == cna)
		{
			cna.setForeground(Color.WHITE);
			cna.setBackground(new Color(137,207,240));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e1)
	{
		
		if(e1.getSource()==backBtn1)
		{
			HomePage c4 = new HomePage();
			c4.setVisible(true);
			this.setVisible(false);
		}

		else if(e1.getSource()==loginBtn1)
		{
			Pbutton1 c4 = new Pbutton1();
			c4.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(e1.getSource()==cna)
		{
			Reg c5 = new Reg();
			c5.setVisible(true);
			this.setVisible(false);
			
		}
		
		

		else if(e1.getSource()==exitBtn1)
		{
			System.exit(0);
		}
		
	}

}