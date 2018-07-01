package hackerRankSolutions;

import java.util.Scanner;

public class Day10 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int count = 0;
		int consecutive = 0;

		String binaryNo = Integer.toBinaryString(n);

		for (int i = 0; i < binaryNo.length(); i++) {
			
			count = (binaryNo.charAt(i) == '0') ? 0 : count + 1;
			
			/*if (binaryNo.charAt(i) == '0') {
				count = 0;
			} else {
				count ++;
			}*/
			if (count > consecutive) {
				consecutive = count;
			}
		}
		System.out.println(consecutive);
		scan.close();
	}
}
