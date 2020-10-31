package UNASP.ComplexidadeAlgoritmica;

public class Complexidade2 {
    public static void main(String[] args) {

        int n = 40;
        int r = 1;
        int aux = 0;

        for (int i = 2; i < n; i++){
            for (int j = 1; j <= n; j++){
                aux++;
            }
        }
        System.out.println(aux);
    }
}
