package entities;

public class Triangle {
	public double a, b, c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

/*************************
 * Reaproveitamento de código: Eliminamos código repetido do programa
 * Delegação de Responsabilidades: O próprio triângulo é responsável pelo seu
 * cálculo
 ************************/