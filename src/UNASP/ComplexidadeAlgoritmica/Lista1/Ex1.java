package UNASP.ComplexidadeAlgoritmica.Lista1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Resultado eh: " + algorithm(n));
    }

    private static int algorithm(int n){
        if(n == 1){
            return 2;
        } else {
            return 2 * algorithm(n -1);
        }
    }
}
