import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PRIVHOP extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel,frameImage;
	private JPanel CenterPanel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton HOP1, HOP2, HOP3, HOP4, HOP5;
    private ButtonGroup jButtonGroup;
    private int HOP = 0;

    PRIVHOP() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("private HOSPITAL");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
       c.setLayout(null);
       // c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        /*
         * icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
         * this.setIconImage(icon.getImage());
         * 
         * // Logo
         * logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
         * imgLabel = new JLabel(logo);
         * imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
         * c.add(imgLabel);
         */

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Which hospital Would");
        label1.setBounds(170, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("You Like to Visit?");
        label1.setBounds(170, 60, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // HOP JButtons
        HOP1 = new JRadioButton("United Hospital");
        HOP1.setBounds(300, 200, 250, 50);
        HOP1.setFont(f2);
        //HOP1.setBackground(Color.decode("#F2F2F2"));
        HOP1.setCursor(cursor);
        c.add(HOP1);

        HOP2 = new JRadioButton("City Hospital");
        HOP2.setBounds(300, 240, 250, 50);
        HOP2.setFont(f2);
        //HOP2.setBackground(Color.decode("#F2F2F2"));
        HOP2.setCursor(cursor);
        c.add(HOP2);

        HOP3 = new JRadioButton("Anwar khan medical");
        HOP3.setBounds(300, 280, 250, 50);
        HOP3.setFont(f2);
        //HOP3.setBackground(Color.decode("#F2F2F2"));
        HOP3.setCursor(cursor);
        c.add(HOP3);

        HOP4 = new JRadioButton("Evercare hospital");
        HOP4.setBounds(300, 320, 250, 50);
        HOP4.setFont(f2);
        //HOP4.setBackground(Color.decode("#F2F2F2"));
        HOP4.setCursor(cursor);
        c.add(HOP4);

        HOP5 = new JRadioButton("IBN SINA ");
        HOP5.setBounds(300, 360, 250, 50);
        HOP5.setFont(f2);
        //HOP5.setBackground(Color.decode("#F2F2F2"));
        HOP5.setCursor(cursor);
        c.add(HOP5);

        // To Group JButtons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(HOP1);
        jButtonGroup.add(HOP2);
        jButtonGroup.add(HOP3);
        jButtonGroup.add(HOP4);
        jButtonGroup.add(HOP5);

        btn1 = new JButton("Exit");
        btn1.setBounds(80, 500, 150, 50);
        btn1.setFont(f3);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(250, 500, 150, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(475, 500, 150, 50);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        HOP1.addActionListener(handler);
        HOP2.addActionListener(handler);
        HOP3.addActionListener(handler);
        HOP4.addActionListener(handler);
        HOP5.addActionListener(handler);
		
			frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Location2.gif")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 980, 600);

       

        // this.add(RightPanel);
        this.add(frameImage);
		
		
		

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                DefPackTypes frame = new DefPackTypes();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (HOP == 1) {
                    setVisible(false);
                    hospital1 frame = new hospital1();
                    frame.setVisible(true);
                } else if (HOP == 2) {
                    setVisible(false);
                    hospital2 frame = new hospital2();
                    frame.setVisible(true);
                } else if (HOP == 3) {
                    setVisible(false);
                    hospital3 frame = new hospital3();
                    frame.setVisible(true);
                } else if (HOP == 4) {
                    setVisible(false);
                    hospital4 frame = new hospital4();
                    frame.setVisible(true);
                } else if (HOP == 5) {
                    setVisible(false);
                    hospital5 frame = new hospital5();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select country.", "Warming!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
	
	


    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == HOP1) {
                HOP = 1;
            } else if (e.getSource() == HOP2) {
                HOP = 2;
            } else if (e.getSource() == HOP3) {
                HOP = 3;
            } else if (e.getSource() == HOP4) {
                HOP = 4;
            } else if (e.getSource() == HOP5) {
                HOP = 5;
            }
        }
    }
    /*
     * public static void main(String[] args) {
     * 
     * PRIVHOP frame = new PRIVHOP();
     * frame.setVisible(true);
     * }
     */
}
