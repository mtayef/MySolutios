package algorithm;

import java.util.Scanner;

public class Solution3 {
	private static final int size = 5;
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		long min = Long.MAX_VALUE;
		long max = 0;
		long sum = 0;
		for (int i = 0; i < size; i++) {
			long curr = scan.nextLong();
			if (max < curr) {
				max = curr;
			}
			if (min > curr) {
				min = curr;
			}

			sum += curr;
		}
		long minSum = sum - max;// Removes the largest of the 5 numbers to get the min sum
		long maxSum = sum - min;// Removes the smallest of the 5 numbers to get the max sum
		System.out.println(minSum + " " + maxSum);
		
		scan.close();
	}
}
