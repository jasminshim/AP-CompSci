/*
 *	Author:  Jasmin Shim
 *  Date: 10/22/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		myCharacter noRole = new myCharacter();
		noRole.myToString(); 
		
		System.out.println("What class would you like to be?");
		String r = sc.nextLine();
		
		myCharacter role = new myCharacter(r);
		role.myToString();
	}
}