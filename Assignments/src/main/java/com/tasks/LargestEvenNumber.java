package com.tasks;
import java.util.*;

//Assignment 8
public class LargestEvenNumber {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.nextLine().toCharArray();
		Set<Integer> dig=new HashSet<Integer>();
		for(int i=0;i<ch.length;i++) {
		    if(Character.isDigit(ch[i])) {
		        dig.add(Character.getNumericValue(ch[i]));
		    }
		}
	    ArrayList<Integer> diglist=new ArrayList<Integer>(dig);
	    Collections.sort(diglist,Collections.reverseOrder());
	    int len=diglist.size();
	    boolean evenDigitFound=false;
	    for(int i=len-1;i>=0;i--) {
            int digit=diglist.get(i);
            if(digit%2==0) {
                diglist.remove(i);
                diglist.add(digit);
                evenDigitFound=true;
                break;
            }
        }
        if(evenDigitFound==false) {
        	System.out.print("-1");
        }
        else {
            for(Integer d:diglist) {
                System.out.print(d);
            }
        }
	}
}
