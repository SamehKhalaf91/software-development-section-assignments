
public class task2 {

	public static void main(String[] args) {
		MyDate date =new MyDate(2020,12,30);
		Person person = new Person("x","yyy","000","x@mail.com");
        Student student = new Student("x","yyy","000","x@mail.com", "freshman");
        Employee employee = new Employee("x","yyy","000","x@mail.com", 60000, "off2", date);
        Faculty faculty = new Faculty("x","yyy","000","x@mail.com", 60000, "off2", null, 6, "lecturer");
        Staff staff = new Staff("x","yyy","000","x@mail.com", 60000, "off2", null, null);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

	}

}
