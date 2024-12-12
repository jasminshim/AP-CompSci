/*
 *	Author:  Jasmin Shim
 *  Date: 11/4/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] wizard = new Wizard[100];
		for(int x = 0; x < wizard.length; x++){
			wizard[x] = new Wizard();
		}
		Warrior [] warrior = new Warrior[100];
		for(int y = 0; y < warrior.length; y++){
			warrior[y] = new Warrior();
		}
		
		for(int i = 0; i < 99; i++){
			wizard[i].attack(warrior[i]);
			if(warrior[i].isDead()){
				warrior[i] = warrior[i+1];
			}
			warrior[i].attack(wizard[i]);
			if(wizard[i].isDead()){
				wizard[i] = wizard[i+1];
			}
			if(wizard[99].isDead()){
					System.out.println("warrior wins with " + (100 - i)  + " left in their army");
			}
			else{
					System.out.println("wizard wins with " + (100 - i) + " left in their army");
			}
		}
	}
}