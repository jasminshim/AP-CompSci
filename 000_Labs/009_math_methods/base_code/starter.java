/*
 *	Author: Jasmin Shim
 *  Date: 9/11/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	int a = 13-6*11;
	int b = 30%7*(-2);
	System.out.println("Maximum = " + Math.max(a,b));
	
	int c = 3*8+31%7;
	System.out.println("Square root = " + Math.sqrt(c));
	
	int d = 37/3;
	int e = 35%21;
	System.out.println("Power = " + Math.pow(d,e));
	
	int f = 2;
	int g = 14%3;
	int h = 2*6;
	System.out.println("Max = " + Math.max((Math.pow(f,g)),Math.sqrt(h)));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a double: ");
	double num1 = sc.nextDouble();
	System.out.println("Please enter another double");
	double num2 = sc.nextDouble();
	
	System.out.println("Max = " + Math.max(num1,num2));
	System.out.println("Square Root = " + Math.sqrt(num2));
	System.out.println("Power = " + Math.pow(num1,num2));
	
	
	
	
	}
}
