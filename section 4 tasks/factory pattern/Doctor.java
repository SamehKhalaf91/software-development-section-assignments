
public class Doctor implements Staff{
	private String name;
	private String address;
	private double salary;
	private int yearsOfWork;
	public Doctor() {
		name=null;
		address = null;
		salary=0.0;
		yearsOfWork=0;
	}
	public Doctor(String name,String address,Double salary,int yearsOfWork) 
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
