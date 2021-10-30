
public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	public Employee(String name,String address,String phoneNum,String emailAddress,double salary,String office,MyDate dateHired) {
		super(name,address,phoneNum,emailAddress);
		this.setSalary(salary);
		this.setOffice(office);
		this.setDateHired(dateHired);
		
	}
	public String toString() {
		return "class name: "+this.getClass().getName()+"\t person's name: "+getName();
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

}
