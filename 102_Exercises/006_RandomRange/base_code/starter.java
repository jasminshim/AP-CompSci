/*
 *	Author: Jasmin Shim
 *  Date: 9/16/24
 *	Collaborator(s): nathaniel
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 
	System.out.print("Please enter an integer: ");
	int a = sc.nextInt();
	System.out.print("Please enter another integer (greater than the first one): ");
	int b = sc.nextInt();
	System.out.println("Your range is " + a + " to " + b);
	System.out.println("Here are five numbers generated in that range");
	System.out.print((int)((Math.random()*(b-a))+a)+", "); 
	System.out.print((int)((Math.random()*(b-a))+a)+", ");
	System.out.print((int)((Math.random()*(b-a))+a)+", "); 
	System.out.print((int)((Math.random()*(b-a))+a)+", "); 
	System.out.print((int)((Math.random()*(b-a))+a)); 
	
	}
}
