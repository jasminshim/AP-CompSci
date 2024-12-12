/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("You're a student getting ready for a snowy day at school and need to make a few important choices. How will you prepare for school?");
    System.out.println("1. wear a sweater");
    System.out.println("2. wear a tshirt");
    System.out.println("3. wear a puffer jacket");
    
    int answer1 = sc.nextInt();
    
    if(answer1 == 1){
        System.out.println("You will wear a sweater");
	}
	else if(answer1 == 2){
	    System.out.println("You will wear a tshirt");
	}
	else if(answer1 == 3){
	    System.out.println("You will wear a puffer jacket");
	}
	else{
	  System.out.println("You didn't type a correct answer");  
	}
        
    System.out.println("What will you bring to school"); 
    System.out.println("1. your backpack");  
    System.out.println("2. a book");  
    System.out.println("3. your laptop");  
    int answer2 = sc.nextInt();
    if(answer2 == 1){
        System.out.println("You brought your backpack to school");
    }
    else if(answer2 == 2){
        System.out.println("You brought a book to school");
    }
    else if(answer2 == 3){
        System.out.println("You brought your laptop to school");
    }
    else{
        System.out.println("You didn't bring anything to school");
    }
    }}
	