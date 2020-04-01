package UNASP.ParImpar;
public class ParImpar {

    //retorna true caso num seja par e false caso contrário
    public boolean isPar(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }

    //retorna true caso num seja impar e false caso contrário
    public boolean isImpar(int num) {
        if (num % 2 != 0)
            return true;
        return false;
    }
}