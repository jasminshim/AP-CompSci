/*
   * Author: Jasmin Shim
   * Date: 11/5/24
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter a sentence: ");
		String sent = sc.nextLine();
		
		String word = "";
		while(true){
			int space = sent.indexOf(" ");
			word = sent.substring(0,space);
			if(sent.indexOf(" ") == -1){
				System.out.println(sent);
				break;
			}
		if(word.substring(0) == "a" || word.substring(0) == "e" || word.substring(0) == "i" || word.substring(0) == "o" || word.substring(0) == "u"){
			System.out.print(word + "-way");
		}
		else{
			if(word.substring(1,2) == "a" || word.substring(1,2) == "e" || word.substring(1,2) == "i" || word.substring(1,2) == "o" || word.substring(1,2) == "u"){
				System.out.print(word.substring(word.length() - (word.length()-1)) + "-" + word.substring(0) + "ay");
		}
		}
		System.out.print(word.substring(word.length()-2, word.length()) + "ay"); 
	}
	}
	}
	

	

