package hackerRankSolutions;

import java.util.Scanner;

public class Day2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();

		double tip = mealCost * tipPercent / 100;
		double tax = mealCost * taxPercent / 100;
		double totalCost = mealCost + tip + tax;

		System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars.");
		scan.close();
	}
}
