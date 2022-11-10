package entities;

public class Student {
	public int grade1;
	public int grade2;
	public int grade3;
	
	public int finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void gradeChecking() {
		if (grade1 < 0 || grade1 > 30) {
			System.out.println("The first grade is invalid, please try again!");
		}
		else if (grade2 < 0 || grade2 > 35) {
			System.out.println("The second grade is invalid, please try again!");
		}
		else if (grade2 < 0 || grade2 > 35) {
			System.out.println("The third grade is invalid, please try again!");
		}
	}
	
	public int missingGrade() {
		int finalGrade = grade1 + grade2 + grade3;
		if ( finalGrade < 60) {
			int missingGrade = 60 - finalGrade;
		}
		return missingGrade();
	}
}
