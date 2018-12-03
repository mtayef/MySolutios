package hackerRankSolutions;

public class Day12 {
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNum;

	public Person(String fName, String lName, int id) {
		this.firstName = fName;
		this.lastName = lName;
		this.idNum = id;
	}
}

class Student extends Person {
	private int[] testScores;

	public Student(String fName, String lName, int id, int scores[]) {
		super(fName, lName, id);
		this.testScores = scores;
	}

	public static char calculate(int points) {
		char grade = 0;
		if (points >= 90 && points <= 100) {
			grade = 'O';
		} else if (points >= 80 && points <= 90) {
			grade = 'E';
		} else if (points >= 70 && points < 80) {
			grade = 'A';
		} else if (points >= 55 && points < 70) {
			grade = 'P';
		} else if (points >= 40 && points < 55) {
			grade = 'D';
		}else {
			grade = 'T';
		}
		return grade;
	}

}
