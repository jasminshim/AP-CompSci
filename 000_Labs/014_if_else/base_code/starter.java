/*
 *	Author:  Jasmin Shim
 *  Date: 9/17/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Pick a number between 1 - 1000: ");
	int x = sc.nextInt();
	int a = 1;
	int b = 1000;
	int y = (int)(Math.random()*(b-a)+a);
	
	if(x == y){
		System.out.println("Your number is correct");
	}
	if(x != y){
		System.out.println("Your number was not the random number. The number was " + y);
	}
	
	
	
	
	
	
	
	}
}
