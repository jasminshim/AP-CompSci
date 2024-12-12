/*
 *	Author:  Jasmin Shim
 *  Date: 9/17/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter your first number: ");
	int a = sc.nextInt();
	
	System.out.print("Please enter your second number: ");
	int b = sc.nextInt();
	
	System.out.print("Please enter your third number: ");
	int c = sc.nextInt();
	
	if((a>b) && (a>c)){
		 System.out.println("Your first number was the largest of the three");
	}
	else if((b>a) && (b>c)){
		 System.out.println("Your second number was the largest of the three");
	}
	else if((c>a) && (c>b)){
		 System.out.println("Your third number was the largest of the three");
	}
	
	
	if((a<b) && (a<c)){
		 System.out.println("Your first number was the smalllest of the three");
	}
	else if((b<a) && (b<c)){
		 System.out.println("Your second number was the smallest of the three");
	}
	else if((c<a) && (c<b)){
		 System.out.println("Your third number was the smallest of the three");
	}
	
	
	}
}
