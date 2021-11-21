
public class CS_TeachingAssistant implements Staff{
	private String name;
	private String address;
	private double salary;
	private int yearsOfWork;
	public CS_TeachingAssistant() {
		name=null;
		address = null;
		salary=0.0;
		yearsOfWork=0;
	}
	public CS_TeachingAssistant(String name,String address,Double salary,int yearsOfWork) 
	{
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.yearsOfWork=yearsOfWork;
	}
	public double GetSalary()
	{
		return salary;
	}
	public int getYearsOfWork()
	{
		return yearsOfWork;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

}
