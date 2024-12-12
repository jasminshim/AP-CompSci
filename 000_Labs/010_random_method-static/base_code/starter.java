/*
 *	Author:  Jasmin Shim
 *  Date: 9/13/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	int a = (int)(Math.random()*9);
	System.out.println("An integer between 0 - 9: " + a);
	
	int b = (int)(Math.random()*99)+1;
	System.out.println("An integer between 1 - 100: " + b);
	
	double c = (double)(Math.random()*1)+2.5;
	System.out.println("A double between 2.5 - 3.5: " + c);
	
	double d = (double)(Math.random()*575)+14;
	System.out.println("A double between 14 and 589: " + d);
	}
}
