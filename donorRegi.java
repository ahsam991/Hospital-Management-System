import javax.swing.*;
import Classes.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class donorRegi extends JFrame //implements ActionListener
{
    ImageIcon icon;
    JLabel username, address,Phonenum,bloodgroup, loginMsg, accountType, frameImage,background;
    JPanel leftPanel;
    JButton loginButton, resetButton;
    JRadioButton rButton1, rButton2;
    ButtonGroup bg;
    JTextField usernameField,useraddress,userphonenum;
    JPasswordField userPasswordField;
    Font font;
    
  
    
    public donorRegi()
    {
        font = new Font("System", Font.BOLD, 23);

        this.setTitle("Hospital Management System");
        this.setSize(980, 620);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // icon = new ImageIcon("Login3.png");
       // this.setIconImage(icon.getImage());


        this.getContentPane().setBackground(Color.decode("#23b2a7"));



        leftPanel = new JPanel();
        leftPanel.setBounds(0,-30, 480, 600);


        leftPanel.setBackground(Color.decode("#17776f"));



        this.add(leftPanel);
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Login3.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 480, 600);
        leftPanel.add(frameImage);

       


        username = new JLabel("Username:");
        username.setBounds(502, 190, 247, 32);
        username.setForeground(Color.BLACK);
        username.setFont(font);
        this.add(username);

      address= new JLabel("Adress:");
        address.setBounds(502, 230, 247, 32);
       address.setForeground(Color.BLACK);
       address.setFont(font);
        this.add(address);
		
		 Phonenum= new JLabel("Phone num:");
       Phonenum.setBounds(502, 270, 247, 32);
      Phonenum.setForeground(Color.BLACK);
       Phonenum.setFont(font);
        this.add(Phonenum);
		
		
		 bloodgroup= new JLabel( "bloodgroup:");
      bloodgroup.setBounds(502, 370, 247, 32);
      bloodgroup.setForeground(Color.BLACK);
        bloodgroup.setFont(font);
        this.add(bloodgroup);
		
		
        loginMsg = new JLabel();
        loginMsg.setBounds(635, 400, 450, 32);
        loginMsg.setForeground(Color.BLACK);
        loginMsg.setFont(new Font("System", Font.BOLD, 18));
        this.add(loginMsg);

        usernameField = new JTextField();
        usernameField.setBounds(635, 194, 284, 30);
        usernameField.setFont(font);
        this.add(usernameField);
        
        useraddress = new JPasswordField();
       useraddress.setBounds(636, 263, 284, 30);
       useraddress.setFont(font);
        this.add(useraddress);
		
		
		 userphonenum = new JPasswordField();
       userphonenum.setBounds(636, 350, 284, 30);
       userphonenum.setFont(font);
        this.add(userphonenum);
		

      /*  loginButton = new JButton("Log In");
        loginButton.setBounds(645, 320, 80, 30);
        loginButton.setBackground(Color.decode("#CCD4BF"));
        loginButton.setFont(new Font("System", Font.BOLD, 15));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        this.add(loginButton);*/
        
        resetButton = new JButton("Back");
        resetButton.setBounds(820,320, 80, 30);


        resetButton.setBackground(Color.decode("#CCD4BF"));


        resetButton.setFont(new Font("System", Font.BOLD, 15));
        resetButton.setFocusable(false);
      //  resetButton.addActionListener(this);
        this.add(resetButton);
    }

 /*   public void actionPerformed(ActionEvent e)
    {
		if(e.getSource() == resetButton){
			
		 needblood nb = new needblood();
            nb.setVisible(true);
	this.setVisible(false);}
	*/
			
			 public static void main(String[] args) {
     
      hospital1 frame = new hospital1();
      frame.setVisible(true);
      }
/*if(e.getSource() == resetButton)
        {
            usernameField.setText(null);
            userPasswordField.setText(null);
            loginMsg.setText(null);
        }*/
		
	}
