// THROW -- basically for custom exceptions
public class exception_3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try {
            b = 10 / a; // no error (it is normal division)
            // but we want to throw an exception (acc to our condition)
            if (b == 0) {
                throw new ArithmeticException("Zero as an output is not acceptable");
            }
        } catch (ArithmeticException e) {
            // b = 100 / 1;
            System.out.println(e);
            // java.lang.ArithmeticException: Zero as an output is not acceptable
        }
        System.out.println("The End");
        // make sure if you create an exception of specific type
        // you catch that exception, otherwise it breaks the code
    }
}
