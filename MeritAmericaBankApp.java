package com.meritamerica.assignment1;

public class MeritAmericaBankApp { 
	public static void main(String[] args) {
		AccountHolder accountHolder1 = new AccountHolder(100.0, 1000.0);
		System.out.println(accountHolder1.toString());
		accountHolder1.getCheckingAccount().deposit(500.0); 
		accountHolder1.getSavingsAccount().withdraw(800.0);
		System.out.println(accountHolder1.getCheckingAccount().toString()); 
		System.out.println(accountHolder1.getSavingsAccount().toString());
		AccountHolder accountHolder2 = new AccountHolder(200, 500);
		accountHolder2.getCheckingAccount().deposit(-500);
		accountHolder2.getSavingsAccount().withdraw(600);
		System.out.println(accountHolder2.toString());
	}
}