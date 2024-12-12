/*
 *	Author: Jasmin Shim
 *  Date: 9/24/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int b = sc.nextInt();

	System.out.println("");
	
	if(a%2 == 0){
		System.out.println(a + " is divisible by 2!");
	}
	else{
		System.out.println(a + " is not divisible by 2!");
	}
	if(a%3 == 0){
		System.out.println(a + " is divisible by 3!");
	}
	else{
		System.out.println(a + " is not divisble by 3!");
	}
		
	System.out.println("");
	
	if(b%2 == 0){
		System.out.println(b + " is divisible by 2!");
	}
	else{
		System.out.println(b + " is not divisible by 2!");
	}
	if(b%3 == 0){
		System.out.println(b + " is divisible by 3!");
	}
	else{
		System.out.println(b + " is not divisble by 3!");
	}
	
	}
}

