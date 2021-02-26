package com.meritamerica.assignment1;


class CheckingAccount {
	private double balance;
	private double interestRate = 0.0001;
	double futureValue = 1;
	
	CheckingAccount(double openingBalance){
		balance = openingBalance;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	boolean withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else return false;
		
	}
	
	double futureValue(double years) {
		double futureValue = 1.0;
		futureValue = (balance * Math.pow((1+interestRate), years));
		return futureValue;
	}
	
	public String toString() {
		return "Checking Account Balance: $" + balance + "\n" +
				"Checking Account Interest Rate: " + interestRate + "\n" +
				"Checking Acount Balance in 3 Years: $" + futureValue(3);
	}
}