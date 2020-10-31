package UNASP.ComplexidadeAlgoritmica;

public class Complexidade3 {

    public static void main(String[] args) {

        int n = 10;
        int r = 1;
        int aux = 0;

        for (int i = 2; i < n; i++){
            for (int j = i + 1; j > 1; j--){
                aux++;
            }
        }
        System.out.println(aux);
    }

}
