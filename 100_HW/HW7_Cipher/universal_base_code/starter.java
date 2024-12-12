/*
 *	Author: Jasmin Shim
 *  Date: 10/17/24
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a message you want to decipher: ");
	String code1 = sc.nextLine();
	System.out.println("Enter the key to help me decipher: ");
	int num = sc.nextInt();
	
	
	Cipher msg1 = new Cipher();
	msg1.encode(code1);
	String a = msg1.keyedEncode(code1, num);
	
	System.out.println("Your message encoded is: " + a);

	}
}
