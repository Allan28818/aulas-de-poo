package atividade2;

public class BankAccount {
	protected String client;
	protected String accountNumber;
	protected double balance;
	
	public BankAccount(String client, String accountNumber, double balance) {
		this.client = client;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		System.out.printf("%s's account %s started with $ %.2f of balance\n", client, accountNumber, balance);
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		
		this.showBalance("New deposit value:");
	}
	
	public void withdraw(double withdrawAmount) throws InsufficientBalance {
		if(this.balance < withdrawAmount) {
			throw new InsufficientBalance("There isn't enough balance in your bank account!");
		}
		
		this.balance -= withdrawAmount;
		
		this.showBalance("New withdraw value:");
	}
	
	public void showBalance(String prefix) {
		if(prefix == null) {
			prefix = "";
		} else {
			prefix = String.format("%s ", prefix);
		}
		
		System.out.printf("%s$ %.2f\n", prefix, this.balance);	
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public String getClient() {
		return this.client;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
