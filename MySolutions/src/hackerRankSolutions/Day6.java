package hackerRankSolutions;

import java.util.Scanner;

public class Day6 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		solution();
		scan.close();
	}

	public static void solution() {
		int T = scan.nextInt();
		String first = "";
		String second = "";

		for (int j = 0; j < T; j++) {
			String S = scan.next();

			for (int i = 0; i < S.length(); i++) {
				if (i % 2 == 0) {
					first += S.charAt(i);
				} else {
					second += S.charAt(i);
				}
			}
			System.out.println(first + " " + second);
			first = "";
			second = "";
		}
	}

	public static void solution2() {
		int T = scan.nextInt();

		for (int j = 0; j < T; j++) {
			String S = scan.next();

			for (int i = 0; i < S.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.print(" ");
			for (int x = 0; x < S.length(); x++) {
				if (x % 2 != 0) {
					System.out.print(S.charAt(x));
				}
			}
			System.out.println();
		}

	}
}
