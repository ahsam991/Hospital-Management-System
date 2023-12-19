import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;

public class BmiCalculator extends JFrame implements ActionListener {
    JLabel l, l1, l2, l3, l4, l5,frameImage;
    JButton b1, b2,exit;
    JTextField t1, t2, t3;
    Font f1, f2;
    ImageIcon ii;

    // Bmi

    public BmiCalculator() {

        l1 = new JLabel("BMI Calculator");
        l1.setForeground(new Color(45,35,99));
        l2 = new JLabel("Weight(kg) :");
		l2.setForeground(new Color(45,35,99));
        l3 = new JLabel("Height(m) :");
		l3.setForeground(new Color(45,35,99));
        l4 = new JLabel("Result :");
		l4.setForeground(new Color(45,35,99));
        l5 = new JLabel();

        //ii = new ImageIcon("Employee.png");
		

        l = new JLabel(ii);

        add(l);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Calculate");
        b2 = new JButton("Back");
		exit = new JButton ("Exit");

        setLayout(null);

        f1 = new Font("Lucida Fax", Font.BOLD, 20);
        f2 = new Font("Old Century", Font.BOLD, 25);
        l1.setBounds(300, 30, 200, 30);

        l2.setBounds(100, 150, 200, 30);
        l3.setBounds(100, 250, 200, 30);
        l4.setBounds(100, 350, 200, 30);
        l.setBounds(450, 50, 300, 400);
        l5.setBounds(500, 450, 200, 30);

        t1.setBounds(250, 150, 200, 30);
        t2.setBounds(250, 250, 200, 30);
        t3.setBounds(250, 350, 200, 30);

        b1.setBounds(280, 500, 100, 30);
        b2.setBounds(50, 500, 100, 30);
		exit.setBounds(600, 500, 100, 30);
		

        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
		add(exit);

        setVisible(true);
        setSize(800, 600);
        setTitle("BMI");

        b1.addActionListener(this);
        b2.addActionListener(this);
		exit.addActionListener(this);
		
		
		frameImage = new JLabel("");
		Image frameimg = new ImageIcon(this.getClass().getResource("weightscale.gif")).getImage();
		frameImage.setIcon(new ImageIcon(frameimg));
		
		frameImage.setBounds(0, 0, 800, 600);
		this.setLocationRelativeTo(null);
		this.add(frameImage);

    }

    public void actionPerformed(ActionEvent e) {
        
		
		if (e.getSource() == b1)
		{
		double w = Double.parseDouble(t1.getText());
        double h = Double.parseDouble(t2.getText());
        double bmi = w / (h * h);
        String cal = String.format("%.2f", bmi);
        t3.setText(cal + " " + "kg/m2");
		String command = e.getActionCommand();
		
        if (bmi <= 18.5) {
            t3.setOpaque(true);
            // t3.setForeground(Color.BLUE);
            l5.setForeground(Color.RED);
            l5.setText("Under Weight");
        } else if (bmi <= 24.5) {
            t3.setOpaque(true);
            // t3.setForeground(Color.GREEN);
            l5.setForeground(Color.GREEN);
            l5.setText("Normal Weight");
        } else if (bmi <= 29.5) {
            t3.setOpaque(true);
            // t3.setForeground(Color.ORANGE);
            l5.setForeground(Color.RED);
            l5.setText("OverWeight");
        } else if (bmi >= 30) {
            t3.setOpaque(true);
            // t3.setForeground(Color.RED);
            l5.setForeground(Color.RED);
            l5.setText("Obese");
        } 
		
		}
		 else if (e.getSource() == b2) {
            Pbutton1 c1 = new Pbutton1();
            c1.setVisible(true);
            this.setVisible(false);
        }
		 else if (e.getSource()==exit)
		{
			System.exit(0);
		}
		

    }
}
	/*public void actionPerformed(ActionEvent e1) {
		if (e1.getSource() == b2) {
            Pbutton1 x1 = new Pbutton1();
            x1.setVisible(true);
            this.setVisible(false);
        }*/
		
		
		

