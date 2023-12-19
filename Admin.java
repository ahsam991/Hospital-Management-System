import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Admin extends JFrame implements ActionListener,MouseListener
{	
	JLabel c2Text,c2Login,c2ImgLabel2,c2ImgLabel1;
	JPasswordField c2PassPF;
	JButton c2ExitBtn, c2BackBtn, c2NxtBtn,sm,dm,pm,c2LogOut;
	JPanel c2Panel;
	ImageIcon c2Icon,c2image;
	JCheckBox c1, c2, c3, c4;
	JComboBox c2Combo;
	Font myFont,myFont12;
	public Admin()
	{
		this.setTitle("Choose Your Sector");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		c2Panel = new JPanel();
		c2Panel.setLayout(null);
		
		c2Text = new JLabel("  You Have Successfully Loged In  ");
		c2Text.setBounds(293, 140, 232, 30);
		c2Text.setBackground(new Color(229, 255, 204));
		c2Text.setOpaque(true);
		c2Text.setForeground(Color.BLACK);
		c2Text.setFont(myFont12);
		c2Panel.add(c2Text);
		

		sm = new JButton("Satff Management");
		sm.setBounds(335, 230,140, 30);
		sm.setBackground(new Color(229, 255, 204));
		sm.setOpaque(true);
		sm.setForeground(Color.BLACK);
		sm.setFont(myFont);
		sm.addActionListener(this);
		sm.addMouseListener(this);
		c2Panel.add(sm);

		pm = new JButton("Patient Management");
		pm.setBounds(335, 280,140, 30);
		pm.setBackground(new Color(229, 255, 204));
		pm.setOpaque(true);
		pm.setForeground(Color.BLACK);
		pm.setFont(myFont);
		pm.addActionListener(this);
		pm.addMouseListener(this);
		c2Panel.add(pm);

		dm = new JButton("Doctor Management");
		dm.setBounds(335, 330,140, 30);
		dm.setBackground(new Color(229, 255, 204));
		dm.setOpaque(true);
		dm.setForeground(Color.BLACK);
		dm.setFont(myFont);
		dm.addActionListener(this);
		dm.addMouseListener(this);
		c2Panel.add(dm);
		
	

		c2ExitBtn = new JButton("Exit");
		c2ExitBtn.setBounds(360, 380, 80, 30);
		c2ExitBtn.setBackground(new Color(229, 255, 204));
		c2ExitBtn.setOpaque(true);
		c2ExitBtn.setForeground(Color.BLACK);
		c2ExitBtn.addActionListener(this);
		c2ExitBtn.addMouseListener(this);
		c2Panel.add(c2ExitBtn);

		c2BackBtn = new JButton("Back");
		c2BackBtn.setBounds(260, 380, 80, 30);
		c2BackBtn.setBackground(new Color(229, 255, 204));
		c2BackBtn.setOpaque(true);
		c2BackBtn.setForeground(Color.BLACK);
		c2BackBtn.addActionListener(this);
		c2BackBtn.addMouseListener(this);
		c2Panel.add(c2BackBtn);

		c2LogOut = new JButton("Log Out");
		c2LogOut.setBounds(460, 380, 80, 30);
		c2LogOut.setBackground(new Color(229, 255, 204));
		c2LogOut.setOpaque(true);
        c2LogOut.setForeground(Color.BLACK);
		c2LogOut.addActionListener(this);
        c2LogOut.addMouseListener(this);
		c2Panel.add(c2LogOut);

		this.add(c2Panel);

	}
	private void setTime() {
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setBackground(new Color(198, 65, 83));
			c2ExitBtn.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(new Color(198, 65, 83));
			c2BackBtn.setForeground(new Color(198, 65, 83));
		}
        else if(me.getSource() ==c2LogOut)
		{
			c2LogOut.setBackground(new Color(198, 65, 83));
			c2LogOut.setForeground(new Color(198, 65, 83));
		}
	
		else if(me.getSource() ==sm)
		{
			sm.setBackground(new Color(198, 65, 83));
			sm.setForeground(new Color(198, 65, 83));
		}

		else if(me.getSource() == pm)
		{
			pm.setBackground(new Color(198, 65, 83));
			pm.setForeground(new Color(198, 65, 83));
		}
        else if(me.getSource() == dm)
		{
			dm.setBackground(new Color(198, 65, 83));
			dm.setForeground(new Color(198, 65, 83));
		}
		
		
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setBackground(new Color(229, 255, 204));
			c2ExitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(new Color(229, 255, 204));
			c2BackBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == c2LogOut)
		{
			c2LogOut.setBackground(new Color(229, 255, 204));
			c2LogOut.setForeground(Color.BLACK);
		}

		else if(me.getSource() == pm)
		{
			pm.setBackground(new Color(229, 255, 204));
			pm.setForeground(Color.BLACK);
		}

		else if(me.getSource() == sm)
		{
			sm.setBackground(new Color(229, 255, 204));
			sm.setForeground(Color.BLACK);
		}
        else if(me.getSource() == dm)
		{
			dm.setBackground(new Color(229, 255, 204));
			dm.setForeground(Color.BLACK);
		}

		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent e2)
	{
		 if(e2.getSource()==sm)
		{
			//vehicale v1 = new vehicale();
			//v1.setVisible(true);
			//this.setVisible(false);
		}

		else if(e2.getSource()==dm)
		{
		
		}

		else if(e2.getSource()==pm)
		{
			
		}
		

		else if(e2.getSource()==c2BackBtn)
		{
			LoginPage c2 = new LoginPage();
			c2.setVisible(true);
			this.setVisible(false);
		}

		
		else if(e2.getSource()==c2ExitBtn)
		{
			System.exit(0);
		}

        else if(e2.getSource()==c2LogOut)
		{
			HomePage c2 = new HomePage();
			c2.setVisible(true);
			this.setVisible(false);
		}
	}
}