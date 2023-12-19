import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pbutton1 extends JFrame implements MouseListener, ActionListener {
	JLabel c2Text, c2Login, c2ImgLabel1, c2ImgLabel2, label, c1ImgLabel, frameImage;
	JPasswordField c2PassPF;
	JButton c2ExitBtn, c2BackBtn, c2LogOut, c2Bmr, c2bloodB, c2contacts, c2Launch, c2bmi, c2pack2, c2Med;
	JPanel c2Panel;
	ImageIcon c2Icon, c2image, c2image2, c2Lout, c2B1, c2T1, c2A1, c2f2, c2L1, c1image2, c2A2;
	JComboBox c2Combo;

	public Pbutton1() {
		this.setTitle("select your choice");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setBackground(new Color(135,206,235));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c2Panel = new JPanel();
		c2Panel.setLayout(null);

		// c2Icon = new ImageIcon("Service.png");
		// setIconImage(c2Icon.getImage());

		c2Login = new JLabel("Choose Your Option");
		c2Login.setBounds(320, 180, 250, 30);
		c2Login.setForeground(new Color(0, 0, 0));
		c2Panel.add(c2Login);

		/*
		 * 
		 * c2ExitBtn = new JButton("Exit");
		 * c2ExitBtn.setBounds(512, 520, 100, 30);
		 * c2ExitBtn.setForeground(Color.WHITE);
		 * c2ExitBtn.setBackground(new Color(169, 0, 0));
		 * c2ExitBtn.addActionListener(this);
		 * c2ExitBtn.addMouseListener(this);
		 * c2Panel.add(c2ExitBtn);
		 * 
		 * c2BackBtn = new JButton("Back");
		 * c2BackBtn.setBounds(20, 520, 100, 30);
		 * c2BackBtn.setForeground(Color.WHITE);
		 * c2BackBtn.setBackground(new Color(137, 207, 240));
		 * c2BackBtn.addActionListener(this);
		 * c2BackBtn.addMouseListener(this);
		 * c2Panel.add(c2BackBtn);
		 * 
		 * 
		 */
		c2B1 = new ImageIcon("bmr.gif");
		c2Bmr = new JButton(c2B1);
		c2Bmr.setBounds(70, 250, 128, 128);
		c2Bmr.setBackground(Color.WHITE);
		c2Bmr.addActionListener(this);
		c2Panel.add(c2Bmr);

		c2ExitBtn = new JButton("Exit");
		c2ExitBtn.setBounds(512, 520, 100, 30);
		c2ExitBtn.setForeground(Color.WHITE);
		c2ExitBtn.setBackground(new Color(169, 0, 0));
		c2ExitBtn.addActionListener(this);
		c2ExitBtn.addMouseListener(this);
		c2Panel.add(c2ExitBtn);

		c2BackBtn = new JButton("Back");
		c2BackBtn.setBounds(20, 520, 100, 30);
		c2BackBtn.setForeground(Color.WHITE);
		c2BackBtn.setBackground(new Color(137, 207, 240));
		c2BackBtn.addActionListener(this);
		c2BackBtn.addMouseListener(this);
		c2Panel.add(c2BackBtn);

		c2L1 = new ImageIcon("contacts.gif");
		c2contacts = new JButton(c2L1);
		c2contacts.setBounds(230, 250, 128, 128);
		c2contacts.setBackground(Color.WHITE);
		c2contacts.addActionListener(this);
		c2Panel.add(c2contacts);

		c2T1 = new ImageIcon("blood.png");
		c2bloodB = new JButton(c2T1);
		c2bloodB.setBounds(400, 250, 128, 128);
		c2bloodB.setBackground(Color.WHITE);
		c2bloodB.addActionListener(this);
		c2Panel.add(c2bloodB);

		c2A1 = new ImageIcon("B M I.png");
		c2bmi = new JButton(c2A1);
		c2bmi.setBounds(570, 250, 128, 128);
		c2bmi.setBackground(Color.WHITE);
		c2bmi.addActionListener(this);
		c2Panel.add(c2bmi);

		

		c2pack2 = new JButton(c2f2);
		c2f2 = new ImageIcon("Findhospital.png");
		c2pack2 = new JButton(c2f2);
		c2pack2.setBounds(190, 410, 128, 128);
		c2pack2.setBackground(Color.WHITE);
		c2pack2.addActionListener(this);
		c2Panel.add(c2pack2);
// E Medicine

		//c2Med = new JButton(c2A2);
		c2A2 = new ImageIcon("E-MEDICINE.gif");
		c2Med = new JButton(c2A2);
		c2Med.setBounds(335, 410, 128, 128);
		c2Med.setBackground(Color.WHITE);
		c2Med.addActionListener(this);
		c2Panel.add(c2Med);

		/*
		 * c2Lout = new ImageIcon("Findhospital.png");
		 * c2LogOut = new JButton(c2Lout);
		 * c2LogOut.setBounds(1220, 50, 34, 30);
		 * c2LogOut.setBackground(Color.WHITE);
		 * c2LogOut.addActionListener(this);
		 * c2Panel.add(c2LogOut);
		 * 
		 * c2image2 = new ImageIcon("Findhospital.png");
		 * c2ImgLabel2 = new JLabel(c2image2);
		 * c2ImgLabel2.setBounds(0, 210, 600, 600);
		 * c2Panel.add(c2ImgLabel2);
		 * 
		 * c2image = new ImageIcon("3.jpeg");
		 * c2ImgLabel1 = new JLabel(c2image);
		 * c2ImgLabel1.setBounds(0, 0, 1270, 710);
		 * c2Panel.add(c2ImgLabel1);
		 */

		// this.add(c2Panel);
		// c1image2 = new ImageIcon("O.png");
		// c1ImgLabel = new JLabel(c1image2);
		//// c1ImgLabel.setBounds(0, 0, 800, 600);
		// c2Panel.add(c1ImgLabel);

		/*
		 * image1 = new ImageIcon("patientlogin.png");
		 * imgLabel1 = new JLabel(image1);
		 * imgLabel1.setBounds(0, 0, 1270, 710);
		 * panel1.add(imgLabel1);
		 */







		
		
	/*
		frameImage = new JLabel("");
		Image frameimg = new ImageIcon(this.getClass().getResource("Patientoption.png ")).getImage();
		frameImage.setIcon(new ImageIcon(frameimg));
		frameImage.setBounds(0, -2, 800, 600);
		this.add(frameImage);*/
		this.add(c2Panel);


		

		c2BackBtn.requestFocusInWindow();
		

	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == c2ExitBtn) {
			c2ExitBtn.setBackground(Color.WHITE);
			c2ExitBtn.setForeground(new Color(135,206,250));
		} else if (me.getSource() == c2BackBtn) {
			c2BackBtn.setBackground(Color.WHITE);
			c2BackBtn.setForeground(new Color(169, 0, 0));
		}
	}

	public void mouseExited(MouseEvent me) {
		if (me.getSource() == c2ExitBtn) {
			c2ExitBtn.setForeground(Color.WHITE);
			c2ExitBtn.setBackground(new Color(135,206,250));
		} else if (me.getSource() == c2BackBtn) {
			c2BackBtn.setForeground(Color.WHITE);
			c2BackBtn.setBackground(new Color(135,206,250));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e2) {

		String command = e2.getActionCommand();

		if (c2BackBtn.getText().equals(command)) {
			Plog c3 = new Plog();
			c3.setVisible(true);
			this.setVisible(false);
		}

		if (e2.getSource() == c2pack2) {
			DefPackTypes a1 = new DefPackTypes();
			a1.setVisible(true);
			this.setVisible(false);
		}

		// BMR Calculator

		if (e2.getSource() == c2Bmr) {
			BMRcalculator a5 = new BMRcalculator();
			a5.setVisible(true);
			this.setVisible(false);
		}

		// Emergency Contacts

		else if (e2.getSource() == c2contacts) {
			Emergency e1 = new Emergency();
			e1.setVisible(true);
			this.setVisible(false);
		}

		else if (e2.getSource() == c2bmi) {

			BmiCalculator a = new BmiCalculator();

			a.setVisible(true);

			this.setVisible(false);
		}
		// E medicine

		else if (e2.getSource() == c2Med) {

			Disease m = new Disease();

			m.setVisible(true);

			this.setVisible(false);
		}

		else if (e2.getSource() == c2bloodB) {
			needblood a2 = new needblood();

			// a2.setVisible(true);

			this.setVisible(false);

		}

		else if (c2ExitBtn.getText().equals(command)) {
			System.exit(0);
		}
	}
}