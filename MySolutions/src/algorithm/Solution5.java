package algorithm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution5 {	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) throws Exception{
		String s = scan.nextLine();
		String result = timeConversion(s);
		System.out.println(result);
		scan.close();
	}
	  static String timeConversion(String s) throws Exception{
		  SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		  SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		  Date date = parseFormat.parse(s);
		  return displayFormat.format(date);
	  }
}