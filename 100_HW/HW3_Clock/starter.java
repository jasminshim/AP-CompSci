/*
 *	Author: Jasmin Shim
 *  Date:9/18/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter what weekday it is(0-6): ");
		int day = sc.nextInt();
		
	if((day == 1) || (day == 2) || (day == 3) || (day == 4) || (day == 5)){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
	else if((day == 6) || (day == 0)){
			System.out.println("It's the weekend! Yay! Wake up! It's 10AM!");
		}
	else{
			System.out.println("You input something that is not valid.");
		}
	}
}
