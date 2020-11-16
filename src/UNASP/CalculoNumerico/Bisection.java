package UNASP.CalculoNumerico;

public class Bisection {
    public static void main(String[] args) {
        double rootA = 0, rootB = 1, variation = 0.01;

        bisectionMethod(rootA, rootB, variation);
    }

    private static void bisectionMethod(double rootA, double rootB, double variation) {
        double bisection, functionA, functionB, bisectionSolved;

        functionA = mathEquation(rootA);
        functionB = mathEquation(rootB);

        // Se o resultado de f(a) * f(b) > 0 não existem raizes reais pelo Toerema de Bolzano
        if (functionA * functionB > 0) {
            System.out.println("Não existem raizes reais para essa equação.");
            return;
        }

        for (int i = 1; Math.abs((rootB - rootA)) > variation; i++) {
            bisection = (rootA + rootB) / 2;
            bisectionSolved = mathEquation(bisection);
            if (functionA * bisectionSolved < 0) { // Valor negativo fica na primeira parte
                rootB = bisection;
            } else { // Valor positivo vai pra segunda parte
                rootA = bisection;
                functionA = bisectionSolved;
            }
            System.out.println("\nIteração #" + i);
            System.out.println("Raiz A = " + rootA + " | Root B = " + rootB);
            System.out.print("Resultado = " + (rootA + rootB) / 2 + "\n");
        }
        System.out.println("\nRaiz aproximada = " + String.format("%.3f", (rootA + rootB) / 2));
    }

    private static double mathEquation(double variable) {
        return Math.pow(variable, 3) - (9 * variable) + 3;
    }
}