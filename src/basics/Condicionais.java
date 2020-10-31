package basics;

import java.util.Scanner;

public class Condicionais {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		System.out.println("Horario em else-if, digite: ");
		int horario = sc.nextInt();

		if (horario > 5 && horario <= 12) {
			System.out.println("Bom dia");
		} else if (horario > 12 && horario < 18) {
			System.out.println("Boa tarde");
		} else if (horario > 18 && horario < 24) {
			System.out.println("Boa noite");
		} else if (horario >= 0 && horario <= 5) {
			System.out.println("Boa madrugada");
		} else {
			System.out.println("Horario não reconhecido");
		}

		System.out.println("Dias Switch Case, digite:");
		int dias = sc.nextInt();

		switch (dias) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda");
			break;

		case 3:
			System.out.println("Terça");
			break;

		default:
			System.out.println("Dia não reconhecido");
			break;
		}
		
		System.out.println("preco ternario, digite: ");
		int preco = sc.nextInt();
		
		double juros = (preco < 20)? preco * 1.1 : preco * 1.2;
		// operador ternario true:false
		
		System.out.println(juros);
		
		sc.close();
	}
}
