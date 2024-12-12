/*
 *	Author:  Jasmin Shim
 *  Date: 9/19/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What's your name?");
	String name = sc.nextLine();
	System.out.println("What's your title?");
	String title = sc.nextLine();
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
		System.out.println("You did not pick a role.");
	}
	
	System.out.println("");
	System.out.println("");
	
	int points = 20;
	
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	System.out.print("Strength (1-10): ");
	int strength = sc.nextInt();
	int a = (points-strength);
	if(strength<points){
			System.out.println("You have " + (points - strength) + " left to spend.");
		}
	else if(strength>points){
		System.out.println("Please enter a smaller value. Strength (1-10): ");
		String s = sc.nextLine();
	}
	
	System.out.print("Dexterity (1-10): ");
	int dexterity = sc.nextInt();
	int b = (a - dexterity);
	if(dexterity<a){
		System.out.println("You have " + (a - dexterity) + " left to spend.");
	}
	else if(dexterity>a){
		System.out.println("Please enter a smaller value. Dexterity (1-10): ");
		String h = sc.nextLine();
	}
	
	System.out.print("Intelligence (1-10): ");
	int intelligence = sc.nextInt();
	int c = (b - intelligence);
	if(intelligence<b){
		System.out.println("You have " + (b - intelligence) + " left to spend.");
	}
	else if(intelligence>b){
		System.out.println("Please enter a smaller value. Intelligence (1-10): ");
		String i = sc.nextLine();
	}
	
	System.out.print("Charisma (1-10): ");
	int charisma = sc.nextInt();
	int d = (c - charisma);
	if(charisma<c){
		System.out.println("You have " + (c - charisma) + " left to spend.");
	}
	if(charisma>c){
		System.out.println("Please enter a smaller value. Charisma (1-10): ");
		String m = sc.nextLine();
	}
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	System.out.println("You are " + name + ", " + title + "!");
	System.out.println("You're a " + role + " with the following stats:");
	System.out.println("Strength - " + strength);
	System.out.println("Dexterity - " + dexterity);
	System.out.println("Intelligence - " + intelligence);
	System.out.println("Charisma - " + charisma);
	System.out.println("Goodluck on your quest " + name + "!");
	
	
	
	}
}
