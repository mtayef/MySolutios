package hackerRankSolutions;
import java.util.Scanner;

public class Day7 {
	private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int k = 0;
        int[] reversed = new int[n];
        for(int i = n-1; i>=0; i--){
            reversed[k] = nums[i];
            k++;
        }
        for(int temp: reversed){
            System.out.print(temp + " ");
        }
        scan.close();
    }
    /*public static void solution() {
		int n = scan.nextInt();
        int[] nums = new int[n];
        
        int k = 0;
        while(k < n){
            nums[k] = scan.nextInt();     
            k++;
        }
        
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
	}*/
}
