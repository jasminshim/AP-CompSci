/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.Scanner;

class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
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
            System.out.println(word);
            sent = sent.substring(space+1);
        }

        
	}
}