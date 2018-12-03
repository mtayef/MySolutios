package algorithm;

public class Solution12 {
	public static void main(String args[]) {
		
	}
}
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student{
	public Student(String firstName,String lastName, int id, int scores[]) {
		
	}
	
	public static char calculate(char grade) {
		
		if(grade>=90 && grade<=100) {
			grade = 'O';
		}else if(grade>=80 && grade<=90) {
			grade = 'E';
		}else if(grade>=70 && grade<80) {
			grade = 'A';
		}else if(grade>=55 && grade <70) {
			grade = 'P';
		}else if(grade>=40 && grade<55) {
			grade = 'D';
		}else {
			grade = 'T';
		}
		return grade;
	}
}
