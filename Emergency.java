import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Emergency extends JFrame implements ActionListener
{

  private Container c;
  // private ImageIcon icon;
  private JLabel label1, label2; // label3, imgLabel;
  private Font f1, f2, f3, f4, f5;
  // private ImageIcon logo;
  private JButton btn1, btn2; // btn3, nBtn;
  private Cursor cursor;
  // private ButtonGroup radioButtonGroup;
  //// private JRadioButton pack1, pack2, pack3;
  // private int selected = 0;

  Emergency() {
    // Frame Layout
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("At your worst");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setResizable(false);

    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#F2F2F2"));

    // Icon
    // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
    // this.setIconImage(icon.getImage());

    // Fonts
    f1 = new Font("Segoe UI Black", Font.PLAIN, 25);
    f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
    f3 = new Font("Segoe UI", Font.PLAIN, 18);
    f4 = new Font("Segoe UI", Font.PLAIN, 20);
    f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

    // Logo
    // logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
    // imgLabel = new JLabel(logo);
    // imgLabel.setBounds(30, 82, logo.getIconWidth(), logo.getIconHeight());
    // c.add(imgLabel);

    // Cursor for JButtons and Radio Buttons
    cursor = new Cursor(Cursor.HAND_CURSOR);

    // Title
    label1 = new JLabel();
    label1.setText("AMBULANCE CONTACTS :");
    label1.setBounds(80, 35, 600, 50);
    label1.setFont(f1);
    c.add(label1);

    label2 = new JLabel();
    label2.setText("1.01714325325 ");
    label2.setBounds(80, 70, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("2.01993800900 ");
    label2.setBounds(80, 100, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("3.01911125156 ");
    label2.setBounds(80, 130, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("........../////........... ");
    label2.setBounds(80, 160, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label1 = new JLabel();
    label1.setText("Hospital contacts:");
    label1.setBounds(80, 190, 600, 50);
    label1.setFont(f1);
    c.add(label1);

    label2 = new JLabel();
    label2.setText("1.Apollo hospital ");
    label2.setBounds(80, 220, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("**09865361837 ");
    label2.setBounds(150, 260, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("2.Evercare hospital: ");
    label2.setBounds(80, 300, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("**027257873812 ");
    label2.setBounds(150, 340, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label1 = new JLabel();
    label1.setText("Pharmesists num :");
    label1.setBounds(80, 370, 600, 50);
    label1.setFont(f1);
    c.add(label1);

    label2 = new JLabel();
    label2.setText("**027257873812 ");
    label2.setBounds(80, 390, 500, 50);
    label2.setFont(f3);
    c.add(label2);
    label2 = new JLabel();
    label2.setText("**027257873812 ");
    label2.setBounds(150, 410, 500, 50);
    label2.setFont(f3);
    c.add(label2);
    label2 = new JLabel();
    label2.setText("**027257873812 ");
    label2.setBounds(150, 430, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    label2 = new JLabel();
    label2.setText("**027257873812 ");
    label2.setBounds(150, 340, 500, 50);
    label2.setFont(f3);
    c.add(label2);

    btn1 = new JButton("Exit");
    btn1.setBounds(80, 500, 160, 30);
    btn1.setFont(f5);
    btn1.setCursor(cursor);
    btn1.setForeground(Color.WHITE);
    btn1.setBackground(Color.decode("#C00000"));
	btn1.addActionListener(this);
    c.add(btn1);

    btn2 = new JButton("Back");
    btn2.setBounds(269, 500, 160, 30);
    btn2.setFont(f5);
    btn2.setCursor(cursor);
    btn2.setForeground(Color.WHITE);
	
    btn2.setBackground(Color.decode("#2E75B6"));
	btn2.addActionListener(this);
    c.add(btn2);
	
  }





/*
  public void actionPerformed(ActionEvent e3) {

    String command = e3.getActionCommand();

    if (btn2.getText().equals(command)) {
      Pbutton1 f3 = new Pbutton1();
      f3.setVisible(true);
      this.setVisible(false);
    }

    else if (btn1.getText().equals(command)) {
      System.exit(0);
    }
  }
*/

//*************************




public void actionPerformed(ActionEvent e) {
        

         if (e.getSource() == btn2) {
            Pbutton1 hp = new Pbutton1();
            hp.setVisible(true);
            this.setVisible(false);
        }
		else if (e.getSource()==btn1)
		{
			System.exit(0);
		}
		
  

}
}












/*
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
    public static void main(String[] args) {

        Bashundhara frame = new Bashundhara();
        frame.setVisible(true);
    }
	*/

