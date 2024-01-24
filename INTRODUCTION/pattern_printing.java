public class pattern_printing {
    public static void main(String[] args) {
        // ---------------------------------------------------
        /*
        
         ****
         ****
         ****
         ****
        
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // --------------------------------------------------
        /*
        
         *
         **
         ***
         ****
         
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // ----------------------------------------------------

        /*
         * 0
         * 01
         * 012
         * 0123
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // ----------------------------------------------------

        /*
        
         *****
         ****
         ***
         **
         *
         
         */

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // OR
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        /*
        
         *****
          ****
           ***
            **
             *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
