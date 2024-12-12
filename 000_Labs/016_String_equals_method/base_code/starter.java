/*
 *	Author: Jasmin Shim 
 *  Date: 9/19/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
	String role = sc.nextLine();
	
	if(role.equalsIgnoreCase("Wizard")){
		System.out.println("You picked Wizard!");
	}
	else if(role.equalsIgnoreCase("Warrior")){
		System.out.println("You picked Warrior!");
	}
	else if(role.equalsIgnoreCase("Rogue")){
		System.out.println("You picked Rogue!");
	}	
	else{
		System.out.println("You did not choose a role.");
	}	
		
		
		
	}
}
