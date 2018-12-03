package algorithm;
import java.util.Scanner;

public class Solution6 {	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    /* Enter your code here. Read input from STDIN. 
	     * Print output to STDOUT. Your class should be named Solution. */
	    String inputTime = scan.nextLine();
	    String [] tempArray = inputTime.split(":");
	    String hours = tempArray[0];
	    String minutes = tempArray[1];
	    String seconds = tempArray[2].substring(0, 2);
	    
	    int tempHours;
	    
	    if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
	      if (Integer.parseInt(hours) < 12) {
	        tempHours = Integer.parseInt(hours);
	        tempHours += 12;
	        hours = Integer.toString(tempHours);
	      }
	    }
	    if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
	      if (Integer.parseInt(hours) == 12) {
	        hours = "00";
	      }
	    }
	    System.out.println(hours + ":" + minutes + ":" + seconds);
	    
	    
	  }
	}