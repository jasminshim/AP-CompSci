/*
 *	Author:  Jasmin Shim
 *  Date: 10/8/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		myCharacter noRole = new myCharacter();
		
		System.out.println("Your role is: " + noRole.getRole());
		System.out.println("Your strength trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your intelligence trait is 0");
		System.out.println("Your constitution trait is 0");
		System.out.println("Your charisma trait is 0");
		System.out.println("------------------------------------------------");
		
		System.out.println("What class would you like to be?");
		String r = sc.nextLine();
		
		myCharacter role = new myCharacter(r);
		
		role.showRole(r);
	
		System.out.println("Your role is: " + role.getRole());
		System.out.println("Your strength trait is 5");
		System.out.println("Your dexterity trait is 5");
		System.out.println("Your intelligence trait is 5");
		System.out.println("Your constitution trait is 5");
		System.out.println("Your charisma trait is 5");
		System.out.println("------------------------------------------------");
		

	}
}

