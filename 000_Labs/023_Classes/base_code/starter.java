/*
 *	Author:  Jasmin Shim
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Warrior");
}
class starter {
	public static void main(String args[]){ 
		Character myCharacter = new Character();
		System.out.println("Your role is " + myCharacter.role);
		
int strength = 5;
int dexterity = 5;
int intelligence = 5;
int charisma = 5;

	System.out.println("Your strength trait is " + strength);	
	System.out.println("Your dexterity trait is " + dexterity);
	System.out.println("Your intelligence trait is " + intelligence);
	System.out.println("Your charisma trait is " + charisma);
	}
}
