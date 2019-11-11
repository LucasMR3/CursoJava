package entities;

public class Rectangle {

	public double widht, height;

	public double Area() {
		return widht * height;
	}

	public double Perimeter() {
		return 2 * widht + 2 * height;
	}

	public double Diagonal() {
		return Math.sqrt((widht * widht) + (height * height));
	}
}