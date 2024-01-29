public class loops {
    public static void main(String[] args) {
        // -----------------------------------------------------------------
        // WHILE loop
        /*
         * while(//condition)
         * {
         * //code
         * }
         */
        // int i = 0;
        // while(i<5)
        // {
        // System.out.println("Hello world "+i); //will print hello world 5 times
        // i++; // from 0 to 4
        // //once it becomes 5 the loop stops
        // }
        // -------------------------------------------------------------------
        // DO WHILE
        // run code once then only it checks the condition

        /*
         * do{
         * //code
         * 
         * } while(//condition)
         */
        // int i = 0;
        // do{
        // System.out.println("Hello world "+i); //will print hello world 5 times
        // i++;
        // }while(i<5);
        // --------------------------------------------------------------------
        // FOR LOOP
        /*
         * for(starting condn;condition;increment/decrement)
         * {
         * //content
         * }
         */
        // for(int i=0;i<5;i++)
        // {
        // System.out.println("Hello world "+i);
        // }

        for (int i = 0; i < 10; i++) {
            // if (i == 5) break;// jump out of the loop
            if (i == 5)
                continue; // skips 5 and prints the rest
            System.out.println(i);
        }
    }
}
