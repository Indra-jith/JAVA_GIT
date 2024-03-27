/*
 * Errors are different, we can't handle that (syntax errors and all)
 * not concerned about errors (like stack overflow, virtual machine error etc..)
 * Both errors and exceptions are children of Throwable (which is parent of Object)
 */

/*
 * Exceptions -> different types.. for example
   -> Runtime exceptions (focusing on this) -> Arithmetic,null pointer,
      indexOutOfBond(arrayoutofbond,string index out of bond )
   -> class not found
   -> io exception(input output exceptions)
   -> etc..
 */

/*
 * Unchecked (runtime exceptions) -> not complusory to handle this
 * All of exceptions which are not Runtime exceptions -> Checked (WE HAVE TO HANDLE THIS!)
 */

public class exception_2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            // arr[6] = 100 / 1;
        } catch (ArithmeticException e) {
            System.out.println("In arithmetic block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In array exception block");
        } catch (Exception e) // for the other all exceptions
        {
            System.out.println("In Exception block");
        }
        // finally block -> gets executed regardless of whether exception occurs/handled
        // or not
        finally {
            System.out.println("Undefeated");
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
/*
 * Basically,
 * try...exception occured.. jumpts to catch..then to finally
 * try...no exception..no catch block..then to finally..
 */