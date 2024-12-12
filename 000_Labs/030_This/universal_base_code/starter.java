/*
 *	Author:  Jasmin Shim
 *  Date: 11/1/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf one = new PooleDwarf(randName(), 1);
		PooleDwarf two = new PooleDwarf(randName(), 2);
		PooleDwarf three = new PooleDwarf(randName(), 3);
		PooleDwarf four = new PooleDwarf(randName(), 4);
		PooleDwarf five = new PooleDwarf(randName(), 5);
		PooleDwarf six = new PooleDwarf(randName(), 6);
		PooleDwarf seven = new PooleDwarf(randName(), 7);
		
		String a = one.getName();
		two.getName();
		three.getName();
		four.getName();
		five.getName();
		six.getName();
		seven.getName();
		
		int count = 0;
		if(one.getName() == two.getName()){
			count++;
		}
		else if(one.getName() == three.getName()){
			count++;
		}
		else if(one.getName() == four.getName()){
			count++;
		}
		else if(one.getName() == five.getName()){
			count++;
		}
		else if(one.getName() == six.getName()){
			count++;
		}
		else if(one.getName() == seven.getName()){
			count++;
		}
		
		System.out.print(a + " was the name with " + count + " matches!" );
		
		}
	}
