package pkg;

public class CVMath {
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int num){
		int c = 0;
		while(num > 0){
			if(Math.pow(1+8*Math.pow(c,2), 0.5)%1==0){
				System.out.println((int)(Math.pow(c,2)));
				num--;
			}
			c++;
			}
		}
	}