/*
 *	Author: Jasmin Shim
 *  Date: 9/30/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("		a. If two numbers match, you double your money.");
		System.out.println("		b. If three numbers match, you triple your money.");
		System.out.println("		c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
			
		int money = 100;
		int profit = 0;
		
		while(money>0){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
			String answer = sc.nextLine();
			
			if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			int c = (int)(Math.random()*10);
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				profit = sc.nextInt();
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("_________________________");
				System.out.println(" | " + a + " | " + b + " | " + c + " | ");
				System.out.println("_________________________");
				if(a == b && b == c){
					System.out.println("You won! You're wager has now been tripled!");
					money = (money - profit) + (profit*3);
					System.out.println("You now have $" + money + ".");
				}
				else if(a == b || b == c || c == a){
					System.out.println("You won! You're wager has now been doubled!");
					money = (money - profit) + (profit*2);
					System.out.println("You now have $" + money + ".");
				}
				else{
					System.out.println("Didn't win this time, better luck next time!");
					money = money - profit;
					System.out.println("You now have $" + money + ".");
				}
			}
			if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}
			
			
		}
		if(money == 0){
		System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		}
	}
}
