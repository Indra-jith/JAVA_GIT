public class intro {
    public static void main(String[] args) {
        // // example for integer
        // int a = 5;
        // Integer myInt = Integer.valueOf(a); // BOXING
        // // boxing : converting primitive to wrapper class explicitly
        // System.out.println(myInt); // 5
        // Integer myInt1 = a; // AUTO BOXING// Also works! yay!!
        // // auto boxing : automatic conversion of primitive data type int
        // // its corresponsing wrapper class
        // System.out.println(myInt1); // 5

        // ----------------------------------------

        // Auto UNBOXING
        // the automatic cinversion of primitive data type into its corresponsing
        // wrapper class
        Integer a = 5;
        int x = a;

        // manual unboxing
        int y = a.intValue();
        System.out.println(x); // 5
        System.out.println(y); // 5
    }
}
// Wrapper classes provide us with the mechanism to convert primitive into
// objects
// and objects into primitive