package entities;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;
	
//	Constructors
	public BankAccount(int accountNumber, String name, double innitialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(innitialDeposit);
	}
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
//	Getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	
//	Methods
	public void deposit(double quantity) {
		balance += quantity;
	}
	
	public void withdraw(double quantity) {
		balance -= quantity + 5.0;
	}

	public String toString() {
		return "Updated account data:\n"	
				+ "Number: " + accountNumber
				+ "\nHolder: " + name
				+ "\nBalance: " + String.format("%.2f", balance) + "\n";
	}


}







