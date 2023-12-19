import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class needblood implements ActionListener
{
	private JFrame f;
	private JLabel atl,adl;
	private JTextArea ad;
	private JScrollPane sp;
	private JComboBox at;
	// private JPanel leftPanel;
	//private JPanel c2Panel;
	private JButton sub,Exit,Back;//,donorInfo,patientInfo;
	private Donor[] acc;

	public needblood(){
		f=new JFrame();	
		adl=new JLabel("Donor Information:",SwingConstants.CENTER);
		
		atl=new JLabel("Select Blood Group:",SwingConstants.CENTER);
	
		ad=new JTextArea();
		sp = new JScrollPane(ad);
		sp.setBounds(5, 5, 150, 20);
		String ops[]={"Select Blood Group","A+","A-","B+","B-","AB+","AB-","O+","O-"};
		at=new JComboBox(ops);
		sub=new JButton("Search");
		//sub.setBounds(20,100,90,20);
		sub.addActionListener(this);
		//=new JButton("Exit");
		//Exit.addActionListener(this);
		Back=new JButton("Back");
		Back.addActionListener(this);
		
		//GridLayout t = new GridLayout(7,5);
		//f.setLayout(t);
		
		/*c2Panel = new JPanel();
		c2Panel.setLayout(null);
		
		
  donorInfo = new JButton("donorInfo");
		donorInfo.setBounds(20, 540, 100, 30);
		//donorInfo.setForeground(Color.WHITE);
		//donorInfo.setBackground(new Color(137, 207, 240));
		donorInfo.addActionListener(this);
		//donorInfo.addMouseListener(this);
		c2Panel.add(donorInfo);
				
  patientInfo= new JButton("donorInfo");
		patientInfo.setBounds(700, 540, 100, 30);
		//patientInfo.setForeground(Color.WHITE);
		//patientInfo.setBackground(new Color(137, 207, 240));
		patientInfo.addActionListener(this);
		//patientInfo.addMouseListener(this);
		c2Panel.add(patientInfo);*/


		GridLayout t = new GridLayout(8,5);
		f.setLayout(t);
		 
		
		f.add(atl);
		f.add(at);
		f.add(sub);
		f.add(adl);
		f.add(sp);
		f.add(Back);
		//f.add(Exit);
		f.setSize(800,600);
		f.setTitle("Search for Blood");
		f.setLocation(200, 180);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		readFromFile();
		
		
		//c2Panel = new JPanel();
		//c2Panel.setLayout(null);
		
		
  //donorInfo = new JButton("donorInfo");
		//donorInfo.setBounds(20, 540, 100, 30);
		//donorInfo.setForeground(Color.WHITE);
		//donorInfo.setBackground(new Color(137, 207, 240));
		//donorInfo.addActionListener(this);
		//donorInfo.addMouseListener(this);
		//f.add(donorInfo);
				
  //patientInfo= new JButton("PatientInfo");
		//patientInfo.setBounds(700, 540, 100, 30);
		//patientInfo.setForeground(Color.WHITE);
		//patientInfo.setBackground(new Color(137, 207, 240));
		//patientInfo.addActionListener(this);
		//patientInfo.addMouseListener(this);
		//f.add(patientInfo);


		

		}
	
	
		//@ender
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==sub){
			String k = at.getSelectedItem().toString();
			
			
			int[] s=new int[50];
			int j=0;
			String mn = null;
			int sn=0;
			
			for(int i = 0; i < acc.length; i++){
				
				if(acc[i] != null && acc[i].getBg().equals(k)){ // BG matches
					sn = j+1;
					//mn=sn+". Name: "+acc[i].getName()+" | Phone No: "+acc[i].getPn()+" | Age:" + acc[i].getAge()+" | Email: "+acc[i].getEmail()+" | Address: "+acc[i].getAdr()+" | Sex: "+acc[i].getSex()+"\n";
					
					if(mn==null){
						mn=mn=sn+". Name: "+acc[i].getName()+" | Phone No: "+acc[i].getPn()+" | Age:" + acc[i].getAge()+" | Email: "+acc[i].getEmail()+" | Address: "+acc[i].getAdr()+" | Sex: "+acc[i].getSex()+"\n";
					}
					else{
						mn=mn+sn+". Name: "+acc[i].getName()+" | Phone No: "+acc[i].getPn()+" | Age:" + acc[i].getAge()+" | Email: "+acc[i].getEmail()+" | Address: "+acc[i].getAdr()+" | Sex: "+acc[i].getSex()+"\n";;
					}
					
					
					j++;
				}	
			}
			
			if(j==0){
				JOptionPane.showMessageDialog(null, "Record not found!");
			}
			else{
				ad.setText(mn);
			}
		}
		/*else if(e.getSource()==Exit){
				f.setVisible(false);
				new Welcome();
		}*/
		else if(e.getSource() == Back)
			
		{
			 
			Pbutton1 blood= new Pbutton1();
			blood.setVisible(true);
			//this.setVisible(false); 
		
			f.setVisible(false);
            
		}
		
		
	}
	
	public void readFromFile()
	{
		try{
			File f = new File("Record.txt");
			Scanner s =  new Scanner(f);
			acc = new Donor[50];
			int i=0;		  

			while(s.hasNextLine()){
				String a = s.nextLine(); // read id;
				String b = s.nextLine(); // read name;
				String c = s.nextLine();
				String d = s.nextLine();
				String e = s.nextLine();
				String g = s.nextLine();
				String h = s.nextLine();

				Donor temp = new Donor(a,b,c,d,e,g,h); // create Student object
				acc[i] = temp; // store in array
				i++;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}	  
	}
	
	public Donor findDonor(String key){
		Donor s = null;
		
		for(int i = 0; i < acc.length; i++){
			if(acc[i] != null && acc[i].getBg().equals(key)){ // id matches
				s = acc[i];
			}
		}	
		return s;
	}
	

}
	