import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Mirpur extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel, frameImage;
    private Font f1, f2, f3, f4, f5;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private ButtonGroup radioButtonGroup;
    private JRadioButton pack1, pack2, pack3;
    private int selected = 0;

    Mirpur() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CHOOSE YOUR ROOM PACK");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        // icon = new ImageIcon(getClass().getResource("UnitedHospital.png"));
        // this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 25);
        f4 = new Font("Segoe UI", Font.PLAIN, 20);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Logo
        // logo = new ImageIcon(getClass().getResource("UnitedHospital.png"));
        // imgLabel = new JLabel(logo);
        // imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        // c.add(imgLabel);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("3 Packs Available for ");
        label1.setBounds(95, 35, 600, 50);
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel();
        label2.setText("Service! Select One : ");
        label2.setBounds(95, 70, 500, 50);
        label2.setFont(f1);
        c.add(label2);

        // Pack 1 Details
        pack1 = new JRadioButton("Pack 1");
        pack1.setBounds(45, 170, 130, 30);
        pack1.setFont(f3);
        pack1.setBackground(Color.decode("#F2F2F2"));
        c.add(pack1);

        label3 = new JLabel();
        label3.setText("* First Class");
        label3.setBounds(45, 200, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Platinum");
        label3.setBounds(45, 240, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Attached washroom");
        label3.setBounds(45, 265, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* *TV and AC");
        label3.setBounds(45, 300, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 6 Days");
        label3.setBounds(45, 330, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $2800");
        label3.setBounds(45, 350, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 2 Details
        pack2 = new JRadioButton("Pack 2");
        pack2.setBounds(300, 150, 130, 30);
        pack2.setFont(f3);
        // pack2.setBackground(Color.decode("#F2F2F2"));
        c.add(pack2);

        label3 = new JLabel();
        label3.setText("* Second Class");
        label3.setBounds(300, 180, 120, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Gold");
        label3.setBounds(300, 210, 80, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Own Transport");
        label3.setBounds(300, 240, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Attached washroom");
        label3.setBounds(300, 270, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Days");
        label3.setBounds(300, 300, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1000");
        label3.setBounds(300, 330, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 3 Details
        pack3 = new JRadioButton("Pack 3");
        pack3.setBounds(560, 120, 130, 30);
        pack3.setFont(f3);
        // pack3.setBackground(Color.decode("#F2F2F2"));
        c.add(pack3);

        label3 = new JLabel();
        label3.setText("* General");
        label3.setBounds(560, 150, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("*Small Room");
        label3.setBounds(560, 180, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("*Own Transport");
        label3.setBounds(560, 210, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 2 Persons(Share)");
        label3.setBounds(560, 240, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 3 Days");
        label3.setBounds(560, 270, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $800");
        label3.setBounds(560, 300, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(pack1);
        radioButtonGroup.add(pack2);
        radioButtonGroup.add(pack3);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(50, 515, 120, 30);
        btn1.setFont(f5);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(280, 490, 120, 30);
        btn2.setFont(f5);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(555, 465, 120, 30);
        btn3.setFont(f5);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Images
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("4.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -10, 800, 600);

        // icon = new ImageIcon("Adminlogin.png");

        // this.add(RightPanel);
        this.add(frameImage);

        Handler handler = new Handler();
        pack1.addActionListener(handler);
        pack2.addActionListener(handler);
        pack3.addActionListener(handler);

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
                setVisible(false);
                DomPlaces frame = new DomPlaces();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (selected == 0) {
                    JOptionPane.showMessageDialog(null, "You did not select any packs.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    Payment frame = new Payment();
                    frame.setVisible(true);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == pack1) {
                selected = 1;
            } else if (e.getSource() == pack2) {
                selected = 2;
            } else if (e.getSource() == pack3) {
                selected = 3;
            }
        }
    }
    /*
     * public static void main(String[] args) {
     * 
     * Mirpur frame = new Mirpur();
     * frame.setVisible(true);
     * }
     */
}
