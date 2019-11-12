package entities;

public class Student {
	public double studentGrade, gradeA, gradeB, gradeC;
	public String nameStudent;
	public Boolean isApproved = false;

	public void checkFinalGrade() {
		studentGrade = gradeA + gradeB + gradeC;
		if (studentGrade >= 60)
			isApproved = true;
	}

	public String toString() {
		if (isApproved == true) {
			return ("FINAL GRADE = " + String.format("%.2f", studentGrade) + "\nPASS");
		} else {
			return ("FINAL GRADE = " + String.format("%.2f", studentGrade) + "\nFAILED\nMISSING "
					+ String.format("%.2f", (60 - studentGrade)) + " POINTS");
		}
	}
}
