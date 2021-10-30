
public class Staff extends Employee {
	private String title;
	public Staff(String name,String address,String phoneNum,String emailAddress,double salary,String office,MyDate dateHired,String title) {
		super(name,address,phoneNum,emailAddress,salary,office,dateHired);
		this.setTitle(title);
	}
	public String toString() {
		return "class name: "+this.getClass().getName()+"\t person's name: "+getName();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
