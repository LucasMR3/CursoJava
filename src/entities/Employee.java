package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary = grossSalary - tax;

	}

	public double increaseSalary(double value) {
		return grossSalary = ((value/100) * (grossSalary + tax) + (grossSalary));
	}

	public String toString() {
		return (name + ", $ " + String.format("%.2f", grossSalary));
	}
}
