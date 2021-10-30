
public class Student extends Person{
	public final String FRESHMAN = "Freshman";
    public final String SOPHOMORE = "Sophomore";
    public final String JUNIOR = "Junior";
    public final String SENIOR = "Senior";
	private String status;
	
		public Student(String name,String address,String phoneNum,String emailAddress,String status ) {
			super(name,address,phoneNum,emailAddress);
			this.status=status;
	
	}
		public String toString() {
			return "class name: "+this.getClass().getName()+"\t the person's name: "+getName();
		}
		public String getStatus() {
			return status;
		}

}
