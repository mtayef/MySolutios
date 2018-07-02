package algorithm;
import java.util.*;

public class Solution {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine()); // array size
		int[][] nums = new int[n][n]; // new array
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String[] tempArray = str.split(" ");
			for (int j = 0; j < n; j++) {
				nums[i][j] = Integer.parseInt(tempArray[j]);
			}
		}
		int x = 0;// primary diagonal sum
		int y = 0;// secondary diagonal sum
		int sum = 0;// total sum
		for (int i = 0; i < n; i++) {
			x += nums[i][i];
		}
		for (int p = 0; p < n; p++) {
			@SuppressWarnings("unused")
			int k = nums.length - p - 1;
			y += nums[p][nums.length - p - 1];
			k += -1;
		}
		sum = x - y;
		System.out.println(Math.abs(sum));
		scan.close();
	}
}
