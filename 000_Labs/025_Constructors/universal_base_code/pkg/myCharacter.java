/*
 *	Author:  Jasmin Shim
 *  Date: 10/8/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    String role;

    public myCharacter(){
        role = "no role";
    }
    
    public myCharacter(String r){
        role = r;
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
}