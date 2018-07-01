package hackerRankSolutions;
import java.util.Scanner;

public class Day5 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        for(int i = 1; i<=10; i++){
            int result = n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
        scanner.close();
    }
}

