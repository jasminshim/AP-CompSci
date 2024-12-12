/*
 *	Author:  Jasmin Shim
 *  Date: 11/7/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int arr[] = new int[(int)(Math.random()*149)+51];
		System.out.println("there are " + arr.length + " elements");
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random()*99)+1);
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int num = 0;
		int totalsum = 0;
		for(int c = 0; c < arr.length; c++){
			if(arr[c] < min){
				min = arr[c];
			}
			if(arr[c] > max){
				max = arr[c];
			}
			num = arr[c];
			totalsum = num + totalsum;
		}
		System.out.println("the maximum is " + max);
		System.out.println("the minimum is " + min);
		System.out.println("the average is " + (totalsum/arr.length));
	}
}
