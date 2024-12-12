/*
 *	Author: Jasmin Shim
 *  Date: 11/5/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("these are the 20 numbers");
		int[]arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*10) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		
		int random = (int)(Math.random()*10)+1;
		System.out.println("The random number to look for is " + random);
		int count = 0;
		for(int c = 0; c < arr.length; c++){
			if(random == arr[c]){
				count++;
				System.out.println("theres a duplicate at " + c);
			}
		}
		System.out.println("total num of duplicates for " + random + " is " + count);
		System.out.println("--------------------------------------------------------");
		
		for(int p = 0; p < arr.length - 1; p++){
			if(arr[p] == arr[p+1]){
				System.out.println(p + " and " + (p+1) + " are consecutive. the number is " + arr[p]);
			}
		}
	}
}
