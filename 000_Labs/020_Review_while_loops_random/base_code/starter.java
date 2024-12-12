/*
 *	Author: Jasmin Shim
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int num = (int)(Math.random()*1000);
	
	while(true){
		System.out.print("Guess a number: ");
		int a = sc.nextInt();
	if(a > num){
		System.out.println("You're a little too high!");
	}
	else if(a < num){
		System.out.println("You're a little too low!");
	}
	if(a == num){
		System.out.print("You got it!");
	}
	if(a == num)
		{
			break;
		}

	}
	
	}
}
	
