package com.tasks;
import java.util.*;

//Assignment 1
public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int units;  
        double billToPay = 0;      
        Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter number of units: ");  
        units = sc.nextInt();  
  
        if(units >= 0 || units <= 50)  
        {  
            billToPay = units * 1;  
        }  
        else if(units >= 50 || units <= 100){  
            billToPay = 50 * 1 + (units - 50) * 2;  
        }  
        else if(units >= 100 || units <= 200)  
        {  
            billToPay = 50 * 1 + 50 * 2 + (units - 100) * 3;  
        }  
        else if(units >= 200 || units <= 400)  
        {  
            billToPay = 50 * 1 + 50 * 2 + 50 * 3 + (units - 200) * 4;  
        } 
        else if(units > 400)  
        {  
            billToPay = 50 * 1 + 50 * 2 + 50 * 3 + 50 * 4 + (units - 400) * 5;  
        } 
        System.out.println("Bill to pay for " +units+ " is : " + billToPay);   
    }   

}
