package com.tasks;

//Assignment 6
public class MultiplicationMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		int a[][]={{2,2,2},{4,4,4},{6,6,6}};    
		int b[][]={{2,2,2},{4,4,4},{6,6,6}};    
		    
		int c[][]=new int[3][3]; 
		    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++) {      
					c[i][j]+=a[i][k]*b[k][j];      
				}
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();  
		}    
	}

}
