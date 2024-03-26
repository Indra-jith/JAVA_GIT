/*
 * Exception Handling -> In this we handle runtime errors and to
 * maintain the normal flow of the application
 * 
 * try{
 * // code to handle (exception code)
 * }
 * catch(Exception e){
 * // handle it
 * }
 * 
 * //NOTE - Throwable is the main class(parent of everyone), exception is its sub class
 * 
 * try -> it is used to specify a block where we should place an exception code,
 * it should be followed by a catch block
 */
public class exception_handling {
    public static void main(String[] args) {

        // System.out.println("hello");
        // int a = 2 / 0;
        // System.out.println(a);
        // System.out.println("ending");
        // /*
        // * hello
        // * Exception in thread "main" java.lang.ArithmeticException: / by zero
        // * (nothing, ending is not there )
        // * (after error, all the lines will not be executed)
        // */
        // identify the part of code where exception can occur
        try {
            int a = 2 / 0;
        }
        // catch (Exception e) { // catch all exceptions(generally) in e
        // System.out.println("In catch block " + e);
        // }
        catch (ArithmeticException e) {
            System.out.println("hi"); // only this will be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hellulu");
        }
        System.out.println("Ending (after exception encountered)"); // this will work now

        /*
         * We should not put unnecessary code in try block
         * because once an exception is encountered in try block, it directly
         * jumps to exception block
         */
    }
}
