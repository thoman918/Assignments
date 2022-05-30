package com.tasks;

//Assignment 11
public abstract class Print implements Bill {

	public void printBill(double amount) {
		// TODO Auto-generated method stub
		
	}



}


class PowerBill extends Print {

	public double calcBill(int units) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class WaterBill extends Print {

	public double calcBill(int units) {
		// TODO Auto-generated method stub
		return 0;
	}

}
