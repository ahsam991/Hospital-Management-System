
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
//import java.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class patientLogin extends JFrame implements ActionListener , MouseListener {

ImageIcon c1image1;
 Font font,f;
 JButton create,login,eb,eb1;
 JLabel textLabel,c1ImgLabel1;
 JPanel rightPanel,leftPanel, c2Panel;
 Font myFont,myFont12;

   public patientLogin()
{
	this.setTitle("Patient Log-in Panel");
	this.setSize(800,600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 16);
		
		c2Panel = new JPanel();
		c2Panel.setLayout(null);

	 
	 
	   create = new JButton("Create Account");
	   create.setFont(myFont12);
	   create.setBounds(50,400,250,50);
	   create.setBackground(new Color(253, 253, 253));
	   create.setOpaque(true);
	   create.setForeground(Color.BLACK);
	   create.addActionListener(this);
	   create.addMouseListener(this);
	   c2Panel.add(create);
	   c2Panel.add(create);
  
	   login = new JButton("Log-in");
	   login.setFont(myFont12);
	   login.setBounds(450, 400, 250, 50);
	   login.setBackground(new Color(253, 253, 253));
	   login.setOpaque(true);
	   login.setForeground(Color.BLACK);
	   login.addActionListener(this);
	   login.addMouseListener(this);
	   c2Panel.add(login);
	   c2Panel.add(login);
  
	   eb1 = new JButton("BACK");
	   eb1.setFont(myFont);
	   eb1.setBounds(600, 490, 170, 30);
	   eb1.setBackground(new Color(253, 253, 253));
	   eb1.setOpaque(true);
	   eb1.setForeground(Color.BLACK);
	   eb1.addActionListener(this);
	   eb1.addMouseListener(this);
	   c2Panel.add(eb1);
	   

	//  eb = new JButton("EXIT");
	
//	eb.setFont(myFont);
	 // eb.setBounds(260, 480, 170, 50);
	 // eb .setBackground(new Color(253, 253, 253));
	 // eb.setOpaque(true);
	 // eb.setForeground(Color.BLACK);
	 // eb.addActionListener(this);
	 // eb.addMouseListener(this);
	 // c2Panel.add(eb);

	  c1image1 = new ImageIcon("Welcome.gif");
	  c1ImgLabel1 = new JLabel(c1image1);
	  c1ImgLabel1.setBounds(0, 0, 800, 600);
	 c2Panel.add(c1ImgLabel1);
	  this.add(c2Panel);
}


	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource() == create){
			CreatePatientProfile profile = new CreatePatientProfile();
			profile.setVisible(true);
			this.setVisible(false); 
		}

		else if(ae.getSource() == login)
		{
			 
			Loginbutton loginpage = new Loginbutton();
			loginpage.setVisible(true);
			this.setVisible(false); 
		}
	
		else if(ae.getSource() == eb1)
		{
			 
			HomePage hp = new HomePage();
			hp.setVisible(true);
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
	if(me.getSource() == create)
	{
		create.setBackground(new Color(248,200,220));
		create.setForeground(new Color(198, 65, 83));
	}
	else if(me.getSource() == eb)
	{
		eb.setBackground(new Color(248,200,220));
		eb.setForeground(new Color(198, 65, 83));
	}
	else if(me.getSource() == eb1)
	{
		eb1.setBackground(new Color(248,200,220));
		eb1.setForeground(new Color(198, 65, 83));
	}
	else if(me.getSource() == login)
	{
		login.setBackground(new Color(248,200,220));
		login.setForeground(new Color(198, 65, 83));
	}
	
	else
	{
		
	}
}

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
 */
/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
 */
@Override
public void mouseExited(MouseEvent me) {
	if(me.getSource() == create)
	{
		create.setBackground(new Color(253,253,253));
		create.setForeground(Color.BLACK);
	}
	else if(me.getSource() == eb)
	{
		eb.setBackground(new Color(253,253,253));
		eb.setForeground(Color.BLACK);
	}
	else if(me.getSource() == login)
	{
		login.setBackground(new Color(253,253,253));
		login.setForeground(Color.BLACK);
	}
	else if(me.getSource() == eb1)
	{
		eb1.setBackground(new Color(253,253,253));
		eb1.setForeground(Color.BLACK);
	}
	
	else
	{
		
	}
}

}

       




