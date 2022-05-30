package com.tasks;
import java.util.*;

//Assignment 7
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, revStr = "";
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter a string:");
	    str = sc.nextLine();
	 
	    int length = str.length();
	 
	    for ( int i = length - 1; i >= 0; i-- )
	    	revStr = revStr + str.charAt(i);
	 
	    if (str.equals(revStr))
	        System.out.println(str+" is a palindrome");
	    else
	        System.out.println(str+" is not a palindrome");
	}

}
