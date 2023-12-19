import java.awt.Color;
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

class DoctorTable extends JFrame implements ActionListener {
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane sc;
	private Container c;
	private JLabel titleLabel, fnLabel, lnLabel, salaryLabel, idLabel, jS,rmvemp,employeeName, srcemp;
	JSlider slider;
	private JTextField fntf, lntf, sltf, itf ,employeeNameTF, removeemployee;
	private JButton addButton, updateButton, deleteBUtton, clearButton, exitButton, backButton;//, searchButton, deleteButton;
	private String[] columns = { "First Name", "Last Name"  , "ID", "Salary" };
	private String[] rows = new String[5];
	Font myFont, myFont12;
	
    // EmployeeTableC employee[]=new EmployeeTableC[50];
    // EmployeeTableC emp;


    // for file handling
    String file = ".\\Data\\user_data.txt";
	String temp = ".\\Data\\temp.txt";


	DoctorTable() {
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
		
		  /* employeeName = new JLabel("Employee Name " );
        employeeName.setBounds(10, 265, 150, 25);
        employeeName.setForeground(new Color(0,0,51));
        employeeName.setFont(font);
        this.add(employeeName);

        employeeNameTF = new JTextField();
        employeeNameTF.setBounds(110, 265, 200, 30);
        employeeNameTF.setForeground(new Color(0,0,51));
        employeeNameTF.setFont(font);
       // employeeNameTF.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        this.add(employeeNameTF);*/

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

		updateButton = new JButton("UPDATE");
		updateButton.setBounds(400, 80, 100, 30);
		updateButton.setBackground(new Color(136, 174, 208));

		updateButton.setFont(font);
		c.add(updateButton);

		deleteBUtton = new JButton("DELETE");
		deleteBUtton.setBounds(400, 130, 100, 30);
		deleteBUtton.setBackground(new Color(136, 174, 208));
		deleteBUtton.setFont(font);
		c.add(deleteBUtton);

		clearButton = new JButton("CLEAR");
		clearButton.setBounds(400, 180, 100, 30);
		clearButton.setBackground(new Color(136, 174, 208));
		clearButton.setFont(font);
		c.add(clearButton);
		table = new JTable();

		backButton = new JButton("BACK");
		backButton.setBounds(400, 230, 100, 30);
		backButton.setBackground(new Color(136, 174, 208));
		backButton.setFont(font);
		c.add(backButton);
		// table = new JTable ();

		exitButton = new JButton("EXIT");
		exitButton.setBounds(400, 280, 100, 30);
		exitButton.setBackground(new Color(136, 174, 208));
		exitButton.setFont(font);
		c.add(exitButton);

		//searchButton = new JButton("Search");
		//searchButton.setBounds(530, 200, 100, 20);
		//searchButton.setBackground(new Color(136, 174, 208));
		//searchButton.setForeground(new Color(255, 255, 255));
		//searchButton.setFont(font);
		//searchButton.setFocusable(false);
		//searchButton.addMouseListener(this)c
		//searchButton.addActionListener(this);
		//c.add(searchButton);
		
		//deleteButton = new JButton("Delete");
       // deleteButton.setBounds(640, 200, 100, 20);
       //deleteButton.setBackground(new Color(0, 0, 51));
       // deleteButton.setForeground(new Color(255, 255, 255));
        //deleteButton.setFont(font);
        //deleteButton.setFocusable(false);
       // deleteButton.addMouseListener(this);
        //deleteButton.addActionListener(this);
        //c.add(deleteButton);

		// table = new JTable ();

		idLabel = new JLabel("ID   ");
		idLabel.setBounds(10, 230, 150, 30);
		idLabel.setFont(font);
		c.add(idLabel);

		itf = new JTextField();
		itf.setBounds(110, 230, 200, 30);
		itf.setFont(font);

		c.add(itf);
		
		//rmvemp = new JLabel("Search Employee " );
        //rmvemp.setBounds(530, 150, 150, 30);
        //rmvemp.setForeground(new Color(0,0,51));
        //rmvemp.setFont(font);
        //c.add(rmvemp);

       // removeemployee = new JTextField();
       // removeemployee.setBounds(650, 150, 120, 25);
       // removeemployee.setForeground(new Color(0,0,51));
       // removeemployee.setFont(font);
       // removeemployee.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
       // c.add(removeemployee);


		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);

		table.setModel(model);
		table.setSelectionBackground(new Color(198, 65, 83));
		table.setBackground(new Color(162, 160, 161));
		table.setForeground(Color.BLACK);
		table.setFont(myFont12);
		table.setRowHeight(30);
		// table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // table.getColumnModel().getColumn(0).setPreferredWidth(120);
        // table.getColumnModel().getColumn(1).setPreferredWidth(300);
        // table.getColumnModel().getColumn(2).setPreferredWidth(120);
        // table.getColumnModel().getColumn(3).setPreferredWidth(220);
        // table.getColumnModel().getColumn(4).setPreferredWidth(200);
        // table.getColumnModel().getColumn(5).setPreferredWidth(220);

		sc = new JScrollPane(table);
		sc.setBounds(10, 320, 740, 200);
		c.add(sc);

		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		//deleteButton.addActionListener(this);
		deleteBUtton.addActionListener(this);
		updateButton.addActionListener(this);
		exitButton.addActionListener(this);
		backButton.addActionListener(this);
       // searchButton.addActionListener(this);



        // to put data into table
        try {

		            BufferedReader reader = new BufferedReader(new FileReader(file));
		            int totalLines = 0;
		            while (reader.readLine() != null)
		                totalLines++;
		            reader.close();

		            for (int i = 0; i < totalLines; i++) {
		                String line = Files.readAllLines(Paths.get(file)).get(i);
		                String x = line.substring(0, 5);
		                if (x.equals("First")) {
		                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // First Name: 
		                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Last Name: 
		                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(4); // ID: 
		                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(8); // Salary: 
		                    
		                    model.addRow(rows);
		                }
		            }

		        } catch (Exception ex) {
		            return;
		        }




		
	// 	table.addMouseListener(new MouseAdapter() {
	// 		private int numberOfRow;

	// 		public void mouseClicked(MouseEvent m) {

	// 			String f_name = model.getValueAt(numberOfRow, 0).toString();
	// 			String l_name = model.getValueAt(numberOfRow, 1).toString();
	// 			String id = model.getValueAt(numberOfRow, 2).toString();
	// 			String salary = model.getValueAt(numberOfRow, 3).toString();

	// 			fntf.setText(f_name);
	// 			lntf.setText(l_name);
	// 			itf.setText(id);
	// 			sltf.setText(salary);

	// 		}
	// 	});

	}
	

	
	//  public void removeEmployee(String fnLabel)
    // {
    //     int flag = 0;
    //     try
    //     {
    //         for(int i=0; i<employee.length; i++)
    //         {
    //             if(employee[i]. getFirstName().equals(fnLabel))
    //             {
    //                 employee[i] = null;
    //                 flag = 1;
    //                 break;
    //             }
    //         }
    //         if(flag == 1)
    //             {JOptionPane.showMessageDialog(null, "Deletion Successful!");}

    //         else 
    //             {JOptionPane.showMessageDialog(null, "Unsuccesful operation!");}
    //     }
    //     catch(NullPointerException ne)
    //     {
    //      JOptionPane.showMessageDialog(null, "Error Found!"); 
    //  }

    //  }
	 
    
    
  

//  public EmployeeTableC searchEmployee(String fnLabel)
//  {
//     EmployeeTableC a1 = null;
//      for(int i=0; i<employee.length; i++)
//     {
//         if(employee[i] != null)
//         {
//             if(employee[i]. getFirstName().equals(fnLabel))
//             {
//                 a1=employee[i];
		
//                 break;
//             }
//         }
//      }
//     if(a1 != null)
//     {
//         JOptionPane.showMessageDialog(null, "Employee Found!");
//     }
//     else
//     {
//         JOptionPane.showMessageDialog(null, "Employee Not Found!");
//     }

    
    
//     return a1;

// }


	private void setLocatinRelatedTo(Object object) {
	}

	// /*
	//  * @Override
	//  * public void stateChanged(ChangeEvent r){
	//  * jS.setText("AGE=  "+slider.getValue()+"  Years");
	//  * //slider.addChangeListener(this);
	//  * }
	//  */
	@Override
	public void actionPerformed(ActionEvent a1) {
		if (a1.getSource() == addButton) {
			// rows[0] = fntf.getText();
			// rows[1] = lntf.getText();
			// rows[2] = itf.getText();
			// rows[3] = sltf.getText();

			// model.addRow(rows);

			AddEmployee ae1 = new AddEmployee();
			ae1.setVisible(true);
			this.setVisible(false);

	    } 
		else if (a1.getSource() == clearButton) {
			fntf.setText("");
			lntf.setText("");
			itf.setText("");
			sltf.setText("");

		} 
			else if (a1.getSource() == deleteBUtton) {
				
			if (table.getSelectionModel().isSelectionEmpty()) {

		                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
		                            JOptionPane.WARNING_MESSAGE);
		                } else {
		                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

		                    File oldFile = new File(file);
		                    File newFile = new File(temp);

		                    int q = 0;

		                    try {

		                        BufferedReader reader = new BufferedReader(new FileReader(file));
		                        int totalLines = 0;
		                        while (reader.readLine() != null)
		                            totalLines++;
		                        reader.close();

		                        for (int i = 0; i < totalLines; i++) {
		                            String line = Files.readAllLines(Paths.get(file)).get(i);
		                            String x = line.substring(0, 5);
		                            if (x.equals("First")) {
		                                String userName = Files.readAllLines(Paths.get(file)).get(i);
		                                if (userName.substring(12).equals(removeUser)) {
		                                    q = i;
		                                }
		                            }
		                        }
		                    } catch (Exception ex) {
		                        return;
		                    }

		                    try {

		                        FileWriter fw = new FileWriter(temp, true);
		                        BufferedWriter bw = new BufferedWriter(fw);
		                        PrintWriter pw = new PrintWriter(bw);

		                        FileReader fr = new FileReader(file);
		                        BufferedReader br = new BufferedReader(fr);

		                        BufferedReader reader = new BufferedReader(new FileReader(file));
		                        int totalLines = 0;
		                        while (reader.readLine() != null)
		                            totalLines++;
		                        reader.close();

		                        for (int j = 0; j < totalLines; j++) {
		                            String line = Files.readAllLines(Paths.get(file)).get(j);
		                            String x = line.substring(0, 5);

		                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
		                                String userName = Files.readAllLines(Paths.get(file)).get(j);
		                                pw.println("#Removed! " + userName);
		                            } else {
		                                String userName = Files.readAllLines(Paths.get(file)).get(j);
		                                pw.println(userName);
		                            }
		                        }
		                        pw.flush();
		                        pw.close();
		                        fr.close();
		                        br.close();
		                        bw.close();
		                        fw.close();

		                    } catch (Exception ex) {
		                        System.out.print(ex);
		                    }

		                    oldFile.delete();
		                    File dump = new File(file);
		                    newFile.renameTo(dump);

		                    this.setVisible(false);
		                    DoctorTable c7 = new DoctorTable();
		                    c7.setVisible(true);
		                }
		            }

				

		//} 
		else if (a1.getSource() == updateButton) {
			int numberOfRow = table.getSelectedRow();

			String f_name = fntf.getText();
			String l_name = lntf.getText();
			String id = itf.getText();
			String salary = sltf.getText();

			model.setValueAt(f_name, numberOfRow, 0);
			model.setValueAt(l_name, numberOfRow, 1);
			model.setValueAt(id, numberOfRow, 2);
			model.setValueAt(salary, numberOfRow, 3);

		}
		
		
// 	else if(a1.getSource() == searchButton)
// {
// 	 String rmve= removeemployee.getText();
//     this.searchEmployee(rmve);
//       removeemployee.setText("");}
		
    //else if(a1.getSource() == deleteButton)
{
    // String rmve= removeemployee.getText();
    // this.removeEmployee(rmve);
    // removeemployee.setText("");
   
    // int row = table.getSelectedRow();

    // DefaultTableModel model = (DefaultTableModel)table.getModel();

    // model.removeRow(row);
	


}


		 if (a1.getSource() == backButton) {
			Doctor3 c6 = new Doctor3();
			c6.setVisible(true);
			this.setVisible(false);
		}
		else if (a1.getSource() == exitButton) {
			System.exit(0);
		}
	
		
	}	


}


