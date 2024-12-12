/*
 *	Author:  Jasmin Shim
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = "computer";
		int attempts = 6;
		System.out.println("lets play hangman!");
		System.out.println("  ㅜㅡㅡㅡㅜ \n  |	| \n  	| \n    	|\n     	|\n==========");
		while(attempts > 1){
			System.out.print("guess a letter: ");
			String guess = sc.nextLine();
			
			if(word.contains(guess)){
				System.out.println("correct");
				System.out.println("-------------------------------------------------");
			}
			else{
				attempts--;
				printHangman(attempts);
				System.out.println("incorrect");
				System.out.println("-------------------------------------------------");
			}
			if(attempts == 1){
				System.out.print("nice try! the word was " + word);
			}
		}
	}
	public static void printHangman(int attempts){
		String [] hangman = {"  ㅜㅡㅡㅡㅜ \n  |	| \n  	| \n    	|\n     	|\n==========", "  ㅜㅡㅡㅡㅜ \n  |	| \n  O	| \n    	|\n     	|\n==========", "  ㅜㅡㅡㅡㅜ \n  |	| \n  O	| \n /| 	|\n     	|\n==========", "  ㅜㅡㅡㅡㅜ \n  |	| \n  O	| \n /|\\	|\n     	|\n==========", "  ㅜㅡㅡㅡㅜ \n  |	| \n  O	| \n /|\\	|\n /   	|\n==========", "  ㅜㅡㅡㅡㅜ \n  |	| \n  O	| \n /|\\	|\n / \\	|\n=========="};
		int i = 6 - attempts;
		System.out.println(hangman[i]);
		} 
	} 

	

