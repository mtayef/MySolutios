package hackerRankSolutions;

import java.util.Scanner;

public class Day3 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scan.nextInt();
		scan.close();
		if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
	}
}