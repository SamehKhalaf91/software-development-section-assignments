import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();
	public Account()
	{
		id=0;
	    balance=0.0;
		annualInterestRate=0.0;
	}
	public Account(int newId,double newBalance)
	{
		id= newId;
		balance=newBalance;
	}
	public Account(int newId,double newBalance,double newAnnualInterestRate)
	{
		id= newId;
		balance=newBalance;
		annualInterestRate=newAnnualInterestRate;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int newId) {
		 id=newId;
	}
	public void setBalance(double newBalance) {
		balance=newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate= newAnnualInterestRate;
	}
	public void setDateCreted(Date newDateCreated ) {
		 dateCreated=newDateCreated;
	}
	public double getMonthlyInterestRate() {
	     return balance*((annualInterestRate/100)/12);
	     
	}
	public double withdraw(double amount) {
		return balance -=amount;
		
	}
	public double deposit(double amount) {
		return balance +=amount;
		
	}
}
