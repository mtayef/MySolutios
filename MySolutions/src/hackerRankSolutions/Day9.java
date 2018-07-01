package hackerRankSolutions;

import java.util.Scanner;

public class Day9 {
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
		scanner.close();
	}
}