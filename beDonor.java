import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


 public class beDonor extends Donor implements ActionListener {
	private JFrame f;
	private JLabel nl,fnl,anl,nidl,gl,adl,atl;
	private JTextField n,fn,an,nid,ad;
	private JComboBox g,at;
	private JButton sub,cancel,previous;
	private Donor[] acc;
	beDonor(){
		f=new JFrame();
		nl=new JLabel("Name*:");
		fnl=new JLabel("Phone No*:");
		anl=new JLabel("Email ID*:");
		nidl=new JLabel("Address*:");
		gl=new JLabel("Sex:*");
		
		String op[]={"Select Gender","Male","Female"};
		
		g=new JComboBox(op);
		
		adl=new JLabel("Age*:");
		atl=new JLabel("Blood Group**:");
		
		n=new JTextField();
		fn=new JTextField();
		an=new JTextField();
		nid=new JTextField();
		ad=new JTextField();
		
		String ops[]={"Select Blood Group","A+","A-","B+","B-","AB+","AB-","O+","O-"};
		at=new JComboBox(ops);
		sub=new JButton("Submit");
		sub.addActionListener(this);
		
		cancel=new JButton("Cancel");
		cancel.addActionListener(this);
		
		previous=new JButton("previous");
		previous.addActionListener(this);
		
		GridLayout t = new GridLayout(9,3,20,20);
		f.setLayout(t);
		f.add(nl);
		f.add(n);
		f.add(fnl);
		f.add(fn);
		f.add(anl);
		f.add(an);
		f.add(nidl);
		f.add(nid);
		f.add(gl);
		f.add(g);
		f.add(adl);
		f.add(ad);
		f.add(atl);
		f.add(at);
		f.add(sub);
		sub.addActionListener(this);
		f.add(cancel);
		cancel.addActionListener(this);
		f.add(previous);
		previous.addActionListener(this);

		f.setSize(800,600);
		f.setTitle("Create Account");
		f.setLocation(525, 280);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		readFromFile();
	}
		
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==sub){
			String a = n.getText();    
			String s1 = g.getSelectedItem().toString();
			String age = ad.getText();
			String f = nid.getText();
			String g = an.getText();
			String h = fn.getText();
			String i = at.getSelectedItem().toString();

			if(a.isEmpty() || s1.isEmpty() || f.isEmpty() || g.isEmpty() || h.isEmpty() || i.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"All the required fields are not filled");
			}
			else{
				Donor temp = new Donor(a,age,s1,g,h,f,i);
				
				addAccount(temp);
				
				writeToFile();

				JOptionPane.showMessageDialog(null,"Account created Succesfully.");
			}
		}
		/*else if(e.getSource()==cancel){
			new Welcome();
			f.setVisible(false);
		}*/
		else if(e.getSource() == previous)
		{   
			needblood c4 = new needblood();
			c4.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
	public void addAccount(Donor s){ 
		int index = 0;

		for(int i = 0; i < acc.length; i++){
			if(acc[i] == null){ 
				index = i;
				break;
			}
		}

		if(index < acc.length){
			acc[index] = s;
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
				String a = s.nextLine(); // read Donor;
				String b = s.nextLine(); // read phone no;
				String c = s.nextLine(); // read address;
				String d = s.nextLine(); // read email id;
				String e = s.nextLine(); // read sex;
				String g = s.nextLine(); // read age;
				String h = s.nextLine(); // read blood group;

				Donor temp = new Donor(a,b,c,d,e,g,h); 
				acc[i] = temp; // store in array
				i++;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}	  
	}

	public void writeToFile(){
		try{
			File f = new File("Record.txt");
			FileWriter fw = new FileWriter(f);
			for(int i = 0; i < acc.length; i++)
			{
				if(acc[i]!=null)
				{
					fw.write(acc[i].getName());
					fw.write("\n");
					fw.write(acc[i].getAge());
					fw.write("\n");
					fw.write(acc[i].getSex());
					fw.write("\n");
					fw.write(acc[i].getEmail());
					fw.write("\n");
					fw.write(acc[i].getPn());
					fw.write("\n");
					fw.write(acc[i].getAdr());
					fw.write("\n");
					fw.write(acc[i].getBg());
					fw.write("\n");
				}
			}
			fw.close();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}  
	}

}
	