package com.tasks;

//Assignment 13
public abstract class Shape {
	public int num1 = 1;
	public int num2 = 2;
	
	public void printArea() {
		
	}
}

class Rectangle extends Shape {
	
	int length = super.num1;
	int width = super.num2;

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println(length * width);
	}
	
}

class Triangle extends Shape {

	int base = super.num1;
	int height = super.num2;
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println((base * height)/2);
	}
	
}

class Circle extends Shape{
	
	int radius = super.num1;
			
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println(radius*radius*3.14);
	}
	
}