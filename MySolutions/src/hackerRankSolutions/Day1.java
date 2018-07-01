package hackerRankSolutions;
import java.util.Scanner;

public class Day1 {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        
	        int i2 = scan.nextInt();
	        double d2 = scan.nextDouble();
	        scan.nextLine();
	        String s2 = scan.nextLine();

	        int sumInt = i + i2;
	        double sumDouble = d + d2; 
	        String concat = s + s2;
	      
	        System.out.println(sumInt);
	        System.out.println(sumDouble);
	        System.out.println(concat);
	        
	        scan.close();
	        
	    }
}
