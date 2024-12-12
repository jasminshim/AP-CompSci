/*
	Author:
	Date:
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter a word/sentence: ");
	String sentence = sc.nextLine();
	
	while(true){
		if(sentence.indexOf(" ") == -1){
			System.out.println(spongeCase(sentence));
			break;
		}
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		System.out.print(spongCase(word) + " ");
		
		sentence = sentence.substring(space + 1);
	}
	}
	public static String spongeCase(String word){
		String result = "";
		for(int i = 0; i < word.length(); i++){
		String letter = word.substring(i,i+1);
			if(i%2 == 0){
				letter = letter.toUpperCase();	
			}
			if(i%3 == 0){
				letter = letter.toLowerCase();
			}
		}
		return result = result + letter;
		}
	}
