package atividade2;

public class SavingAccount extends BankAccount{
	double interest = 0.05;
	int daysPassed = 0;
	
	public SavingAccount(String client, String accountNumber, double balance) {
		super(client, accountNumber, balance);		
	}
	
	public SavingAccount(String client, String accountNumber, double balance, double interest, int daysPassed) {
		super(client, accountNumber, balance);
		this.interest = interest;
		this.daysPassed = daysPassed;
	}
	
	public void calculateNewBalance() {
		this.balance = this.balance * Math.pow((1 + this.interest), this.daysPassed);
		this.showBalance(null);
	}
	
	public void setInterest(double interest) {
		this.interest = interest;		
	}
	
	public void setDaysPassed(int daysPassed) {
		this.daysPassed = daysPassed;
	}
	
	public double getInterest() {	
		return this.interest;
	}
	
	public int getDaysPassed() {
		return this.daysPassed;
	}
}
