package cursoJava;

import java.util.Scanner;

public class EstruturasRepetitivas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 10;
		System.out.printf("Digite 0 e pare!\n");
		while (x != 0) {
			x = sc.nextInt();
		}

		System.out.printf("Digite o numero de repeticoes: ");

		x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}

		do {
			System.out.printf("Digite 5 e pare: ");
			x = sc.nextInt();	
		} while (x != 5);

		sc.close();
	}

}
