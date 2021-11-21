import java.util.Scanner;
public class DemoClass {

	public static void main(String[] args) {
	Scanner Scan =new Scanner(System.in);
	System.out.println("enter your job title");
	String title=Scan.nextLine();
	memberFactory memfac=new memberFactory();
	Staff staff=memfac.getJob(title);
	staff.GetSalary();
	staff.getYearsOfWork();

	}

}
