package UNASP.ImcControl;

public class Avaliacao {
    private float peso;
    private float altura;
    private float indice;

    public Avaliacao(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float indice() {
        return peso / (altura * altura);
    }

    public String classificacao() {
        if (indice() < 18.0) {
            return "MAGRO";
        } else if (indice() >= 18.0 && indice() <= 30.0) {
            return "Equilibrado";
        }else{
            return "OBESO";
        }
    }
}