package algorithm;

import java.util.Scanner;

public class Solution4 {
    static int birthdayCakeCandles(int[] ar) {
    	int max = 0; 
    	int count = 0;
        for(int i = 0; i<ar.length; i++){
        	if (max<ar[i]) {
        	max = ar[i];
        	count = 1;
        	} else if(max == ar[i]) {
        		count++;
        	}
        }
        return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int arCount = scan.nextInt();
        int[] ar = new int[arCount];
        
        for(int i = 0; i<arCount; i++) {
        	ar[i]= scan.nextInt();
        }
        
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        scan.close();
    }
}
