import pkg.*;

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter how many perfect squares you want to see: ");
		int num = sc.nextInt();
		CVMath.specialSquare(num);
		/*System.out.println(CVMath.findMid(2,3,1));*/
	}
}
