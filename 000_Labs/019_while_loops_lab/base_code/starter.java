/*
 *	Author: Jasmin Shim  
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a name: ");
	String name = sc.nextLine();
	System.out.print("How many times would you like this name to be repeated? ");
	int a = sc.nextInt();
	int b = 0;
	while(true)
	{
		System.out.println(name);
		if(b == a)
		{
			break;
		}
		b = b + 1;
	}



		
	}
}
