package atividade2;

public class SpecialAccount extends BankAccount{
	double limit;
	
	public SpecialAccount(String client, String accountNumber, double balance) {
		super(client, accountNumber, balance);
	}
	
	public SpecialAccount(String client, String accountNumber, double balance, double limit) {
		super(client, accountNumber, balance);
		this.limit = limit;
	}
	
	@Override
	public void withdraw(double withdrawAmount) throws InsufficientBalance {		
		if((this.balance + this.limit) < withdrawAmount) {
			throw new InsufficientBalance("There isn't enough balance in your bank account!");
		}
		
		this.balance -= withdrawAmount;
		
		this.showBalance("New withdraw value:");
	}
	
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public double getLimit() {
		return this.limit;
	}
}
