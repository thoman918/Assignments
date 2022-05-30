package com.tasks;
import java.util.*;

//Assignment 4
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row;
		
		System.out.print("Enter any number: ");
		
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		for (i = 1; i <= row; i++)
		{
			for(j = 1; j <= row-i; j++)
			{
				System.out.print(" ");
			}
			
			for(j = i; j >= 1; j--)
			{
				System.out.print(j);
			}
			
			for(j = 2; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
