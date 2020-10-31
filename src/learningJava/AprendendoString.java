package learningJava;
import java.util.Scanner;

public class AprendendoString {

	private static Scanner sc;

	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine(); // limpar buffer de leitura
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
		sc.close();
	}
}
