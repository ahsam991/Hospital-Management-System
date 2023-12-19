import java.util.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements MouseListener, ActionListener

{

    ImageIcon icon, c1image1;
    Font font, font1;
    JButton patientBtn, adminBtn, eb;
    JPanel CenterPanel; // JPanel leftPanel, rightPanel;
    JLabel frameImage, c1ImgLabel1, Image,SCALE_SMOOTH;
    JPanel panel1;

    public Welcome() {
        this.setTitle("Welcome To My Health App");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setVisible(true);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.white);

        // icon = new ImageIcon("Homepage.jpg");
        // setIconImage(icon.getImage());

        // font = new Font("Times New Roman", Font.BOLD, 16);
        font1 = new Font("Times New Roman", Font.BOLD, 23);

        patientBtn = new JButton("VISIT");
        patientBtn.setFont(font1);
        patientBtn.setBounds(80, 450, 230, 40);
        patientBtn.setBackground(new Color(234, 248, 255));
        patientBtn.setOpaque(true);
        patientBtn.setForeground(Color.BLACK);
        patientBtn.addActionListener(this);
        patientBtn.addMouseListener(this);
        panel1.add(patientBtn);

        eb = new JButton("EXIT");
        eb.setFont(font1);
        eb.setBounds(400, 450, 230, 40);
        eb.setBackground(new Color(234, 248, 255));
        eb.setOpaque(true);
        eb.setForeground(Color.BLACK);
        eb.addActionListener(this);
        eb.addMouseListener(this);
        panel1.add(eb);

         c1image1 = new ImageIcon("Welcome.gif");
         c1ImgLabel1 = new JLabel(c1image1);
         c1ImgLabel1.setBounds(0, 0, 800, 600);
         panel1.add(c1ImgLabel1);
         this.add(panel1);

        // Image Part
       // ImageIcon image = new ImageIcon("Welcome.gif");
       // Image GetImage = image.getImage();
       // Image scaledImage = GetImage.getScaledInstance(800, 600 ,500);//Image.SCALE_SMOOTH);
       // image = new ImageIcon(scaledImage);
       // panel1.add(Image);
       // this.add(panel1);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == patientBtn) {

            HomePage p = new HomePage();
            p.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getSource() == eb) {
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
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == patientBtn) {
            patientBtn.setBackground(new Color(136, 186, 236));
            patientBtn.setForeground(Color.WHITE);
        } else if (me.getSource() == eb) {
            eb.setBackground(new Color(136, 186, 236));
            eb.setForeground(Color.WHITE);
        }

        else {

        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == patientBtn) {
            patientBtn.setBackground(new Color(234, 248, 255));
            patientBtn.setForeground(Color.BLACK);
        } else if (me.getSource() == eb) {
            eb.setBackground(new Color(234, 248, 255));
            eb.setForeground(Color.BLACK);
        }

        else {

        }
    }

}