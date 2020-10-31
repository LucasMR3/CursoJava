package basics;

import java.util.Scanner;

public class OperadorBitwise {

	public static void main(String[] args) {
		
		// Uso comum verificar bit
		// & = AND bit a bit FFFV
		// | = OR bit a bit FVVV
		// ^ = XOR bit a bit FVVF
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		int mask = 32;
		int maskBinary = 0b00100000;
		
		if ((n & mask) != 0 && (n & maskBinary) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
			
			sc.close();
		}
		
	}

}
