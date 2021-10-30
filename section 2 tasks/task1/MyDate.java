//aggregation
public class MyDate {
	private int year;
	private int month;
	private int day;
	public MyDate(int year,int day,int month) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}

}
