package UNASP.CalculoNumerico;

public class Bisection {
    public static void main(String[] args) {
        double rootA = 0, rootB = 1, result, variation = 0.01;

        result = bisectionMethod(rootA, rootB, variation);

        System.out.println("Raiz aproximada: " + String.format("%.3f", result));
    }

    static double bisectionMethod(double rootA, double rootB, double variation) {
        double bisection, functionA, functionC;

        functionA = functionToApply(rootA);

        while (Math.abs((rootB - rootA)) > variation) {
            bisection = (rootA + rootB) / 2;
            functionC = functionToApply(bisection);
            if (functionA * functionC < 0) {
                rootB = bisection;
            } else {
                rootA = bisection;
                functionA = functionC;
            }
        }
        return (rootA + rootB) / 2;
    }

    static double functionToApply(double variable) {
        return Math.pow(variable, 3) - ( 9 * variable ) + 3;
    }
}