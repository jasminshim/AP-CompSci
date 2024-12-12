/*
 *	Author:  Jasmin Shim
 *  Date: 9/13/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your first number: ");
	int num1 = sc.nextInt();
	
	System.out.print("Please enter your second number: ");
	int num2 = sc.nextInt();
	
	boolean x = num1!=num2;
	if (x) 
	{
		System.out.print("Your numbers are different!");
	}
	
	boolean y = num1==num2;
	if (y) 
	{
		System.out.print("Your numbers are equal!");
	}
	}
}
