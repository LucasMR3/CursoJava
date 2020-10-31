package UNASP.ComplexidadeAlgoritmica;

import java.util.Scanner;

public class Complexidade1 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = (n / 2);
            int aux = 0;
            for (int i = 1; i <= k; i++) {
                aux++;
            }
            System.out.println(aux);
        }
    }

//    private int swap (int a1, int a2){
//        int temp;
//        temp = a1;
//        a1 = a2;
//        a2 = temp;
//        return temp;
//    }

//    private swapNumbers()
}
