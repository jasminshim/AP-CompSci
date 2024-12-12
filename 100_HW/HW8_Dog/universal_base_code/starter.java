/*
 *	Author: Jasmin Shim
 *  Date: 10/22/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("cookie");
		dog1.setAge(13);
		
		Dog dog2 = new Dog("dori", "poodle");
		
		if(dog1.isSleeping()){
			System.out.println(dog1.getName() + " is sleeping!");
		}
		else{
			dog1.bark();
		}

		if(dog2.isSleeping()){
			if(!dog1.isSleeping()){
				dog2.bark();
			}
		}
		if(dog2.isSleeping()){
			if(dog1.isSleeping()){
				dog2.bark();
			}
		}
	}
}
