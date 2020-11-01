package UNASP.CalculoNumerico;


public class BisectionExample {

    public static void main(String[] args) {

        double x = 0;
        double via = 0.001;
        double vib = 0.1;
        double fa = 0;
        double fb = 0;
        double fx = 0;

        int contador = 0;
        boolean continuar = true;

        while (continuar) {
            x = (via + vib) / 2;
            fa = funcao(via);
            fb = funcao(vib);
            fx = funcao(x);

            if (fa * fx >= 0) {
                via = x;
            } else {
                vib = x;
            }
            contador = contador + 1;

            if ((Math.abs(vib - via)) < 1.e-12 || (Math.abs(fx)) < 1.e-12) {
                continuar = false;
            }
        }
        System.out.println("x =  " + x);
        System.out.println("numero de iteracoes igual a " + contador);
    }

    private static double funcao(double v) {
        double p = 3.5e7;
        double n = 1000;
        double k = 1.3806503e-23;
        double t = 300;
        double a = 0.401;
        double b = 42.7e-6;

        double p1 = p + ((a * n * n) / (v * v));
        double p2 = (v - (n * b));

        return (p1 * p2) - k * n * t;
    }
}

