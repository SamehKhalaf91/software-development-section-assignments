//aggregation
public class subject {
private String subjectID;
private String subjectName;
private double subjectHours;
public subject(String subjectID,String subjectName,double subjectHours){
	this.subjectID=subjectID;
	this.subjectName=subjectName;
	this.subjectHours=subjectHours;
}
public String printSubject() {
	return "subject ID: "+subjectID+"\t subject name: "+subjectName+"\t subject hours: "+subjectHours;
}
}
