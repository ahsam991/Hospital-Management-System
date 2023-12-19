package Classes;


public class EmployeeTableC
{
	private String idLabel;
//	private String employeeName;
	private String salaryLabel;
	private String lnLabel;
	private String fnLabel;
	

	public EmployeeTableC()
	{
		
	}

	public EmployeeTableC( String fnLabel ,String idLabel,String salaryLabel,String lnLabel)
	{
	//this.employeeName = name;
	this.idLabel = idLabel;
	this.salaryLabel = salaryLabel;	
		this. lnLabel =  lnLabel;	
			this.fnLabel= fnLabel;	
	
	
	
	
	
	}
	
	public String getemployeeId(){return idLabel;} 
	//public String getEmployeeName(){return employeeName;}
	public String getSalary(){return salaryLabel;} 
	
     public String getFirstName(){return fnLabel;}
	 
	   public String getlasttName(){return lnLabel;}
}