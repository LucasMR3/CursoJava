package basics;

import java.util.Scanner;

public class JavaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, aux;

		System.out.printf("Digite o valor a ser somado 5x em While: ");
		x = sc.nextInt();

		aux = 0;
		while (aux < 5) {
			x++;
			System.out.printf("O valor eh: %d \n", x);
			aux++;
		}

		System.out.printf("\nDigite o valor a ser somado 5x em FOR: ");
		x = sc.nextInt();

		for (aux = 0; aux < 5; aux++) {
			x++;
			System.out.printf("O valor eh: %d\n", x);
		}
		sc.close();
	}

}
