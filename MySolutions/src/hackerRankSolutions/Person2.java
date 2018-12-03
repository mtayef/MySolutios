package hackerRankSolutions;

import java.util.Scanner;

//day 4
public class Person2 {
	private int age;
	private static Scanner scan = new Scanner(System.in);
	
	public Person2(int initialAge) {
		age = initialAge;
		if (initialAge < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}
	public static void main(String args[]) {
		int n = scan.nextInt();
		Person2 p = new Person2(n);
		p.amIOld();
		scan.close();
	}
}