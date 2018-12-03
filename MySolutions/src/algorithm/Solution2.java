package algorithm;
import java.util.Scanner;

public class Solution2 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int no = scan.nextInt();
		
		for (int i = 1; i<=no;i++) {
            for (int j = no; j >=1; j--) {
            	String result = j>i ? " " : "#";
            	System.out.print(result);
            	/*if (j>i)
            	System.out.print(" ");
            	else
            	System.out.print("#");*/
            }
            System.out.println();
            scan.close();
    	}
	}
}
