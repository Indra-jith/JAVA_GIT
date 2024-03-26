/*
 * Errors are different, we can't handle that (syntax errors and all)
 */
public class exception_2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[6] = 100 / 1;
        } catch (ArithmeticException e) {
            System.out.println("In arithmetic block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In array exception block");
        } catch (Exception e) // for the other all exceptions
        {
            System.out.println("In Exception block");
        }
        // these all are runtime exceptions
        /*
         * Note : Exceptions that need to be handled for sure -> Checked exceptions
         * example : thread one and all
         * 
         * Unchecked : even if we don't handle it, program runs and throws an
         * exceptions. That's it
         * example : in given code (above)
         */
    }

}
