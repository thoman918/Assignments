package com.tasks;

import java.util.Scanner;

//Assignment 14
public class CreditException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Credit");
		if(scanner.nextInt()<50) {
			throw new CreditsNotSuffiecientException();
		}else {
			System.out.println("Processed");
		}
		scanner.close();
	}

}



class CreditsNotSuffiecientException extends RuntimeException{
	public CreditsNotSuffiecientException() {
		System.out.println("Sorry... You are too young to marry,, Please wait");
	}
}

