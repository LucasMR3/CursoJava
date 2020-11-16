package UNASP.CalculoNumerico;

public class Bisection {
    public static void main(String[] args) {
        double rootA = 0, rootB = 1, result, variation = 0.01;

        result = bisectionMethod(rootA, rootB, variation);

        System.out.println("\nRaiz aproximada = " + String.format("%.3f", result));
    }

    private static double bisectionMethod(double rootA, double rootB, double variation) {
        double bisection, functionA, bisectionSolved;

        functionA = mathEquation(rootA);

        for (int i = 1; Math.abs((rootB - rootA)) > variation; i++) {
            bisection = (rootA + rootB) / 2;
            bisectionSolved = mathEquation(bisection);
            if (functionA * bisectionSolved < 0) { // Valor negativo fica na primeira parte
                rootB = bisection;
            } else { // Valor positivo vai pra segunda parte
                rootA = bisection;
                functionA = bisectionSolved;
            }
            System.out.println("\nInteração #" + i);
            System.out.println("Raiz A = " + rootA + " | Root B = " + rootB);
            System.out.print("Resultado = " + (rootA + rootB) / 2 + "\n");
        }
        return (rootA + rootB) / 2;
    }

    private static double mathEquation(double variable) {
        return Math.pow(variable, 3) - (9 * variable) + 3;
    }
}