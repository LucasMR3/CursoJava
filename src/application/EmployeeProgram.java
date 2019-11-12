package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee(); 
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble(); 
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		employee.netSalary();
		
		System.out.println("Data: " + employee);
			
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		employee.increaseSalary(increase);
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
