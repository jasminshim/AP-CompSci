/*
 *	Author: Jasmin Shim
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[]arr =  new int[1001];
		 int i = 0;
		 int x = 3;
		 while(i<1001){
		 	arr[i] = x;
		 	System.out.print(arr[i] + ", ");
		 	i++;
		 	x = x + 3;
		 }
		 
		 System.out.println("------------------------------------------------------------------------------");
		 
		 int[]arr2 = new int[1001];
		 int c = 0;
		 int y = 1000;
		 while(c<1001){
		 	arr2[c] = y;
		 	System.out.print(arr2[c] + ", ");
		 	c++;
		 	y--;
		 	
		 }
	}
}
