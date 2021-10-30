
public class Person {
private String name;
private String address;
private String phoneNum;
private String emailAddress;
public Person() {
	name=null;
	address=null;
	phoneNum=null;
	emailAddress=null;
}
public Person(String name,String address,String phoneNum,String emailAddress ) {
	this.name=name;
	this.address=address;
	this.phoneNum=phoneNum;
	this.emailAddress=emailAddress;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public String getPhoneNum() {
	return phoneNum;
}
public String getEmailAddress() {
	return emailAddress;
}
public String toString() {
	return "class name: "+this.getClass().getName()+"\t person's name: "+getName();
}
}
