package com.tasks;

import java.util.Scanner;

//Assignment 15
public class ATMPINValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int correctPIN = 333;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter PIN");
		int pinNo = scanner.nextInt();
		
		int count = 3;
		
		while (count != 0) {
			if (pinNo != correctPIN) {
				if (count != 0) {
					System.out.println("Enter PIN");
					pinNo = scanner.nextInt();
					count--;
				}
				else {
					throw new LockedException();
				}
			}
			else {
				System.out.println("Logged in");
				break;
			}	
		}
	}
}

class LockedException extends RuntimeException{
	public LockedException() {
		System.out.println("Account is blocked");
	}
}
