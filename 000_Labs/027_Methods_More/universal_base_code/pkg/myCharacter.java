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
        int strength = 0;
		int dexerity = 0; 
		int intelligence = 0;
		int charisma = 0;
	}
	
	public int setStrength(int x){
		if(x<0){
			strength = 0;
		}
		return strength;
	}
	public int setDexterity(int x){
		if(x<0){
			dexterity = 0;
		}
		return dexterity;
	}
	public int setIntelligence(int x){
		if(x<0){
			intelligence = 0;
		}
		return intelligence;
	}
	public int setCharisma(int x){
		if(x<0){
			charisma = 0;
		}
		return charisma;
	}
	
	
	public boolean setAll(String r, int s, int d, int i, int c){
		if(((setRole(r) != "warrior") || (setRole(r) != "wizard") || (setRole(r) != "rogue")) && (setStrength(s)>=0) && (setDexterity(d)>=0) && (setIntelligence(i)>=0) && (setCharisma(c)>=0)){
			return true;
		}
		return false;
	}
	
	public String setRole(String role){
	    if(role.equalsIgnoreCase("warrior")){
	        System.out.println("You chose warrior!!");
	        role = ("warrior");
	    }
	    else if(role.equalsIgnoreCase("rogue")){
	        System.out.println("You chose rogue!!!");
	        role = ("rogue");
	    }
	    else if(role.equalsIgnoreCase("wizard")){
	        System.out.println("You chose wizard!!");
	        role = ("wizard");
	    }
	    else{
	        System.out.println("You didnt pick a role");
	        System.out.println("Rerun the program if u wanna try again");
	    }
	    return role;
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

