/*
 *	Author: Jasmin Shim
 *  Date: 9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	double dec = 5.0;
	
	System.out.print("Please enter a number: ");
	int num = sc.nextInt();
	
	System.out.println("Here are the next 5 numbers!");
	System.out.println(num + "," + (num + 1) + "," + (num + 2) + "," + (num + 3) + "," + (num + 4) + "," + (num + 5));

	System.out.println("Here are the next 5 multiples of 5!");
	System.out.println(num + "," + (num + 5) + "," + (num + 10) + "," + (num + 15) + "," + (num + 20));
	
	System.out.println("Print out the input integer divided by 100");
	System.out.println(dec/100);
	
	System.out.println("Print out the integer divided by 10");
	System.out.println(dec/10);

	

	}
}
