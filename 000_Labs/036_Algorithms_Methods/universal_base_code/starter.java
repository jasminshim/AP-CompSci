/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static int getArrayAverage(int[] x){
		int sum = 0;
		for(int i = 0; i < x.length; i++){
			sum = sum + x[i];
		}
		return sum/x.length;
	}
	public static int getArrayMax(int[] x){
		int max = Integer.MIN_VALUE;
		for(int a = 0; a < x.length; a++){
			if(x[a] > max){
				max = x[a];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] x){
		int min = Integer.MAX_VALUE;
		for(int b = 0; b < x.length; b++){
			if(x[b] < min){
				min = x[b];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		int [] arr = new int[100];
		for(int c = 0; c < arr.length; c++){
			arr[c] = (int)((Math.random()*100)+1);
		}
	toStringArray(arr);
	System.out.println("the avg is " + getArrayAverage(arr));
	System.out.println("the max is " + getArrayMax(arr));
	System.out.println("the min is " + getArrayMin(arr));


		
	}
}
