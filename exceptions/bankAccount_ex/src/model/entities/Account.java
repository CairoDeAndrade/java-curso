package model.entities;

import model.exceptions.DepositException;
import model.exceptions.WithdrawException;

public class Account {
	private Integer id;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	private Double depositLimit;

	public Account() {
	}

	public Account(Integer id, String holder, Double balance, Double withdrawLimit, Double depositLimit) {
		this.id = id;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		this.depositLimit = depositLimit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getDepositLimit() {
		return depositLimit;
	}

	public void setDepositLimit(Double depositLimit) {
		this.depositLimit = depositLimit;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	// Validating deposit and withdraw services
	public void deposit(Double amount) {
		validatedeposit(amount);
		balance += amount;
	}

	private void validatedeposit(Double amount) {
		if (amount <= 0) {
			throw new DepositException("The amount requested is invalid!");
		}
		if (amount > depositLimit) {
			throw new DepositException("The amount of deposit is bigger" + " than your limit!");
		}
	}

	public void withdraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateWithdraw(Double amount) {
		if (amount <= 0) {
			throw new WithdrawException("The amount requested is invalid!");
		}
		if (balance <= 0) {
			throw new WithdrawException("The balance of your account is not enough!");
		}
		if (amount > withdrawLimit) {
			throw new WithdrawException("The amount of withdraw is bigger"
					+ " than your limit!");
		}
	}

	@Override
	public String toString() {
		return "New balance : $ " + String.format("%.2f", balance);
	}
}
