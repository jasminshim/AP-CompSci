/*
 *	Author: Jasmin Shim 
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		return (int)(Math.pow(a,b));
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number: ");
	int a = sc.nextInt();
	System.out.println("What is your exponent number: ");
	int b = sc.nextInt();
	
	System.out.println("");
	
	System.out.print("Your answer is: " + pow(a,b));



		
	}
}
