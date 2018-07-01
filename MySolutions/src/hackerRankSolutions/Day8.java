package hackerRankSolutions;
import java.util.Scanner;
import java.util.HashMap;

public class Day8 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		HashMap<String,Integer> map = new HashMap<String,Integer>();	
		
		for (int i = 0; i < n; i++) {
			String name = scan.next(); 
			int phone = scan.nextInt();
			map.put(name, phone);
		}
		for(int i = 0; i<n; i++) {
			String s = scan.next();
			if(map.containsKey(s)) {
				System.out.println(s+"="+map.get(s));
			} else {
				System.out.println("Not found");
			}
		}	
		scan.close();
	}
	/*public static void whileStuff() {
		int n = scan.nextInt();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		int i = 0;
		while (i < n) {
			String name = scan.next();
			int phone = scan.nextInt();
			hm.put(name, phone);
			i++;
            scan.nextLine();
		}
		while(scan.hasNext()) {
			String s = scan.nextLine();
			if(hm.containsKey(s)) {
				System.out.println(s+"="+hm.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
		scan.close();
		}	
	}*/	
}
