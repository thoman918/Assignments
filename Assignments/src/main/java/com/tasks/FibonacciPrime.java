package com.tasks;

import java.util.Scanner;

//Assignment 5
public class FibonacciPrime {
	
	Boolean isSquare(int n)
	{
	    int sr = (int)Math.sqrt(n);
	    return (sr * sr == n);
	}
	 
	static void printPrimeAndFib(int n)
	{

	    Boolean[] prime = new Boolean[n + 1];
	    
	    for (int p = 0; p <= n; p++)
	    prime[p] = true;
	    for (int p = 2; p * p <= n; p++) {
	        if (prime[p] == true) {
	            for (int i = p * 2; i <= n; i += p)
	                prime[i] = false;
	        }
	    }
	 
	    for (int i=2; i<=n; i++) {
	        double sqrt = Math.sqrt(5 * i * i + 4);
	        double sqrt1 = Math.sqrt(5 * i * i - 4);
	     
	        int x = (int) sqrt;
	        int y = (int) sqrt1;
	 
	    if (prime[i]==true && (Math.pow(sqrt,2) ==
	        Math.pow(x,2) || Math.pow(sqrt1,2) ==
	        Math.pow(y,2)))
	        System.out.print(i+" ");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		n = sc.nextInt();
	    printPrimeAndFib(n);
	}

}
