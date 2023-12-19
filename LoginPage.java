import javax.swing.*;

import Classes.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class LoginPage extends JFrame implements ActionListener {
    ImageIcon icon;
    JLabel username, password, loginMsg, accountType, frameImage, background;
    JPanel CenterPanel; // JPanel RightPanel;
    JButton loginButton, resetButton, backButton;
    JRadioButton rButton1, rButton2;
    ButtonGroup bg;
    JTextField usernameField;
    JPasswordField userPasswordField;
    Font font;
    private JCheckBox term;

    public LoginPage() {
        font = new Font("System", Font.BOLD, 23);

        this.setTitle("Hospital Management System");
        this.setSize(800, 600);
		this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CenterPanel = new JPanel();
        CenterPanel.setBounds(0, 0, 800, 600);
		//RightPanel.setBackground(Color.decode("#CCE2CB"));

        // RightPanel =new JPanel();
        // RightPanel.setBounds(450,150,500,250);
        // RightPanel.setBackground(Color.decode("#CCE2CB"));
        // this.getContentPane().setBackground(Color.decode("#23b2a7"));

        // leftPanel.setBackground(Color.decode("#17776f"));

        usernameField = new JTextField();
        usernameField.setBounds(350, 180, 270, 30);
        usernameField.setFont(font);
        this.add(usernameField);

        userPasswordField = new JPasswordField();
        userPasswordField.setBounds(350, 250, 270, 30);
        userPasswordField.setFont(font);
        this.add(userPasswordField);

        loginButton = new JButton("Log In");
        loginButton.setBounds(360, 420, 80, 30);
        loginButton.setBackground(Color.decode("#CCD4BF"));
        loginButton.setFont(new Font("System", Font.BOLD, 15));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        this.add(loginButton);

        backButton = new JButton("BACK");
        backButton.setBounds(460, 420, 80, 30);
        backButton.setBackground(Color.decode("#CCD4BF"));
        backButton.setFont(new Font("System", Font.BOLD, 15));
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        this.add(backButton);

        resetButton = new JButton("RESET");
        resetButton.setBounds(550, 420, 95, 30);

        resetButton.setBackground(Color.decode("#CCD4BF"));
        resetButton.setFont(new Font("System", Font.BOLD, 15));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        this.add(resetButton);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 17));
        term.setSize(260, 20);
        term.setLocation(320, 340);
        this.add(term);

        username = new JLabel("Username:");
        username.setBounds(200, 180, 247, 32);
        username.setForeground(Color.BLACK);
        username.setFont(font);
        this.add(username);

        password = new JLabel("Password:");
        password.setBounds(200, 250, 247, 32);
        password.setForeground(Color.BLACK);
        password.setFont(font);
        this.add(password);

        loginMsg = new JLabel();
        loginMsg.setBounds(380, 300, 450, 32);
        loginMsg.setForeground(Color.BLACK);
        loginMsg.setFont(new Font("System", Font.BOLD, 16));
        this.add(loginMsg);

        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Adminlogin.gif")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 980, 600);

        icon = new ImageIcon("Adminlogin.png");

        // this.add(RightPanel);
        this.add(frameImage);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            usernameField.setText(null);
            userPasswordField.setText(null);
            loginMsg.setText(null);
        }

        else if (e.getSource() == backButton) {
            HomePage hp = new HomePage();
            hp.setVisible(true);
            this.setVisible(false);
        }

        /* ################## Admin Login ################## */

        else if (e.getSource() == loginButton) {
            String adminUsername = usernameField.getText();
            String adminPassword = String.valueOf(userPasswordField.getPassword());

            try {
                if (adminPassword.length() >= 8) {
                    if (adminUsername.equals("MIKI") && adminPassword.equals("AIUB 420")) {

                        Admin2 hp = new Admin2();
                        hp.setVisible(true);
                        this.setVisible(false);
                    } else {
                        loginMsg.setText("Incorrect username or password");
                    }
                } else {
                    throw new PasswordException();
                }
            } catch (PasswordException pe) {
                showMessageDialog(null, pe.getMessage());
            }
        }
    }
}