import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Disease extends JFrame implements ActionListener {

	JLabel l1;
	Font f1, f2;
	JComboBox c1;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, b9pay, back;
	JButton c2ExitBtn, c2BackBtn;
	JPanel c2Panel;
	ImageIcon ii;
	ImageIcon c2Icon, c2image;
	JCheckBox term;
	JCheckBox term2;

	public Disease() {
		c2Panel = new JPanel();
		c2Panel.setLayout(null);

		ImageIcon iconbutton1 = new ImageIcon("09.png");
		ImageIcon iconbutton2 = new ImageIcon("002.png");
		ImageIcon iconbutton3 = new ImageIcon("003.png");
		ImageIcon iconbutton4 = new ImageIcon("004.png");
		ImageIcon iconbutton5 = new ImageIcon("05.png");
		ImageIcon iconbutton6 = new ImageIcon("005.png");
		ImageIcon iconbutton7 = new ImageIcon("06.png");
		ImageIcon iconbutton8 = new ImageIcon("07.png");
		ImageIcon iconb9pay = new ImageIcon("001.png");

		l1 = new JLabel("Select Disease :");
		l1.setBounds(75, 50, 200, 20);
		add(l1);

		f1 = new Font("Lucida Fax", Font.BOLD, 25);
		f2 = new Font("MS UI Gothic", Font.BOLD, 15);
		l1.setFont(f2);

		String items2[] = { "Diabetes", "Rheumatic fever", "Tuberculosis" };
		c1 = new JComboBox(items2);
		c1.setBounds(200, 50, 200, 20);
		add(c1);

		button1 = new JButton(iconbutton1);
		button1.setBounds(75, 120, 128, 128);
		button1.addActionListener(this);
		add(button1);

		button2 = new JButton(iconbutton2);
		button2.setBounds(240, 120, 128, 128);
		button2.addActionListener(this);
		add(button2);

		button3 = new JButton(iconbutton3);
		button3.setBounds(405, 120, 128, 128);
		button3.addActionListener(this);
		add(button3);

		button4 = new JButton(iconbutton4);
		button4.setBounds(570, 120, 128, 128);
		button4.addActionListener(this);
		add(button4);

		button5 = new JButton(iconbutton5);
		button5.setBounds(75, 310, 128, 128);
		button5.addActionListener(this);
		add(button5);

		button6 = new JButton(iconbutton6);
		button6.setBounds(240, 310, 128, 128);
		button6.addActionListener(this);
		add(button6);

		button7 = new JButton(iconbutton7);
		button7.setBounds(405, 310, 128, 128);
		button7.addActionListener(this);
		add(button7);

		button8 = new JButton(iconbutton8);
		button8.setBounds(570, 310, 128, 128);
		button8.addActionListener(this);
		add(button8);

		b9pay = new JButton(iconb9pay);
		b9pay.setBounds(570, 475, 128, 40);
		b9pay.addActionListener(this);
		add(b9pay);

		// c2BackBtn = new JButton("Back");
		// c2BackBtn.setBounds(20, 400, 100, 30);
		// c2BackBtn.setForeground(Color.WHITE);
		// c2BackBtn.setBackground(new Color(137, 207, 240));
		// c2BackBtn.addActionListener(this);
		// // c2BackBtn.addMouseListener(this);
		// c2Panel.add(c2BackBtn);


		button9 = new JButton("Back");
		button9.setBounds(100, 475, 100, 30);
		button9.addActionListener(this);
		add(button9);


		term = new JCheckBox("Box 1");
        term.setFont(new Font("Arial", Font.PLAIN, 17));
        term.setSize(260, 20);
        term.setLocation(75, 80);
        add(term);


        term2 = new JCheckBox("Box 2");
        term2.setFont(new Font("Arial", Font.PLAIN, 17));
        term2.setBounds(150, 80, 260, 20);
        add(term2);


		setLayout(null);

		setVisible(true);
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		setTitle("Buying Medicine");

	}

	public void actionPerformed(ActionEvent e2) {

		// String command = e2.getActionCommand();

		if (e2.getSource() == button9) {
			Pbutton1 c3 = new Pbutton1();
			c3.setVisible(true);
			this.setVisible(false);

			// System.exit(0);

		} else if (e2.getSource() == b9pay) {
			Payment c4 = new Payment();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e2.getSource() == button1){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		else if(e2.getSource() == button2){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		else if(e2.getSource() == button3){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		else if(e2.getSource() == button4){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		else if(e2.getSource() == button5){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		else if(e2.getSource() == button6){
			JOptionPane.showMessageDialog(null, "You have confirmed your order", "Fees 600",
                                JOptionPane.WARNING_MESSAGE);
		}
		
		
		
	}
	
}

// public static void main(String args[]) {
// new Disease().setVisible(true);
//
