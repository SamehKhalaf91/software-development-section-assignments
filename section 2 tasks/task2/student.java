
public class student {
	private String studentName;
	private String studentID;
	private double studentGPA;
	private subject subject;
	private address address;
	public student(String studentName,String studentID,double studentGPA,subject subject,address address) {
		this.studentName=studentName;
		this.studentID=studentID;
		this.studentGPA=studentGPA;
		this.subject=subject;
		this.address=address;
	}
	public String printStudent() {
		return "student ID: "+studentID+"\t student name: "+studentName+"\t student GPA: "+studentGPA+"\n student's subject: "+subject.printSubject()+"\t student address: "+address.printAddress();
	}
	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public double getStudentGPA() {
		return studentGPA;
	}
	
	public subject getSubject() {
		return subject;
	}
	
	
	public address getAddress() {
		return address;
	}
	
	


}
