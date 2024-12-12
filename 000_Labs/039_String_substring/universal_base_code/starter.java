/*
 *	Author:  Jasmin Shim
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("enter a word: \n");
	String x = sc.nextLine();
	System.out.print("letter by letter \n");
	for(int i = 0; i < x.length(); i++){
		System.out.println(i + " " + x.substring(i, i+1));
	}


		
	}
}
