package com.tasks;

//Assignment 10
public interface Bank {
	public static final double rateOfInterest=14.99;
	public abstract int createAccount(String customerName, String idType, String id);  //abstract method
	String creditAmount(int accountNumber, double amount);
	String debitAmount(int accountNumber, double amount);
	String transferAmount(int fromAccountNumber, int toAccountNumber,double amount);
	String miniStatement(int AccountNumber);
}
