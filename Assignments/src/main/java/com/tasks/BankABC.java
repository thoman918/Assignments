package com.tasks;

//Assignment 9
class Bank0{
	int getBalance(){ 
		return 0; 
	}
}

class BankA extends Bank0{
	int getBalance(int balance) { 
		return balance; 
	}
}

class BankB extends Bank0{
	int getBalance(int balance) { 
		return balance; 
	}
}

class BankC extends Bank0{
	int getBalance(int balance) { 
		return balance; 
	}
}


public class BankABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a = new BankA();
		BankB b = new BankB(); BankC c = new BankC();

		System.out.println("$" +a.getBalance(1000));
		System.out.println("$" +b.getBalance(1500));
		System.out.println("$" +c.getBalance(2000));
	}

}
