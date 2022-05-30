package com.tasks;

//Assignment 12
public abstract class Restaurant {
	
	public void printName() {
		System.out.println("print name of the Restaurant");
	}
	
	public abstract double totalPrice(double num);
	
	public abstract void menu();
	
}


class McDonald extends Restaurant {

	@Override
	public double totalPrice(double num) {
		// TODO Auto-generated method stub
		return num + (num *0.06);
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Print McDonald menu");
	}
	
}

class KFC extends Restaurant {

	@Override
	public double totalPrice(double num) {
		// TODO Auto-generated method stub
		return num + (num *0.06);
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Print KFC menu");
	}
	
}
