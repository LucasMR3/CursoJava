package cursoJava;

public class BoxingAndWrapperClasses {

    public static void main(String[] args) {
        int x = 20;
        Object obj = x; // boxing
        System.out.println(x);

        int y = (int) obj; // unboxing
        System.out.println(y);

        /// WRAPPER CLASSES ///

        Integer obj2 = x; // wrapper, allow a NULL value

        int y2 = obj2 * 2;
        System.out.println(y2);
    }
}
