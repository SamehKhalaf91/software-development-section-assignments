//aggregation
public class address {
	private int streatNO;
	private String city;
	private String country;
	public address(int streatNO,String city,String country) {
		this.streatNO=streatNO;
		this.city=city;
		this.country=country;
	}
	public String printAddress() {
		return "streat no: "+streatNO+"\t city: "+city+"\t country: "+country;
	}
	
}
