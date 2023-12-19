import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Payment extends JFrame  {//implements ActionListener {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel, frameImage;
    private Font f1, f2, f3, f4, f5, f6;
    private ImageIcon logo, img1, img2;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
    private JButton btn1,  btn3, nBtn;//btn2,
    private Cursor cursor;

    Payment() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hospital Manegement");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        /*
         * icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
         * this.setIconImage(icon.getImage());
         * 
         * // Logo and Images
         * logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
         * imgLabel = new JLabel(logo);
         * imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
         * c.add(imgLabel);
         * 
         * img1 = new ImageIcon(getClass().getResource("VisaCard.png"));
         * imgLabel = new JLabel(img1);
         * imgLabel.setBounds(620, 90, img1.getIconWidth(), img1.getIconHeight());
         * c.add(imgLabel);
         * 
         * img2 = new ImageIcon(getClass().getResource("MasterCard.png"));
         * imgLabel = new JLabel(img2);
         * imgLabel.setBounds(705, 90, img2.getIconWidth(), img2.getIconHeight());
         * c.add(imgLabel);
         */

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        /*
         * label1 = new JLabel();
         * label1.setText("Complete Your Payment");
         * label1.setBounds(400, 20, 500, 50);
         * label1.setFont(f1);
         * c.add(label1);
         */
        label2 = new JLabel("We Accept Card");
        label2.setBounds(390, 90, 500, 50);
        label2.setFont(f2);
        c.add(label2);

        label2 = new JLabel("Card Details");
        label2.setBounds(390, 140, 500, 50);
        label2.setFont(f2);
        c.add(label2);

        // Name On Card
        label3 = new JLabel("Name On Card");
        label3.setBounds(390, 180, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(540, 190, 235, 30);
        tf1.setFont(f4);
        c.add(tf1);

        // Card Number
        label3 = new JLabel("Card Number");
        label3.setBounds(390, 220, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(540, 230, 235, 30);
        tf2.setFont(f4);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        // Valid On
        label3 = new JLabel("Valid On");
        label3.setBounds(390, 260, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        tf3 = new JTextField();
        tf3.setBounds(475, 270, 90, 30);
        tf3.setFont(f4);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf3);

        // CVV Code
        label3 = new JLabel("CVV Code");
        label3.setBounds(590, 260, 500, 50);
        label3.setFont(f3);
        c.add(label3);

        pf = new JPasswordField();
        pf.setBounds(695, 270, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
        pf.setFont(f5);
        c.add(pf);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(40, 500, 130, 30);
        btn1.setFont(f6);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

       
	   /*
	   btn2 = new JButton("Back");
       btn2.setBounds(250, 500, 130, 30);
        btn2.setFont(f6);
       btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.addActionListener(c);
        btn2.setEnabled(false);
        c.add(btn2);*/

        btn3 = new JButton("Confirm Payment");
        btn3.setBounds(450, 500, 300, 30);
        btn3.setFont(f6);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Image
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("C Kash.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 800, 600);

        // icon = new ImageIcon("Adminlogin.png");

        // this.add(RightPanel);
        this.add(frameImage);

        // To limit characters
        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf1.getText().length() >= 10)
                    e.consume();
            }
        });

        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf2.getText().length() >= 19)
                    e.consume();
            }
        });

        tf3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf3.getText().length() >= 7)
                    e.consume();
            }
        });

        pf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pf.getText().length() >= 3)
                    e.consume();
            }
        });

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
/*
        // BackButton
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                DefPackTypes frame = new DefPackTypes();
                frame.setVisible(true);
                setVisible(false);
            }
        });*/

        /*
         * btn2.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent ae) {
         * setVisible(false);
         * DomPlaces frame = new DomPlaces();
         * frame.setVisible(true);
         * }
         * });
         */

        // Confirm Payment Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = tf1.getText();
                String cardNumber = tf2.getText();
                String validOn = tf3.getText();
                String cvvCode = pf.getText();

                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaySuccess frame = new PaySuccess();
                    frame.setVisible(true);
                }
            }
        });
    }

}
