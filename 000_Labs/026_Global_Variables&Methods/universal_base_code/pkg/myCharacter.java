/*
 *	Author:  Jasmin Shim
 *  Date: 10/22/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    String role;
    int strength;
    int dexterity; 
    int intelligence;
    int charisma;

    public myCharacter(){
        role = "no role";
        int strength = 0;
		int dexerity = 0; 
		int intelligence = 0;
		int charisma = 0;
    }
    
    public myCharacter(String r){
        role = r;
        int strength = 5;
		int dexerity = 5; 
		int intelligence = 5;
		int charisma = 5;
	}
	
	public String getRole(){
	    return role;
	}
	
	public void showRole(String role){
	    if(role.equalsIgnoreCase("warrior")){
	        System.out.println("You chose warrior!!");
	    }
	    else if(role.equalsIgnoreCase("rogue")){
	        System.out.println("You chose rogue!!!");
	    }
	    else if(role.equalsIgnoreCase("wizard")){
	        System.out.println("You chose wizard!!");
	    }
	    else{
	        System.out.println("You didnt pick a role");
	        System.out.println("Rerun the program if u wanna try again");
	    }
	}
	
	public void myToString(){
		System.out.println("Your role is: " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
		System.out.println("------------------------------------------------");
	}
}
