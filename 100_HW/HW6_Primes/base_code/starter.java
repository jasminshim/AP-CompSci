/*
 *	Author: Jasmin Shim
 *  Date: 10/10/24
*/

import java.util.Scanner;

class starter {
public static boolean checkPrime(int x){
	int count = x - 1; 
	while(count > 2){
		if(x % count == 0){
			return false;
		}
		else{
			count = count - 1;
		}
	}
	return true;
}

public static void printPrimes(int x){
	int a = 0;
	while(a < x){
		if(checkPrime(a)){
			System.out.println(a);
		}
		a = a + 1;
	}
	return;
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int x = sc.nextInt();
		printPrimes(x);
		}
	}

