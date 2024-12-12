/*
 *	Author: Jasmin Shim
 *  Date: 9/10/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your full name?");
	String name = sc.nextLine();
	System.out.println("Your full name is " + name);
	
	System.out.println("What is your age?");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("You are " + age + " years old");
	
	System.out.println("What month were you born in?");
	String month = sc.nextLine();
	System.out.println("You were born in the month of " + month);
	
	System.out.println("What day were you born on?");
	int day = sc.nextInt();
	System.out.println("You were born on the " + day);
	
	System.out.println("What year were you born in?");
	int year = sc.nextInt();
	System.out.println("You were born in " + year);
	
	System.out.println("How much is a buck fifty?");
	double dollar = sc.nextDouble();
	System.out.println("A buck fifty is " + dollar);
	
	
	}
}
