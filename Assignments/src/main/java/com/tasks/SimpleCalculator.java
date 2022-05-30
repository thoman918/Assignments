package com.tasks;
import java.util.*;

//Assignment 2
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
	    Double number1, number2, result;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    System.out.println("Enter 1st number");
	    number1 = input.nextDouble();

	    System.out.println("Enter 2nd number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	}

}
