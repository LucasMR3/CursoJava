package application;

import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student student = new Student();
		
		student.nameStudent = sc.nextLine();
		student.gradeA = sc.nextDouble();
		student.gradeB = sc.nextDouble();
		student.gradeC = sc.nextDouble();

		student.checkFinalGrade();
		System.out.println(student);
		
		sc.close();
	}
}
