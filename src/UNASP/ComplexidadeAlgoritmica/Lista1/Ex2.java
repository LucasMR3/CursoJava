package UNASP.ComplexidadeAlgoritmica.Lista1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Resultado eh: " + algorithm(n));
    }

    private static Double algorithm(int n){
        double result = 1;
        if(n > 1){
             result = n * algorithm(n -1);
        }
            return result;
    }
}
