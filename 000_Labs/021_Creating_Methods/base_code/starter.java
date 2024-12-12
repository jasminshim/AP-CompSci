/*
 *	Author:  Jasmin Shim
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	public static void toString(String a, String b){
		System.out.print(a + " " + b);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String a = sc.nextLine();
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		
	System.out.println("");
	
	System.out.println("This is using the methods!");
	toString(a);
	toString(a + " " + b);
		
		
	}
}
