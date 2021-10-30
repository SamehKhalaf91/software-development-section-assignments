
public class Faculty extends Employee {
	private double officeHours;
	private String rank;
	public Faculty(String name,String address,String phoneNum,String emailAddress,double salary,String office,MyDate dateHired,double officeHours,String rank) {
		super(name,address,phoneNum,emailAddress,salary,office,dateHired);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}
	public String toString() {
		return "class name: "+this.getClass().getName()+"\t person's name: "+getName();
	}
	public double getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
