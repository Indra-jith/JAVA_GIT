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
        System.out.print("\n");
        /*
         * (upside down pyramid)
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        /*
         * (pyramid)
         */
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Inner loop for leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }

            // Inner loop for increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d ", j);
            }

            // Inner loop for decreasing numbers
            for (int j = i - 1; j > 0; j--) {
                System.out.printf("%2d ", j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
