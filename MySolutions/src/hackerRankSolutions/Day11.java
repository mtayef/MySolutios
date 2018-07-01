package hackerRankSolutions;
import java.util.Scanner;

public class Day11 {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }        
        int max = arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
		for(int row = 0; row<arr.length-2; row++) {
			for(int col = 0; col<arr.length-2; col++) {
			 int tempMax = arr[row][col] + arr[row][col+1] + arr[row][col+2] + arr[row+1]                       [col+1] + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
				if(max < tempMax) {
					max = tempMax;
				}
			}
		}			
		System.out.println(max);
        scanner.close();
    }
}
