package UNASP.CalculoNumerico;

public class NewtonRaphson {

    public static void main(String[] args) {
        double x = 0.5d;
        boolean stay = true;

        for (int i = 0; stay; i++) {
            String format = "%.4f";
            String lastResult = String.format(format, x);

            x = x - ((2 * Math.pow(x, 3) + 3 * Math.pow(x, 2) - 2) / (6 * Math.pow(x, 2) + 6 * x));
            System.out.println("X" + i + " = " + x);

            String result = String.format(format, x);
            stay = !result.equals(lastResult);
        }
        System.out.println("\nResult of X: " + x);
    }
}