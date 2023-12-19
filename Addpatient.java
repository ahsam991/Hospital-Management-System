// import java.awt.Color;
import java.awt.Container;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Classes.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

class Addpatient extends JFrame implements ActionListener {
	 // JFrame homeFrame;

	 
	 private Container c;
	 private JLabel titleLabel, fnLabel, lnLabel, salaryLabel, idLabel, jS,rmvemp,employeeName, srcemp;
	 private JTextField fntf, lntf, sltf, itf ,employeeNameTF, removeemployee;
	 private JButton addButton, updateButton, deleteBUtton, clearButton, exitButton, backButton, searchButton, deleteButton;
	private JTable table;
	private DefaultTableModel model;

	 Font myFont, myFont12;

	 Addpatient() {
		initComponents();
	}

	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocatinRelatedTo(null);
		this.setTitle("Member Table");

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(217, 225, 227));
		((JComponent) c).setOpaque(true);

		Font font = new Font("Times New Roman", Font.BOLD, 16);

		titleLabel = new JLabel("Member Management");
		titleLabel.setBounds(140, 10, 250, 50);
		titleLabel.setFont(font);
		c.add(titleLabel);

	

		fnLabel = new JLabel("First Name    ");
		fnLabel.setBounds(10, 80, 140, 30);
		fnLabel.setBackground(new Color(45, 133, 225));
		fnLabel.setFont(font);
		c.add(fnLabel);

		fntf = new JTextField();
		fntf.setBounds(110, 80, 200, 30);
		fntf.setFont(font);
		c.add(fntf);

		lnLabel = new JLabel("Last Name    ");
		lnLabel.setBounds(10, 130, 150, 30);
		lnLabel.setBackground(new Color(45, 133, 225));
		lnLabel.setFont(font);
		c.add(lnLabel);

		lntf = new JTextField();
		lntf.setBounds(110, 130, 200, 30);
		lntf.setFont(font);
		c.add(lntf);

		salaryLabel = new JLabel("Salary    ");
		salaryLabel.setBounds(10, 180, 150, 30);
		salaryLabel.setBackground(new Color(45, 133, 225));
		salaryLabel.setFont(font);
		c.add(salaryLabel);

		sltf = new JTextField();
		sltf.setBounds(110, 180, 200, 30);
		sltf.setFont(font);
		c.add(sltf);

		addButton = new JButton("ADD");
		addButton.setBounds(400, 30, 100, 30);
		addButton.setBackground(new Color(136, 174, 208));
		addButton.setFont(font);
		c.add(addButton);

		/*backButton = new JButton("BACK");
		backButton.setBounds(400, 230, 100, 30);
		backButton.setBackground(new Color(136, 174, 208));
		backButton.setFont(font);
		c.add(backButton);


		exitButton = new JButton("EXIT");
		exitButton.setBounds(400, 280, 100, 30);
		exitButton.setBackground(new Color(136, 174, 208));
		exitButton.setFont(font);
		c.add(exitButton);*/
		
		

		idLabel = new JLabel("ID   ");
		idLabel.setBounds(10, 230, 150, 30);
		idLabel.setFont(font);
		c.add(idLabel);

		itf = new JTextField();
		itf.setBounds(110, 230, 200, 30);
		itf.setFont(font);
		c.add(itf);




		addButton.addActionListener(this);
		exitButton.addActionListener(this);
		backButton.addActionListener(this);
		updateButton.addActionListener(this);

	}


	private void setLocatinRelatedTo(Object object) {
	}


	@Override
	public void actionPerformed(ActionEvent a1) {
		if (a1.getSource() == addButton) {


			String textField1 = fntf.getText(); // First Name
            String textField2 = lntf.getText(); // Last name
            String textField3 = itf.getText(); // ID
            String textField4 = sltf.getText(); // Salary
			

	    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty() ) {

                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                            
                        }

                        else{

                            try {
                                        File file = new File(".\\Data\\doc_data.txt");
                                        if (!file.exists()) {
                                            file.createNewFile();
                                        }
                                        FileWriter fw = new FileWriter(file, true);
                                        BufferedWriter bw = new BufferedWriter(fw);
                                        PrintWriter pw = new PrintWriter(bw);

                                        // LocalDateTime myDateObj = LocalDateTime.now();
                                        // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                                        // String timeAndDate = myDateObj.format(myFormatObj);

                                        
                                        pw.println("First Name: " + textField1);
                                        pw.println("Last Name: " + textField2);
                                        pw.println("ID: " + textField3);
                                        pw.println("Salary: " + textField4);
                                        
                                        
                                        pw.println("===============================================");
                                        pw.close();

                                    } catch (Exception ex) {
                                        System.out.print(ex);
                                    }

                                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                                    JOptionPane.WARNING_MESSAGE);
                                    this.setVisible(false);
                                    PatientTable e1 = new PatientTable();
                                    e1.setVisible(true);

                                }
								
                            
		}                            // end of add button 
			

	}
	
	
	

	
      
		}

