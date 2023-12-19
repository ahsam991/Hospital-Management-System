import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DefPackTypes extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel,frameImage;
	private JPanel CenterPanel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton inter, big;
    private ButtonGroup radioButtonGroup;
    private int defPack = 0;

    DefPackTypes() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("choose hospital type ");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon

      /*  icon = new ImageIcon(getClass().getResource("Typeshop.jpg"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("Typeshop.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);*/
		
		
		

        // RightPanel =new JPanel();
        // RightPanel.setBounds(450,150,500,250);
        // RightPanel.setBackground(Color.decode("#CCE2CB"));
        // this.getContentPane().setBackground(Color.decode("#23b2a7"));

        // leftPanel.setBackground(Color.decode("#17776f"));

        
		
		// Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose Hospital  Type");
        label1.setBounds(100, 70, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // International Radio Button
        inter = new JRadioButton("PRIVATE");
        inter.setBounds(270, 200, 300, 50);
        inter.setFont(f2);
        inter.setCursor(cursor);
        inter.setBackground(Color.decode("#F2F2F2"));
        c.add(inter);

        // Domestic Radio Button
        big = new JRadioButton("GOVERNMENT");
        big.setBounds(270, 270, 300, 50);
        big.setFont(f2);
        big.setCursor(cursor);
        big.setBackground(Color.decode("#F2F2F2"));
        c.add(big);

        // To group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(inter);
        radioButtonGroup.add(big);

        // Jbuttons
        btn1 = new JButton("Exit");
        btn1.setBounds(60, 500, 215, 50);
        btn1.setFont(f3);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(300, 500, 215, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(540, 500, 215, 50);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
		
		//panel color 
		
		// CenterPanel = new JPanel();
        //CenterPanel.setBounds(230, 180, 400, 200);
		//CenterPanel.setBackground(Color.decode("#CCE2CB"));
		//c.add(CenterPanel);
		

        Handler handler = new Handler();
        inter.addActionListener(handler);
        big.addActionListener(handler);

        // Images
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("HospitalType.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, 0, 980, 600);

        // icon = new ImageIcon("Adminlogin.png");

        // this.add(RightPanel);
        this.add(frameImage);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Pbutton1 frame = new Pbutton1();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                    PRIVHOP frame = new PRIVHOP();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else if (defPack == 2) {
                    DomPlaces frame = new DomPlaces();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select hospital type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == inter) {
                defPack = 1;
            } else if (e.getSource() == big) {
                defPack = 2;
            }
        }
    }

    /*
     * public static void main(String[] args) {
     * 
     * DefPackTypes frame = new DefPackTypes();
     * frame.setVisible(true);
     * }
     */
}