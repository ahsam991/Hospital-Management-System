import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin2 extends JFrame implements ActionListener {
	JLabel a2Text, a2ImgLabel2, frameImage;
	JButton a2ExitBtn, a2BackBtn, employee, Doctor,dm,Pm ;
	JPanel a2Panel;
	ImageIcon c2Icon, c2image, c2image2, c2Lout, c2B1, c2T1, c2A1, c2f2, c2L1,c1image2;
	//ImageIcon a2Icon;
//	ImageIcon c2Icon, a2image2;
	Font myFont, myFont12;

	public Admin2() {
		this.setTitle("Management");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(230,230,250));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		a2Panel = new JPanel();
		a2Panel.setLayout(null);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		//a2Icon = new ImageIcon("208R.gif");
		//setIconImage(a2Icon.getImage());

		// IMAGES ADD

	

		a2Text = new JLabel("   You Have Successfully Loged In   ");
		a2Text.setBounds(293, 50, 232, 30);
		a2Text.setBackground(new Color(221,160,221));
		a2Text.setOpaque(true);
		a2Text.setForeground(Color.WHITE);
		a2Text.setFont(myFont12);
		a2Panel.add(a2Text);

		a2ExitBtn = new JButton("Exit");
		a2ExitBtn.setBounds(700, 470, 80, 30);
		a2ExitBtn.setBackground(new Color(72,209,204));
		a2ExitBtn.setOpaque(true);
		a2ExitBtn.setForeground(Color.BLACK);
		a2ExitBtn.addActionListener(this);
		//a2ExitBtn.addMouseListener(this);
		a2ExitBtn.setFont(myFont);
		a2Panel.add(a2ExitBtn);

		a2BackBtn = new JButton("Back");
		a2BackBtn.setBounds(30, 470, 80, 30);
		a2BackBtn.setBackground(new Color(72,209,204));
		a2BackBtn.setOpaque(true);
		a2BackBtn.setForeground(Color.BLACK);
		a2BackBtn.addActionListener(this);
		//a2BackBtn.addMouseListener(this);
		a2BackBtn.setFont(myFont);
		a2Panel.add(a2BackBtn);
		
        c2B1 = new ImageIcon("3.png");
		employee = new JButton(c2B1);
		employee.setBounds(170,200,128,128);
		//employee.setBackground(new Color(198, 65, 83));
		//employee.setOpaque(true);
		//employee.setForeground(Color.BLACK);
		//employee.setFont(myFont);
		employee.addActionListener(this);
		//employee.addMouseListener(this);
		a2Panel.add(employee);
		
        c2L1 = new ImageIcon("2.png");
		Doctor = new JButton(c2L1);
		Doctor.setBounds(340,200,128,128);
		//Doctor.setBackground(new Color(198, 65, 83));
		Doctor.setOpaque(true);
		//Doctor.setForeground(Color.BLACK);
		//Doctor.setFont(myFont);
		Doctor.addActionListener(this);
		//Doctor.addMouseListener(this);
		a2Panel.add(Doctor);
		
		
		
		c2T1 = new ImageIcon("PATIENT.png");
		dm = new JButton(c2T1 );
		dm.setBounds(510,200,128,128);
		//dm.setBackground(new Color(229, 255, 204));
		dm.setOpaque(true);
		//dm.setForeground(Color.BLACK);
		//dm.setFont(myFont);
		dm.addActionListener(this);
		//dm.addMouseListener(this);
		a2Panel.add(dm);
		
		
		c2B1 = new ImageIcon("1.png");
	    Pm = new JButton(c2B1 );
		Pm .setBounds(340,350,128,128);
		//Pm .setBackground(new Color(229, 255, 204));
		Pm .setOpaque(true);
		//Pm .setForeground(Color.BLACK);
		//Pm .setFont(myFont);
		Pm .addActionListener(this);
		//Pm .addMouseListener(this);
		a2Panel.add(Pm );
		
		
		/*

		frameImage = new JLabel("");
		Image frameimg = new ImageIcon(this.getClass().getResource("Admin2.png")).getImage();
		frameImage.setIcon(new ImageIcon(frameimg));
		frameImage.setBounds(0, 0, 800, 600);
		this.add(frameImage);*/
		this.add(a2Panel);

	}

	//public void mouseClicked(MouseEvent me) {
//}

	//public void mousePressed(MouseEvent me) {
	//}

	//public void mouseReleased(MouseEvent me) {
	//}

	/*public void mouseEntered(MouseEvent me) {
		if (me.getSource() == employee) {
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(new Color(198, 65, 83));
			// Doctor.setBackground(new Color(198, 65, 83));
			// Doctor.setForeground(new Color(198, 65, 83));
		} else if (me.getSource() == Doctor) {
			Doctor.setBackground(new Color(198, 65, 83));
			Doctor.setForeground(new Color(198, 65, 83));
		}

		else if (me.getSource() == a2ExitBtn) {
			a2ExitBtn.setBackground(new Color(198, 65, 83));
			a2ExitBtn.setForeground(new Color(198, 65, 83));
		} else if (me.getSource() == a2BackBtn) {
			a2BackBtn.setBackground(new Color(198, 65, 83));
			a2BackBtn.setForeground(new Color(198, 65, 83));
		}

		else {

		}
	}

	public void mouseExited(MouseEvent me) {
		if (me.getSource() == employee) {
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(Color.BLACK);
		} else if (me.getSource() == Doctor) {
			Doctor.setBackground(new Color(198, 65, 83));
			Doctor.setForeground(Color.BLACK);
		} else if (me.getSource() == a2ExitBtn) {
			a2ExitBtn.setBackground(new Color(198, 65, 83));
			a2ExitBtn.setForeground(Color.BLACK);
		} else if (me.getSource() == a2BackBtn) {
			a2BackBtn.setBackground(new Color(198, 65, 83));
			a2BackBtn.setForeground(Color.BLACK);
		} else {

		}
	}*/

	public void actionPerformed(ActionEvent e5) {
		if (e5.getSource() == a2BackBtn) {
			LoginPage a1 = new LoginPage();
			a1.setVisible(true);
			this.setVisible(false);
		} else if (e5.getSource() == a2ExitBtn) {
			System.exit(0);
		} else if (e5.getSource() == employee) {
			Employee3 c1 = new Employee3();
			c1.setVisible(true);
			this.setVisible(false);
		} else if (e5.getSource() == Doctor) {
			Doctor3 c1 = new Doctor3();
			c1.setVisible(true);
			this.setVisible(false);
		}
		
		else if (e5.getSource() == dm) {
		  patient3 c5 = new  patient3();
			c5.setVisible(true);
			this.setVisible(false);
		}
		else if (e5.getSource() == Pm) {
		  ManagementPage c7 = new  ManagementPage();
			c7.setVisible(true);
			this.setVisible(false);
		}
		
		

	}
}