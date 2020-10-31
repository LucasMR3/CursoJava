package UNASP.CalculoNumerico;

public class NewtonRaphson {

    public static void main(String[] args) {
        double x = 1d;
        boolean stay = true;

        for (int i = 0; stay; i++) {
            String format = "%.4f";
            String lastResult = String.format(format, x);

            x = x - ((Math.pow(2 * x, 3) + Math.pow(3 * x, 2) - 2) / (Math.pow(6 * x, 2) + 6 * x));
            System.out.println("X" + i + " = " + x);

            String result = String.format(format, x);
            stay = !result.equals(lastResult);
        }
        System.out.println("\nResult of X: " + x);
    }
}