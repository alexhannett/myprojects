package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance;
	private double interestRate = 0.01;
	double futureValue = 1;
	
	public SavingsAccount(double openingBalance) {
		balance = openingBalance;
	}
	
	public double getBalance() {
	
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getFutureValue() {
		return futureValue;
	}

	public Boolean withdraw(double amount) {
		if(amount <= balance && amount > 0) {
			balance -= amount;
			return true;
		} else { return false; }
	}
	
	public Boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		} else { return false; }
	}
	
	public double futureValue(int years) {
		futureValue = (getBalance() * Math.pow((1+interestRate), years));
		return futureValue;
	}
	
	public String toString() {
		return "Savings Account Balance: $" + balance + "\n" +
				"Savings Account Interest Rate: " + interestRate + "\n" +
				"Savings Acount Balance in 3 Years: $" + futureValue(3);
	}
	
}