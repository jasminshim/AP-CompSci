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
	System.out.print("enter a first and last name with a space in the middle \n");
	String name = sc.nextLine();
	
	for(int i = 0; i < name.length(); i++){
		if(name.substring(i, i+1).equals(" ")){
			System.out.print("the last name is: " + name.substring(i+1, name.length()));
		}
	}
}
}
