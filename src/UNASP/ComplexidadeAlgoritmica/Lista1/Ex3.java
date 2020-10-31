package UNASP.ComplexidadeAlgoritmica.Lista1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vet = new int [n];
        for (int i = 0; i<n; i++){
            vet[i] = i;
        }

        int sol = algorithm(n, vet);

        System.out.println("Resultado eh: " + sol );
    }

    private static Integer algorithm(int numb, int[] vet2) {
        System.out.println(numb + vet2.length);

        int minusN = 2;
        if (numb >= 0){
            minusN = numb -1;
        }
        int[] vetTemp = new int[minusN];

        if (numb ==  0) {
            for (int i = 0; i < minusN; i++) {
                vetTemp[i] = i;
            }
        }

        int s = 0;
        if (numb != 0){
            s = algorithm(minusN, vetTemp) + vet2[numb];
        }
        return s;
    }
}
