import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CreatePatientProfile extends JFrame implements ActionListener{

    private JLabel userLabel,idLabel,passLabel,textLabel;
    private JTextField tf ,idf;
    private JPasswordField pf;
    private JButton LoginButton,back,exit;
  //  private Container c;
    private Font f;
	File myFile,listFile;
	FileWriter filewriter;
	String name;
  //  private JPanel topPanel;

   
	
	CreatePatientProfile()
    {  
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(1000,800);
        this.setBounds(400, 150, 1000, 800);
        this.setTitle("Create Patient Profile");
        this.setLayout(null);
        this.setBackground(new Color(135, 206, 235));

        f = new Font("Arial Rounded MT Bold", 0, 18);


     /*    topPanel = new JPanel();
        topPanel.setBounds(0,0,1000,100);
        topPanel.setBackground(new Color(225,225,225));
        topPanel.setLayout(null);
        this.add(topPanel); */

       /* ImageIcon icon =new ImageIcon("Image/gui.jpg");
        frameImage = new JLabel(icon);
        frameImage.setBounds(0,400,280,400);
       topPanel.add(frameImage);
        this.add(topPanel);*/


        userLabel = new JLabel("Username: ");
        userLabel.setBounds(400,300,150,50);
         userLabel.setForeground(new Color(0, 142, 201));
        userLabel.setFont(f);
        this.add(userLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(550,300 ,300 , 50);
        tf.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
       
        tf.setForeground(new Color(0,0,51));
        this.add(tf);

        textLabel=new JLabel("FILL THE INFROMATION TO CREATE AN ACCOUNT");
        textLabel.setBounds(200,200,1000,50);
        textLabel.setForeground(new Color(0,142,201));
        textLabel.setFont(new Font("Serif", Font.BOLD, 24));
        this.add(textLabel);

        idLabel = new JLabel("User ID : ");
        idLabel.setBounds(400,370,150,50);
        idLabel.setForeground(new Color(0, 142, 201));
        idLabel.setFont(f);
        this.add(idLabel);

        
        idf = new JTextField();
        idf.setFont(f);
        idf.setBounds(550,370 ,300 , 50);
        this.add(idf);



        passLabel = new JLabel("Password: ");
        passLabel.setBounds(400,440,150,50);
        passLabel.setForeground(new Color(0, 142, 201));
        passLabel.setFont(f);
        this.add(passLabel);

        pf = new JPasswordField();
        pf.setFont(f);
        pf.setEchoChar('*');
        pf.setBounds(550,440, 300, 50);
        this.add(pf);


        back = new JButton("BACK");
        back.setFont(f);
        back.setBounds(450, 600, 120, 50);
        back.addActionListener(this);
        this.add(back);

        LoginButton = new JButton("SIGN UP");
        LoginButton.setFont(f);
        LoginButton.setBounds( 580,600, 120, 50);
        LoginButton.addActionListener(this);
        this.add(LoginButton);

        exit = new JButton("EXIT");
        exit.setFont(f);
        exit.setBounds(710, 600, 120, 50);
        exit.addActionListener(this);
        this.add(exit);
     
    }



    public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();	
		
			name = idf.getText();
			//create
		if(ae.getSource() == LoginButton){
		 	myFile = new File(name+".txt");
            listFile = new File("List.txt");

			try {
			
			myFile.createNewFile();
            listFile.createNewFile();

			
		} catch (Exception e) {
			System.out.println("Unable to create file");
			e.printStackTrace();
		}
  
		
		 //write
			try{
                name = idf.getText();
				
				
				filewriter = new FileWriter(name+".txt");
				filewriter.write(tf.getText()+" ");
                filewriter.write(pf.getText()+" ");
				filewriter.write(idf.getText()+"\n");
				filewriter.flush();
				filewriter.close();
				
                filewriter = new FileWriter("List.txt",true);
                filewriter.write(tf.getText()+",");
                filewriter.write(idf.getText()+",");
                filewriter.write(pf.getText()+"\n");
    
                filewriter.flush();
                filewriter.close();
                
				
			}catch(IOException e){
			
                JOptionPane.showMessageDialog(null,e+"");
				
				
			}
            
            dispose();
            Loginbutton loginpage = new Loginbutton();
            loginpage.setVisible(true);
            this.setVisible(false);
			
		}
        else if(ae.getSource() == back)
		{
			 
			patientLogin hp = new patientLogin();
			hp.setVisible(true);
			this.setVisible(false); 
		}

		else if(ae.getSource()==exit)
		{
			System.exit(0);
		}
    }

	
/* 	 public static void main(String[] args)
	{
		
		CreateStudentProfile ab = new CreateStudentProfile();
	}   */
    
}


