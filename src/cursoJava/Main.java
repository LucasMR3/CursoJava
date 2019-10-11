package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Olá mundo!");
		// print sem ln eh sem quebra de linha
		System.out.println("Bom dia");

		//int camelCase  
		
		int y = 32;
		System.out.println(y);

		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.1f\n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros\n", x);

		Locale.setDefault(Locale.ITALY);		
		
		String nome = "Lucas";
		int idade = 19;
		double altura = 1.75;
		char sexo = 'M';
		double renda = 5000.00;

		System.out.printf("%s tem %d anos, %.2f altura, ganha R$ %.2f e eh %s\n", nome, idade, altura, renda, sexo);
		
		
		int a = 5, b = 2;
		double resultado;
		
		resultado = a/b;
		System.out.println(resultado);
		
		resultado = (double) a/b; //casting
		System.out.println(resultado);
			
		a = (int) resultado;
		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		String xx;
		
		xx = sc.next();
		
		System.out.println("Você digitou: " + xx);
		
		
		int xy;
		
		xy = sc.nextInt();		
		System.out.println("Você digitou: " + xy);
		
		double xdouble;
		
		xdouble = sc.nextDouble();		
		System.out.println("Você digitou: " + xdouble);
		
		char charx;
		charx = sc.next().charAt(0);
		System.out.println("Você digitou: " + charx);		
			
		
		
		
				
		sc.close();	
		}

}
