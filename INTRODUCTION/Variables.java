/*
 * DATATYPES - 
 * Non primitive -> Arrays,class..
 
 * Primitive -> boolean (true/false)
             -> Char (single character 'a' single quote)
             -> Integers (int,long,short,byte) 
                           4   8     2    1   <- size in bytes
             note :  byte only uses 1 byte and can represent -128 to 127
             -> Floating points (float,double)
                                   4     8   <- size in bytes


 */

public class Variables {
    public static void main(String[] args) {
        // int num1 = 5;
        // int num2 = 10;
        // int result = num1+num2;
        // System.out.println(result); //15

        // float num3 = 10.5f; //without f -> treats as double by default
        // byte num4 = 11;
        // double num5 = 11.111111;
        // long num6 = 1321;
        // boolean val = true;
        // System.out.println(val);

        /*
         * TYPECASTING -> two types
         * One happens automatically (smaller to larger) [byte->short->int->long]
         * smaller box fits in larger box automatically -> WIDENING CASTING
         * One happens manually (example: long->int->short->byte)
         * NARROWING CASTING
         */

        // int myInt = 10;
        // double myDouble = myInt; //automatic casting
        // System.out.println(myDouble); //10.0 --No problemo!

        double myDouble = 3.14567;
        // int myInt = myDouble; //error (we have to do it forcefully)
        int myInt = (int) myDouble; // --> FORCED/MANUAL/NARROWING
        System.out.println(myInt); // 3

    }
}
