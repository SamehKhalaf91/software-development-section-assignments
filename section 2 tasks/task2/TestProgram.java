
public class testProgramT2 {
	public static void main(String[] args) {
	subject subject1=new subject("01","it",3);
	address address1=new address(100,"minia","egypt");
	student student1 = new student("x","01",3,subject1,address1);
	
	System.out.print(student1.printStudent());
	}

}
