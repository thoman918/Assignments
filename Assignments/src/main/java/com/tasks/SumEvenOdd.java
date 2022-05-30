package com.tasks;
import java.util.*;

//Assignments 3
public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
        int number;
        char choice;
        int even = 0;
        int odd = 0;
 
        do
        {
            System.out.print("Enter any number: ");
            number = sc.nextInt();
 
            if( number % 2 == 0)
            {
                even += number;
            }
            else
            {
                odd += number;
            }
 
            System.out.print("Do you want to add more numbers y/n? ");
            choice = sc.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
 
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
	}

}
