package cursoJava;

public class EquacoesJava {

	public static void main(String[] args) {
		
		double x  = 3.0;
		double y = 2.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		C = Math.sqrt(25.0); //raiz quadrada
		System.out.println(C);
		
		B = Math.pow(x, y); //potenciacao
		System.out.println(B);
		
		A = Math.abs(z); // gerar valor absoluto
		System.out.println(A);
		
	}
}
