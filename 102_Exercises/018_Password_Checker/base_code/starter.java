import java.util.*;
import java.io.*;

class starter {
    public static boolean contains(String password){
            if(password.indexOf("!") || password.indexOf("@") || password.indexOf("#") || password.indexOf("$") || password.indexOf("%") || password.indexOf("^") || password.indexOf("&") || password.indexOf("*")){
                return true;
            }   
            return false;
        }
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        
        
        boolean flag1 = false;
        boolean flag2 = false; 
        
		 for(int i = 0; i < passwords.length(); i++){
            if(passwords[i].length() >= 8){
                l1++;
                flag1 = true;
            }
            if(contains(passwords[i])) {
                l2++;
                flag2 = true;
            }
            if(flag1 && flag2){
                l3++;
            }
            
        }
        
        System.out.println("Strength 1: " + l1);
        System.out.println("Strength 2: " + l2);
        System.out.println("Strength 3: " + l3);
	}
}
