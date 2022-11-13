package entities;

public class BankAccount {
	private int accountNumber;
	protected String name;
	public double innitialDeposit;
	private double balance;
	private static final double tax = 5.0;
	
//	Constructors
	public BankAccount(int accountNumber, String name, double innitialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.innitialDeposit = innitialDeposit;
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

	public double getInnitialDeposit() {
		return innitialDeposit;
	}

	public void setInnitialDeposit(double innitialDeposit) {
		this.innitialDeposit = innitialDeposit;
	}

	public double getBalance() {
		return balance;
	}
	
	public static double getTax() {
		return tax;
	}
	
//	Methods
	public double deposit(double quantity) {
		return balance + quantity;
	}
	
	public double withdraw(double quantity) {
		return quantity + tax;
	}
	
	public void showData(double balance) {
		System.out.printf("Updated account data:\n"
				+ "Number: " + accountNumber
				+ "\nHolder: %s", name
				+ "\nBalance: " + balance + "\n");
	}

}







