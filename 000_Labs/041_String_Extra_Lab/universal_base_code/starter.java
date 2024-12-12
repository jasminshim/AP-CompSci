/*
 *	Author:  Jasmin Shim
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("please enter a sentence: ");
        String sent = sc.nextLine();
        
        while(true){
            if(sent.indexOf(" ") == -1){
                System.out.println(sent);
                break;
            }
            int space = sent.indexOf(" ");
            String word = sent.substring(0, space);
            sent = sent.substring(space+1) + word;
        }
	}
}
	
